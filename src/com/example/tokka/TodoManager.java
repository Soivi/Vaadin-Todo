package com.example.tokka;

import java.util.ArrayList;

public class TodoManager {
	static ArrayList<TodoList> todolists;
	
	static void Initialize() {
		todolists = new ArrayList<TodoList>();
		todolists.add(new TodoList("Shopping List"));
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
