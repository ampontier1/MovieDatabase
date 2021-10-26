/**
 * @author alexanderpontier - ampontier1
 * CIS175 - Spring 2021
 * Oct 26, 2021
 */
package movie.beans;

import javax.persistence.Embeddable;

@Embeddable
public class HomeDistribution {
	private String format;
	private int length;
	private String language;
	
	public HomeDistribution() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomeDistribution(String format, int length, String language) {
		super();
		this.format = format;
		this.length = length;
		this.language = language;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "HomeDistribution [format=" + format + ", length=" + length + ", language=" + language + "]";
	}

}
