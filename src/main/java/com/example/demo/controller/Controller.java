package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TriggerService;

@RestController
public class Controller {
	@Autowired
	TriggerService triggerService;
	

	@GetMapping("/processHelloCamunda/{processKey}")
	public void getCamunda(@PathVariable String processKey) throws Exception {
       triggerService.triggerProcess(processKey);
	}

}
