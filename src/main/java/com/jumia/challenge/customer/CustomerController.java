package com.jumia.challenge.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping
    public String retrieveCustomers(@RequestParam(required = false, name = "country") String country,
                                     @RequestParam(required = false, name = "state") String state,
                                     Model model) {
        List<Customer> allCustomers = customerService.retrieveCustomersByStateAndCountry(country, state);
        model.addAttribute("customers", allCustomers);
        return "customers";
    }

}
