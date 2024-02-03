package com.venkat.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.venkat.batch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {
		System.out.println(Thread.currentThread().getName());
		return item;
	}

}
