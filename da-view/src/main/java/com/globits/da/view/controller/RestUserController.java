package com.globits.da.view.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.globits.da.view.dto.UserDto;
import com.globits.da.view.service.ServerService;

@Controller
@RequestMapping("/user")
public class RestUserController {
	@PostMapping("")
	public String saveOrUpdate(Model model, HttpServletRequest request,@ModelAttribute UserDto dto) {
		RestTemplate restTemplate = new RestTemplate();
		
		
		String userPath = ServerService.ServerURL + "da/public";

		UserDto user = restTemplate.postForObject(userPath, dto, UserDto.class);
		return "Layout/home";
	}
}
