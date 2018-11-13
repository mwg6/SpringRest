package com.maximgoodman;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller

public class BlogController {

	@Autowired
	//private RestTemplate service;
    @RequestMapping("/")
    public String index() {
		// the request mapping isn't working here
        return "Congratulations from BlogController.java";
    }

}