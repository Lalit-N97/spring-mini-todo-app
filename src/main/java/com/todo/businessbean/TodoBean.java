package com.todo.businessbean;

import java.util.Date;

public class TodoBean {
	private Long todoId;
	private String todoTask;
	private Date todoCreateDate;
	
	public Long getTodoId() {
		return todoId;
	}
	public void setTodoId(Long todoId) {
		this.todoId = todoId;
	}
	public String getTodoTask() {
		return todoTask;
	}
	public void setTodoTask(String todoTask) {
		this.todoTask = todoTask;
	}
	public Date getTodoCreateDate() {
		return todoCreateDate;
	}
	public void setTodoCreateDate(Date todoCreateDate) {
		this.todoCreateDate = todoCreateDate;
	}
	
}
