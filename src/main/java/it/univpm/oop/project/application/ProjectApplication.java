package it.univpm.oop.project.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import it.univpm.oop.project.model.Feed;
import it.univpm.oop.project.utils.FeedParser;
/**
 * The SpringBoot Application starts.
 * @author Andrea and Giuseppe
 *
 */
@SpringBootApplication
public class ProjectApplication {
	private static final Logger log = LoggerFactory.getLogger(ProjectApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		String url= "https://graph.facebook.com/v7.0/me/feed?access_token=EAAIi8ZAbkTG4BAMyU5TNZBPa4ZAcaaU9O7XjWpVMYFLN8uwPCIYhXY5wgBSShMHEACZAMlcIPwzfxywa1nEBY7arBSiZAGCytCxnP5ZB9feoOVLR6YFKivGHVLUlYKpq7If1XsZCN3gA9ZC12ZCi9SgwEZB9owNuAuzp7Ur2KZCwcFOFEIy9GR9VAcZA\n" + 
				"&__activeScenarioIDs=%5B%5D&__activeScenarios=%5B%5D&debug=all&format=json&method=get&pretty=0&suppress_http_code=1&transport=cors&limit=1000&fields=comments{attachment,id,message}";
		return args -> {
			Feed feed = restTemplate.getForObject(url, Feed.class);
		}; 
	}
}
