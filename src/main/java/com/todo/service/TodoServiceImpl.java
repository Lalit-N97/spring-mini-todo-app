package com.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.businessbean.TodoBean;
import com.todo.dao.TodoRepository;
import com.todo.entity.TodoEntity;
import com.todo.exception.UserNotFoundException;

@Service
public class TodoServiceImpl implements TodoService{

	@Autowired
	private TodoRepository todoRepo;
	
	@Override
	public List<TodoBean> getAllTodos() {
		List<TodoEntity> entityList = todoRepo.findAll();
		if(entityList == null) throw new UserNotFoundException("not found ");
		List<TodoBean> beanList = new ArrayList<TodoBean>();
		entityList.forEach(entity -> beanList.add(convertEntityToBean(entity)));
		return beanList;
	}

	@Override
	public Integer createTodo(TodoBean bean) {
		TodoEntity entity = todoRepo.save(convertBeanToEntity(bean));
		return entity.getTodoId();
	}
	
	public boolean createTodos(List<TodoBean> beanList) {
		List<TodoEntity> entityList = beanList.stream().map(e -> convertBeanToEntity(e)).collect(Collectors.toList());
		todoRepo.saveAll(entityList);
		return true;
	}
	
	@Override
	public TodoBean getTodo(Integer id) {
		Optional<TodoEntity> entity = todoRepo.findById(id);
		if(!entity.isPresent()) throw new UserNotFoundException("not found - " + id);
		// optional way
		return Optional.ofNullable(convertEntityToBean(entity.get())).orElse(null);
		// old way
//		return entity.isPresent() ? convertEntityToBean(entity.get()) : null; 
	}

	@Override
	public TodoBean updateTodo(Integer id, TodoBean bean) {
		TodoEntity entity = todoRepo.findById(id).orElse(null);
		entity.setTodoTask(bean.getTodoTask());
		entity.setIsDone(bean.getIsDone());
		entity.setTodoCreateDate(bean.getTodoCreateDate());
		return convertEntityToBean(entity);
	}

	@Override
	public Integer deleteTodo(Integer id) {
		todoRepo.deleteById(id);
		return 1;
	}
	
	private TodoEntity convertBeanToEntity(TodoBean bean) {
		TodoEntity entity = new TodoEntity();
		entity.setTodoId(bean.getTodoId());
		entity.setTodoTask(bean.getTodoTask());
		entity.setIsDone(bean.getIsDone());
		entity.setTodoCreateDate(bean.getTodoCreateDate());
		return entity;
	}
	
	private TodoBean convertEntityToBean(TodoEntity entity) {
		TodoBean bean = new TodoBean();
		bean.setTodoId(entity.getTodoId());
		bean.setTodoTask(entity.getTodoTask());
		bean.setIsDone(entity.getIsDone());
		bean.setTodoCreateDate(entity.getTodoCreateDate());
		return bean;
	}

}
