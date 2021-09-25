package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todo.businessbean.TodoBean;
import com.todo.service.TodoService;

@RestController
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	List<TodoBean> getAllTodos(){
		return todoService.getAllTodos();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	Long createTodo(@RequestBody TodoBean todoBean) {
		return todoService.createTodo(todoBean);
	}
	
}
