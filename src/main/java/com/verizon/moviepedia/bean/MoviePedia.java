package com.verizon.moviepedia.bean;

public class MoviePedia {

	private String title;
	private String director;
	private String artist;
	private int recInd;
	
	public MoviePedia(String title, String director, String artist)
	{
		this.title = title;
		this.director = director;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRecInd() {
		return recInd;
	}

	public void setRecInd(int recInd) {
		this.recInd = recInd;
	}
}