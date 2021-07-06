package br.com.mloose.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mloose.springbootjpa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
