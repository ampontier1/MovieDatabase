package movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import movie.beans.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

}
