package com.globits.da.view.service;

import org.springframework.web.client.RestTemplate;

import com.globits.cms.view.dto.WebsiteDto;

public class ServerService {
	public static String ServerURL = "http://localhost:8095/";
//	public static String ServerURL = "http://globits.net:8095/";
	public static WebsiteDto getWebsiteByDomain(String domainName) {
    	RestTemplate restTemplate = new RestTemplate();
    	String uri = ServerURL+"cms/public/website/getbydomain/"+domainName;
    	WebsiteDto result = restTemplate.getForObject(uri, WebsiteDto.class); 
    	return result;
	}
}
