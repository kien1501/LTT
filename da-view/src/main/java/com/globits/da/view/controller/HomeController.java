package com.globits.da.view.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.globits.da.view.dto.EQAProgramIntroductionDto;
import com.globits.da.view.dto.EventDto;
import com.globits.da.view.dto.ProductCategoryDto;
import com.globits.da.view.service.ServerService;


@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("")
	public String showHome(Model model, HttpServletRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		
		
		String categoryList = ServerService.ServerURL + "da/public/getProductCategory";
		ProductCategoryDto[] categoryItem = restTemplate.getForObject(categoryList, ProductCategoryDto[].class);
		List<ProductCategoryDto> productCategory = (List<ProductCategoryDto>) Arrays.asList(categoryItem);
		
		String eventList = ServerService.ServerURL + "da/public/getProductEvent";
		EventDto[] eventItem = restTemplate.getForObject(eventList, EventDto[].class);
		List<EventDto> event = (List<EventDto>) Arrays.asList(eventItem);
		
		String newsList = ServerService.ServerURL + "da/public/getAllNews";
		EQAProgramIntroductionDto[] newsItem = restTemplate.getForObject(newsList, EQAProgramIntroductionDto[].class);
		List<EQAProgramIntroductionDto> news = (List<EQAProgramIntroductionDto>) Arrays.asList(newsItem);
		
		model.addAttribute("productCategory", productCategory);
		model.addAttribute("event", event);
		model.addAttribute("news", news);
		
		return "Layout/home";
	}
	
}
