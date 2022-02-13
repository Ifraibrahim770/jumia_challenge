package com.jumia.challenge.customer.dao;

import com.jumia.challenge.customer.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> selectAllCustomers(String country, String state);


}
