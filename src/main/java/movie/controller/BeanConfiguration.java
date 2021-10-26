/**
 * @author alexanderpontier - ampontier1
 * CIS175 - Spring 2021
 * Oct 26, 2021
 */
package movie.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import movie.beans.Film;
import movie.beans.HomeDistribution;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Film film() {
		Film bean = new Film("Michael Crichton");
		//bean.setTitle("M*A*S*H");
		//bean.setReleaseYear(1970);
		//bean.setDirector("Robert Altman");
		return bean;
	}
	
	@Bean
	public HomeDistribution homeDistribution() {
		HomeDistribution bean = new HomeDistribution("DVD", 116, "English");
		return bean;
	}

}
