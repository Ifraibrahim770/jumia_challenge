package com.jumia.challenge.customer.dao;

import com.jumia.challenge.customer.Customer;
import com.jumia.challenge.databaseconfig.CustomerDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Repository("lite")
public class CustomerDAOImpl implements CustomerDAO {

    private Connection connection = null;
    private Statement statement = null;

    @Autowired
    public CustomerDAOImpl(CustomerDatabase customerDatasource) {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = customerDatasource.dataSource().getConnection();
            this.statement = connection.createStatement();
            statement.setQueryTimeout(20);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Customer> selectAllCustomers(String country, String state) {
        List<Customer> customers = null;
        try {
            ResultSet rs = statement.executeQuery("select id, name, phone from customer");
            customers = new LinkedList<>();
            while (rs.next()) {
                customers.add(
                        new Customer(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getString("phone")
                        )
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (country != null && state == null) {
            return customers
                    .stream()
                    .filter(customer -> country.equalsIgnoreCase(customer.getCountry()))
                    .collect(Collectors.toList());
        } else if (country == null && state != null) {
            return customers
                    .stream()
                    .filter(customer -> state.equalsIgnoreCase(customer.getState()))
                    .collect(Collectors.toList());
        } else if (country != null && state != null) {
            return customers
                    .stream()
                    .filter(customer -> state.equalsIgnoreCase(customer.getState()))
                    .filter(customer -> country.equalsIgnoreCase(customer.getCountry()))
                    .collect(Collectors.toList());
        }
        return customers;

    }

}
