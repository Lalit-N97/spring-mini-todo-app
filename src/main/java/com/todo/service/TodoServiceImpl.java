package com.todo.service;

import java.util.ArrayList;
import java.util.List;

import com.todo.businessbean.TodoBean;

public class TodoServiceImpl implements TodoService{

	private List<TodoBean> todoBeans;
	
	public TodoServiceImpl() {
		todoBeans = new ArrayList();
		TodoBean todoBean = new TodoBean();
		todoBean.setTodoId(1L);
		todoBeans.add(todoBean);
	}
	
	@Override
	public List<TodoBean> getAllTodos() {
		return todoBeans;
	}

	@Override
	public Long createTodo(TodoBean bean) {
		bean.setTodoId((long)todoBeans.size());
		todoBeans.add(bean);
		return bean.getTodoId();
	}

	@Override
	public TodoBean getTodo(TodoBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TodoBean updateTodo(TodoBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long deleteTodo(TodoBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

}
