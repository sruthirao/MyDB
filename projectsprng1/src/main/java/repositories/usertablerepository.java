package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Usertable;

public interface usertablerepository extends  JpaRepository<Usertable,String>{
	
}
