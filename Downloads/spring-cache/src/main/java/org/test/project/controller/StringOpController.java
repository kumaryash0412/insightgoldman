package org.test.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.test.project.domain.StringOp;
import org.test.project.service.StringOpService;

@RestController
public class StringOpController {
	
	@Autowired
	StringOpService stringService;
	
	@GetMapping("/palindrome/{str}")
	public StringOp findStudentById(@PathVariable String str) {
		System.out.println("Searching by string  : " + str);
		return stringService.getLongestPalindrome(str);
	}
}
