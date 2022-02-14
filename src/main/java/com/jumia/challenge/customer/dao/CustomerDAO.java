package com.jumia.challenge.customer.dao;

import com.jumia.challenge.customer.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> selectCustomersByStateOrCountry(String country, String state);


}
