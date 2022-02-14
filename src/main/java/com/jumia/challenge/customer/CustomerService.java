package com.jumia.challenge.customer;

import com.jumia.challenge.customer.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public List<Customer> retrieveCustomersByStateAndCountry(String country, String state) {

        return customerDAO.selectCustomersByStateOrCountry(country,state);
    }



}
