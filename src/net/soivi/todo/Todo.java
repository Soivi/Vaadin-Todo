package net.soivi.todo;

public class Todo {
	private String name;
	private boolean done;
	
	public Todo(String name) {
		this.name = name;
		this.done = false;
	}
	
	public String getTitle() {
		return this.name;
	}
	
	public boolean isDone() {
		return this.done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}
