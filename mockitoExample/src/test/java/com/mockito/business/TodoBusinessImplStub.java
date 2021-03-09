package com.mockito.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.mockito.data.api.TodoService;
import com.mockito.data.api.TodoServiceStub;

public class TodoBusinessImplStub {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}

}
