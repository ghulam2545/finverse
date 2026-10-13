package com.ghulam.auth.repo;

import com.ghulam.auth.entities.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepo {

    private final JdbcTemplate jdbc;

    public CustomerRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void saveCustomer(Customer customer) {
        String customerId = customer.getCustomerId();
        String mobileNumber = customer.getMobileNumber();
        String name = customer.getName();
        String password = customer.getPassword();
        String script = "INSERT INTO customers(customer_id, mobile_number, name, password) VALUES (?, ?, ?, ?)";
        jdbc.update(script, customerId, mobileNumber, name, password);
    }
}
