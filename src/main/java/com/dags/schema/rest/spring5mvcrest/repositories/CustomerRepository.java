package com.dags.schema.rest.spring5mvcrest.repositories;

import com.dags.schema.rest.spring5mvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long>{
}