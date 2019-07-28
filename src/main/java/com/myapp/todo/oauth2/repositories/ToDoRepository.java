package com.myapp.todo.oauth2.repositories;

import com.myapp.todo.oauth2.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo,String> {
}
