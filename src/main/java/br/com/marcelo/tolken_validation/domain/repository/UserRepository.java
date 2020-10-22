package br.com.marcelo.tolken_validation.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marcelo.tolken_validation.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
