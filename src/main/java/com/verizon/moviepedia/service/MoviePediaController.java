package com.verizon.moviepedia.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.verizon.moviepedia.bean.MoviePedia;
import com.verizon.moviepedia.bean.MoviePediaRepository;

@Controller
public class MoviePediaController {
	
	private static final String welcomemsg = "Welcome Mr. %s!";
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MoviePediaRepository repository;
	
	@GetMapping("/fetch/movie")
    @ResponseBody
    public String fetchMovie(@RequestParam(name="title") String title, @RequestParam(name="year") String year) {
       
		RestTemplate restTemplate = new RestTemplate();
		//http://www.theimdbapi.org/api/find/movie?title=title&year=year
		ResponseEntity<String> response = restTemplate.getForEntity(
		        "http://gturnquist-quoters.cfapps.io/api/random",
		        String.class);
		
		System.out.println(response); 
		
		repository.insert(new MoviePedia(title, "Steven Speilberg", "Brad Pitt"));
		
		return String.format(welcomemsg, title);
    }

}
