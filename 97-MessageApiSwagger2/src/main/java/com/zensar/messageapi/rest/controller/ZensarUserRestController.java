package com.zensar.messageapi.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.enity.ZensarUser;

@RestController
@RequestMapping("/api/user")
public class ZensarUserRestController {
	@GetMapping
	public List<ZensarUser> findAll()
	{
		throw new RuntimeException();
	}

}
