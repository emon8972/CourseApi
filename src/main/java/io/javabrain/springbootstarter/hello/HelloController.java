package io.javabrain.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/h") //By Default this annotaion takes GET method//We hve to explicityly mention other HTTP methods
	public String sayHello()
	{
		
		return "hi";
	}
}
