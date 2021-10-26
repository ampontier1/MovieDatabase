/**
 * @author alexanderpontier - ampontier1
 * CIS175 - Spring 2021
 * Oct 26, 2021
 */
package movie.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Film {
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private int releaseYear;
	private String director;
	@Autowired
	private HomeDistribution homeDistribution;
	
	public Film() {
		super();
		// TODO Auto-generated constructor stub
		this.director = "Steven Speilberg";
	}

	public Film(String title) {
		super();
		this.title = title;
	}

	public Film(String title, int releaseYear, String director) {
		super();
		this.title = title;
		this.releaseYear = releaseYear;
		this.director = director;
	}

	public Film(long id, String title, int releaseYear, String director) {
		super();
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
		this.director = director;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public HomeDistribution getHomeDistribution() {
		return homeDistribution;
	}

	public void setHomeDistribution(HomeDistribution homeDistribution) {
		this.homeDistribution = homeDistribution;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", title=" + title + ", releaseYear=" + releaseYear + ", director=" + director
				+ ", homeDistribution=" + homeDistribution + "]";
	}

}
