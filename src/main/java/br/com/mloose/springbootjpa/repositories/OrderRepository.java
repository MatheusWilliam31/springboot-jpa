package br.com.mloose.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mloose.springbootjpa.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
