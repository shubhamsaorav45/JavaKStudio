package com.studio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studio.entity.Login;
import com.studio.entity.Studio;
import com.studio.service.studioservice;

@RestController
@CrossOrigin
@RequestMapping("/studio")
public class studioController {
	@Autowired
	private studioservice studioservice;

	@PostMapping
	public String createRegesiter(@RequestBody Studio studio) {
		studioservice.savePerson(studio);
		return "New Member Were Added";
	}

	@GetMapping("/getAll")
	public List<Studio> getAllRegisterData() {
		return studioservice.getAllDataofRegisteredMember();
	}

	@GetMapping("/login")
	public String getLoginData(@RequestParam String email, @RequestParam String password) {
		System.out.println(email + " " + password);
		Login login = new Login(email, password);
		boolean data = studioservice.Shubham(login);
		if (data == true) {
			return "Login Successful";
		}else {
			return "Login Failed";
		}
	}

}
