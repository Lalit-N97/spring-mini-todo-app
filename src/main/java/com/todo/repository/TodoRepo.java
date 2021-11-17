package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.entity.TodoEntity;

@Repository
public class TodoRepo implements JpaRepository<TodoEntity, Integer>{

}
