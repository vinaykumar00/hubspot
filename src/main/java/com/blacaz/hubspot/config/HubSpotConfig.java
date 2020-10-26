package com.blacaz.hubspot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HubSpotConfig {

	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
