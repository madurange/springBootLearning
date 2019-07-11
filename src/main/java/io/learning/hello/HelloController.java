package io.learning.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/helloworld")
	public String helloWorld() {
		return "Hello World!";
	}

}
