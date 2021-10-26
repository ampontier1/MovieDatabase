package movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import movie.beans.Film;
import movie.beans.HomeDistribution;
import movie.controller.BeanConfiguration;
import movie.repository.FilmRepository;

@SpringBootApplication
public class MovieDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDatabaseApplication.class, args);		
		
		/**ApplicationContext appContext = new AnnotationConfigApplicationContext (BeanConfiguration.class);
		
		Film f = appContext.getBean("film", Film.class);
		
		System.out.println(f.toString());
		*/		
	}
	
	@Autowired
	FilmRepository repo;
	
	//@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Film f = appContext.getBean("film", Film.class);
		f.setDirector("Stanley Cubrick");
		repo.save(f);
		
		Film g = new Film("Citizen Kane", 1941, "Orson Welles");
		HomeDistribution hd = new HomeDistribution("VHS", 119, "English");
		g.setHomeDistribution(hd);
		repo.save(g);
		
		List<Film> allMyMovies = repo.findAll();
		for(Film screen: allMyMovies) {
			System.out.println(screen.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
