package com.restapis.withdatabase.services;

import com.restapis.withdatabase.model.Todo;
import com.restapis.withdatabase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImp implements Todoservice {


    @Autowired
    private TodoRepository todorepo;

    @Override
    public Todo createtodo(Todo todo){
        Todo newtodo=todorepo.save(todo);
        return newtodo;
    }
//Two ways to get a object by using id
    //1st way
//    @Override
//    public Optional<Todo> gettodobyid(int id){
//        Optional<Todo> getbyid=todorepo.findById(id);
//                return getbyid;
//    }

    //2nd way
    @Override
    public Todo gettodobyid(int id){
        Todo getbyid=todorepo.findById(id).orElse(null);
        return getbyid;
    }
    @Override
    public List<Todo> getalltodo(){
        List<Todo> alltodo=todorepo.findAll();
        return alltodo;
    }

    @Override
    public Todo update(int id, String todo) {
        Todo update=todorepo.findById(id).orElse(null);
        update.
    }

    @Override
    public String delete(int id) {
        todorepo.deleteById(id);
        return "deleted successfully";
    }
}
