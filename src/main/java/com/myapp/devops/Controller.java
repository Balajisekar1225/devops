package com.myapp.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

@RequestMapping(value="/admin")
public class Controller {
		@GetMapping (value="/hi")
		public String hello() {
			return "Welcome jenkins";
		}

}
