package com.todo.service;

import java.util.List;

import com.todo.businessbean.TodoBean;

public interface TodoService {
	
	List<TodoBean> getAllTodos();
	
	Integer createTodo(TodoBean bean);
	
	TodoBean getTodo(Integer id);
	
	TodoBean updateTodo(Integer id, TodoBean bean);
	
	Integer deleteTodo(Integer id);
}
