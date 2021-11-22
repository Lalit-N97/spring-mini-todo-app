package com.todo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer>{

}
