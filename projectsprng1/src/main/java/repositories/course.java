package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Courses;

public interface course extends JpaRepository<Courses, Integer> { 

}
