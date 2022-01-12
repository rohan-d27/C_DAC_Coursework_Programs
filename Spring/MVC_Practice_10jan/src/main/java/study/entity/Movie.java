package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int movieId;
	
	@Column
	private String name;
	
	@Column
	private String rating;
	
	@Column 
	private String category;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMovieId() {
		return movieId;
	}

	public Movie(String name, String rating, String category) {
		super();
		this.name = name;
		this.rating = rating;
		this.category = category;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", rating=" + rating + ", category=" + category + "]";
	}
	
	
	
	
	
	
	
	
}
