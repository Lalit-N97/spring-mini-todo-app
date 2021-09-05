package com.todo.service;

import java.util.List;

import com.todo.businessbean.TodoBean;

public interface TodoService {
	
	List<TodoBean> getAllTodos();
	
	Long createTodo(TodoBean bean);
	
	TodoBean getTodo(TodoBean bean);
	
	TodoBean updateTodo(TodoBean bean);
	
	Long deleteTodo(TodoBean bean);
}
