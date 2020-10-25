package com.sunsoft;



import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fullname")
public class MainController {
	@RequestMapping(value="", method = RequestMethod.POST)
	public String getfullName(@ModelAttribute FullName fullname)
	{
		System.out.println(fullname.getFname()+" "+fullname.getLname());
		return "Full Name is "+fullname.getFname()+" "+fullname.getLname();
	}
	
}