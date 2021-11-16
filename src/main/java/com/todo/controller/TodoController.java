package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todo.businessbean.TodoBean;
import com.todo.service.TodoService;

@RestController
@RequestMapping(value = "/api/todos")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	List<TodoBean> getAllTodos(){
		return todoService.getAllTodos();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	Integer createTodo(@RequestBody TodoBean todoBean) {
		return todoService.createTodo(todoBean);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	TodoBean getTodo(@PathVariable Integer id) {
		return todoService.getTodo(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	TodoBean updateTodo(@PathVariable Integer id, @RequestBody TodoBean bean) {
		return todoService.updateTodo(id, bean);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	Integer deleteTodo(@PathVariable Integer id) {
		return todoService.deleteTodo(id);
	}
	
}
