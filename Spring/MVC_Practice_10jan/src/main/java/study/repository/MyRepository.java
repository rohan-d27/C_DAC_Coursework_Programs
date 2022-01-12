package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.entity.Movie;



public interface MyRepository extends JpaRepository<Movie, Integer> {

}
