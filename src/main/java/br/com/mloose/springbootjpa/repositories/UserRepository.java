package br.com.mloose.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mloose.springbootjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
