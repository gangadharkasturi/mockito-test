package com.gk.mockito.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void testListSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());

	}

	@Test
	public void testListSizeMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());

	}

	@Test
	public void testListGet() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Gangadhar");
		assertEquals("Gangadhar", listMock.get(0));
		assertEquals(null, listMock.get(2));

	}

	// anyInteger -- anyInt()
	// other methods like --anyBoolean , anyObject etc, check documentation
	@Test
	public void testListGetArgMatcher() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("Gangadhar");
		assertEquals("Gangadhar", listMock.get(500));

	}

	@Test(expected = RuntimeException.class)
	public void testListGetArgMatcherWithException() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong"));
		// assertEquals("Gangadhar", listMock.get(500)); assert can't be used for
		// exception, use annotation @Test with exception
		listMock.get(0);
	}
}
