package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MemberController {
	
	@GetMapping("/listMember")
	@ResponseBody
	public String listMember() {
		return "회원목록 출력";
	}
	
	@PostMapping("/insertMember")
	public String insert() {
		return "redirect:/listBoard";
	}
	
}
