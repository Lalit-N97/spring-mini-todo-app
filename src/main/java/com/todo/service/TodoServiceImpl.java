package com.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.businessbean.TodoBean;

@Service
public class TodoServiceImpl implements TodoService{

	static Integer id = 1;
	private List<TodoBean> todoBeans;
	
	public TodoServiceImpl() {
		todoBeans = new ArrayList();
		TodoBean todoBean = new TodoBean();
		for (int i = 0; i < 3; i++) {
			todoBean.setTodoId(id++);
			todoBean.setTodoTask("complete hard problem");
			todoBean.setTodoCreateDate(new Date());
			todoBeans.add(todoBean);
		}
	}
	
	@Override
	public List<TodoBean> getAllTodos() {
		return todoBeans;
	}

	@Override
	public Integer createTodo(TodoBean bean) {
		bean.setTodoId(id++);
		bean.setTodoTask(bean.getTodoTask());
		bean.setTodoCreateDate(new Date());
		todoBeans.add(bean);
		return bean.getTodoId();
	}

	@Override
	public TodoBean getTodo(TodoBean bean) {
		for(TodoBean todoBean : todoBeans) {
			if(todoBean.getTodoId() == bean.getTodoId()) return todoBean;
		}
		return null;
	}

	@Override
	public TodoBean updateTodo(TodoBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteTodo(TodoBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

}
