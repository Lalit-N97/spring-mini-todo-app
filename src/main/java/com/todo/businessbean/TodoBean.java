package com.todo.businessbean;

import java.util.Date;

public class TodoBean {
	private Integer todoId;
	private String todoTask;
	private Date todoCreateDate;
	
	public Integer getTodoId() {
		return todoId;
	}
	public void setTodoId(Integer todoId) {
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
