package com.gk.mockito.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.gk.mockito.service.TodoService;
import com.gk.mockito.service.TodoServiceStub;

/**
 * 
 * @author Gangadhar Kasturi
 *
 */
public class TodoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring Boot", "Learn Spring MVC","Learn Dance");
		when(todoServiceMock.retrieveTodos("Spring")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);	
		List<String> filterdTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Spring");
		assertEquals(2,filterdTodos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingMockWithEmptyList() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList();
		when(todoServiceMock.retrieveTodos("Spring")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);	
		List<String> filterdTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Spring");
		assertEquals(0,filterdTodos.size());
	}

	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub2() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);	
		List<String> filterdTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Spring");
		assertEquals(2,filterdTodos.size());
	}
	
}
