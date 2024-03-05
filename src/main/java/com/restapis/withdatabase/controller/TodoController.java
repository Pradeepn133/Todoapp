package com.restapis.withdatabase.controller;

import com.restapis.withdatabase.model.Todo;
import com.restapis.withdatabase.services.TodoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoServiceImp service;

    @PostMapping("/create")
    public Todo create(@RequestBody Todo todo) {
        return service.createtodo(todo);
    }

    @GetMapping("/getall")
    public List<Todo> getall(){
        return service.getalltodo();
    }

    @GetMapping("/getbyid")
    public Todo getbyid(@RequestParam int id){
        return service.gettodobyid(id);
    }

    @DeleteMapping("delete")
    public String deleteitem(@RequestParam int id){
        return service.delete(id);
    }

}
