package com.venkat.batch.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkat.batch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}
