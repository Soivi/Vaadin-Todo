package com.example.tokka;

import java.util.ArrayList;

public class TodoList {
	private String listname;
	private ArrayList<Todo> todoArray;
	
	public TodoList(String listname) {
		this.listname = listname;
		this.todoArray = new ArrayList<Todo>();
	}

	public String getListname() {
		return listname;
	}

	public void setListname(String listname) {
		this.listname = listname;
	}

	public ArrayList<Todo> getTodoArray() {
		return todoArray;
	}

	public void setTodoArray(ArrayList<Todo> todoArray) {
		this.todoArray = todoArray;
	}
	
	public void addTodo(Todo todo){
		this.todoArray.add(todo);
	}
	
}
