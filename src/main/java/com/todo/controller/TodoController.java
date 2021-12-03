package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todo.businessbean.TodoBean;
import com.todo.exception.UserNotFoundException;
import com.todo.service.TodoService;

@RestController
@RequestMapping(value = "/api/todos")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<List<TodoBean>> getAllTodos(){
		List<TodoBean> response = todoService.getAllTodos();
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Len", Integer.toString(response.size()));
		return new ResponseEntity<List<TodoBean>>(response, responseHeaders, HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	ResponseEntity<Integer> createTodo(@RequestBody TodoBean todoBean) {
		 Integer response = todoService.createTodo(todoBean);
		 return new ResponseEntity<Integer>(response, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<TodoBean> getTodo(@PathVariable Integer id) {
		TodoBean response = todoService.getTodo(id);
		if(response == null) throw new UserNotFoundException("not found - " + id);
		return new ResponseEntity<TodoBean>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<TodoBean> updateTodo(@PathVariable Integer id, @RequestBody TodoBean bean) {
		TodoBean response = todoService.updateTodo(id, bean);
		return new ResponseEntity<TodoBean>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Integer> deleteTodo(@PathVariable Integer id) {
		Integer response = todoService.deleteTodo(id);
		return new ResponseEntity<Integer>(response, HttpStatus.OK);
	}
	
}
