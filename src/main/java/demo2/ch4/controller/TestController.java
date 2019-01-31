package demo2.ch4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import demo2.ch4.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	TestService testService;
}
