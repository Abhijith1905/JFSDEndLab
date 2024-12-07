package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.service.CustomerService;

@RestController
public class ClientController
{
	@Autowired
	private CustomerService customerService;

	@GetMapping("/viewallcustomers")
	public List<Customer> viewAllCustomers()
	{
		return customerService.viewall();
	}
}
