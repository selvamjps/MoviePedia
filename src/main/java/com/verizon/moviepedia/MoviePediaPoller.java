package com.verizon.moviepedia;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MoviePediaPoller {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void handleJdbcMessage(List<Map<String, Object>> message) {
		
		for (Map<String, Object> resultMap: message) 
		{
			String title = (String) resultMap.get("TITLE");
			String director = (String) resultMap.get("DIRECTOR");
			String artist = (String) resultMap.get("ARTIST");
			
			logger.info("Please find the movie details fetched from IMDBI database based on your search criteria");
			
			logger.info("Title: " + title); 
			logger.info("Director: " + director);
			logger.info("Artist: " + artist);
		}
	}
}
