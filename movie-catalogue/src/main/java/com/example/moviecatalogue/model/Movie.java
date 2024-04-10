package com.example.moviecatalogue.model;

import java.util.Date;
import java.util.List;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="movies")
public class Movie {

	@BsonProperty("_id")
	private ObjectId id;
	private String title;
	private Integer year;
	private Integer runtime;
	private Date released;
	private String poster;
	private String plot;
	private String fullplot;
	private String lastupdated;
	private String type;
	private List<String> directors;
	private Imdb imdb;
	private List<String> cast;
	private List<String> countries;
	private List<String> genres;
	private Tomatoes tomatoes;
	private Integer num_mflix_comments;
	
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	public Date getReleased() {
		return released;
	}

	public void setReleased(Date released) {
		this.released = released;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getFullplot() {
		return fullplot;
	}

	public void setFullplot(String fullplot) {
		this.fullplot = fullplot;
	}

	public String getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getDirectors() {
		return directors;
	}

	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}

	public Imdb getImdb() {
		return imdb;
	}

	public void setImdb(Imdb imdb) {
		this.imdb = imdb;
	}

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

	public List<String> getCountries() {
		return countries;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public Tomatoes getTomatoes() {
		return tomatoes;
	}

	public void setTomatoes(Tomatoes tomatoes) {
		this.tomatoes = tomatoes;
	}

	public Integer getNum_mflix_comments() {
		return num_mflix_comments;
	}

	public void setNum_mflix_comments(Integer num_mflix_comments) {
		this.num_mflix_comments = num_mflix_comments;
	}

}



