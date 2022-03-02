package com.zensar.training.bean;

import java.util.ArrayList;
import java.util.List;

public class TodoBusniessImpl {
	private TodoService todoService;

	public TodoBusniessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToString(String user) {
		List<String> filterTodods = new ArrayList<String>();
		List<String> todos = this.todoService.retriveTodos(user);
		for (String todo : todos) {
			if (todo.contains("Spring"))
				filterTodods.add(todo);
		}
		return filterTodods;
	}
}