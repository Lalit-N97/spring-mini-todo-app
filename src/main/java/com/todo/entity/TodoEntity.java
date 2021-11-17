package com.todo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TodoEntity {
	@Id
	private Integer todoId;
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
