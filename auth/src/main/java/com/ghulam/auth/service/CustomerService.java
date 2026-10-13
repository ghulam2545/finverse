package com.ghulam.auth.service;

import com.ghulam.auth.dtos.LoginRequest;
import com.ghulam.auth.dtos.RegisterRequest;
import com.ghulam.auth.entities.Customer;
import com.ghulam.auth.repo.CustomerRepo;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public boolean register(RegisterRequest registerRequest) {
        Customer customer = new Customer();
        customer.setCustomerId("9999"); // TODO
        customer.setMobileNumber(registerRequest.mobileNumber());
        customer.setName(registerRequest.name());
        customer.setPassword(registerRequest.password());
        customerRepo.saveCustomer(customer);
        return true;
    }

    public boolean login(@Valid LoginRequest loginRequest) {
        String mobileNumber = loginRequest.mobileNumber();
        String password = loginRequest.password();
        return customerRepo.findCustomer(mobileNumber, password);
    }
}
