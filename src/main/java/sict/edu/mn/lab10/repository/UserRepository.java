package sict.edu.mn.lab10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sict.edu.mn.lab10.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}