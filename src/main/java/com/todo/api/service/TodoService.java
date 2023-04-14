package com.todo.api.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.api.pojo.Todo;
@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static long idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "abc", "java", new Date(), false));
		todos.add(new Todo(++idCounter, "abc", "Php", new Date(), false));
		todos.add(new Todo(++idCounter, "abc", "C++", new Date(), false));
		todos.add(new Todo(++idCounter, "abc", "Python", new Date(), false));
		todos.add(new Todo(++idCounter, "abc", "Djengo", new Date(), false));
	}
	public List<Todo> findAll(){
		return todos;
	}
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if(todo==null) return null;
		todos.remove(todo);
		return todo;
	}
	public Todo findById(long id) {
		// TODO Auto-generated method stub
		for(Todo todo:todos) {
			if(todo.getId()==id) {
				return todo;
			}
		}
		return null;
	}
	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
}
