package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Topics;



public interface topics extends JpaRepository<Topics, Integer> {

}
