package com.todo.businessbean;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class TodoBean {
	
	@NotNull
	@Positive
	private Integer todoId;
	
	@Size(min=3, max=100)
	private String todoTask;
	
	private Date todoCreateDate;
	private Boolean isDone;
	
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
	public Boolean getIsDone() {
		return isDone;
	}
	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}
	
}
