package com.gk.mockito.business;

import static org.junit.Assert.*;

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
public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub1() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);	
		List<String> filterdTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2,filterdTodos.size());
		assertEquals(Arrays.asList("Learn Spring Boot", "Learn Spring MVC"), filterdTodos);
	}

	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub2() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);	
		List<String> filterdTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2,filterdTodos.size());
	}
	
}
