package com.gk.mockito.service;

import java.util.List;
/**
 * 
 * @author Gangadhar Kasuri
 *
 */
//Create ToDoService stub
//Test 	ToDoServiceImpl using ToDoService Stub
public interface TodoService {
	public List<String> retrieveTodos(String user);

	public void deleteTodo(String todo);
}
