package com.restapis.withdatabase.services;

import com.restapis.withdatabase.model.Todo;

import java.util.List;

public interface Todoservice {
    public Todo createtodo(Todo todo);
    public Todo gettodobyid(int id);
    public List<Todo> getalltodo();
    public Todo update(int id,String todo);
    public String delete(int id);
}
