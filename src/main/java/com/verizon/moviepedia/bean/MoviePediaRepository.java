package com.verizon.moviepedia.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MoviePediaRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int insert(MoviePedia movie) {
		return jdbcTemplate.update("INSERT INTO MOVIE_PEDIA (TITLE, DIRECTOR, ARTIST, REC_IND) " + "values(?,?,?,?)",
				new Object[] {movie.getTitle(), movie.getDirector(), movie.getArtist(), movie.getRecInd() });
	}
}
