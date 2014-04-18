package com.example.tokka;

import java.util.ArrayList;

public class TodoManager {
	static ArrayList<TodoList> todolists;
	
	static void Initialize() {
		todolists = new ArrayList<TodoList>();
		
		TodoList shoppingList = new TodoList("Shopping List");
		shoppingList.addTodo(new Todo("apple"));
		Todo todo = new Todo("auto");
		todo.setDone(true);
		shoppingList.addTodo(todo);
		shoppingList.addTodo(new Todo("milk"));
		shoppingList.addTodo(new Todo("meat"));
		shoppingList.addTodo(new Todo("rice"));
		shoppingList.addTodo(new Todo("juice"));
		
		todolists.add(shoppingList);
		todolists.add(new TodoList("Work todo"));
		
		
	}
	
	static ArrayList<TodoList> getTodoLists() {
		return todolists;
	}
	
	static void removeTodoList(int place) {
		todolists.remove(place);
	}
	
	static void addNewTodoList(String listname){
		todolists.add(new TodoList(listname));
	}
}
