package com.maximgoodman;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringJUnit4ClassRunner.class)

//the two above work together to inject a a MockMvc instance to the dispatcher servlet.
//springboottest requests building of the whole application. To isolate layers yse WebMvctest

@ContextConfiguration(
		//indicates to which classes this test will be applied to
	classes = {BlogController.class},
	//loads bean definitions from @configuration classes
	loader = AnnotationConfigContextLoader.class)

public class ControllerTest {

	
	//sends https requests to the dispatcher servlet and communicates results
	@Test
	public void whenSpringContextIsInstantiated_thenNoExceptions(){
		System.out.println("no exceptions from blogController");
	}
	
}
