package com.gk.mockito.service;

import java.util.Arrays;
import java.util.List;
//many disadvantages
//it grows as many conditions as we add
//not dynamic
public class TodoServiceStub implements TodoService {

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring Boot", "Learn Spring MVC", "Learn Dance");
	}

	public void deleteTodo(String todo) {
		
	}

}
