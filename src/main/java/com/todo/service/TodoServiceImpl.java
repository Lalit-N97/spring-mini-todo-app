package com.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.businessbean.TodoBean;

@Service
public class TodoServiceImpl implements TodoService{

	private Integer id = 1;
	private List<TodoBean> todoBeans;
	
	public TodoServiceImpl() {
		todoBeans = new ArrayList();
		TodoBean todoBean = new TodoBean();
		for (int i = 0; i < 3; i++) {
			todoBean.setTodoId(id++);
			todoBean.setTodoTask("complete hard problem");
			todoBean.setTodoCreateDate(new Date());
			todoBean.setIsDone(false);
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
		bean.setIsDone(false);
		todoBeans.add(bean);
		return bean.getTodoId();
	}

	@Override
	public TodoBean getTodo(Integer id) {
		for(TodoBean todoBean : todoBeans) {
			if(id == todoBean.getTodoId()) return todoBean;
		}
		return null;
	}

	@Override
	public TodoBean updateTodo(Integer id, TodoBean bean) {
		for(int i = 0; i < todoBeans.size(); i++) {
			if(id == todoBeans.get(i).getTodoId()) {
				bean.setTodoId(id);
				bean.setTodoCreateDate(todoBeans.get(i).getTodoCreateDate());
				bean.setIsDone(false);
				todoBeans.set(i, bean);
				return todoBeans.get(i);
			}
		}
		return null;
	}

	@Override
	public Integer deleteTodo(Integer id) {
		for(TodoBean todoBean : todoBeans) {
			if(id == todoBean.getTodoId()) {
				todoBeans.remove(todoBean);
				return 1;
			} 
		}
		return 0;
	}

}
