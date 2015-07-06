package com.boot.controller;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SampleControllerTest {

	private SampleController controller = new SampleController();

	@Test
	public void returnExpectedStringFromIndex() {
		assertThat(controller.index(), Is.is("Greetings from Spring Boot!"));
	}

	@Test
	public void returnExpectedStringFromHome() {
		assertThat(controller.home(), Is.is("Home Greetings from Spring Boot!"));
	}
}
