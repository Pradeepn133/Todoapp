package com.restapis.withdatabase.repository;

import com.restapis.withdatabase.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Integer> {
}

