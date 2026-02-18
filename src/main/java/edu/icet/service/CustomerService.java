package edu.icet.service;

import edu.icet.model.Customer;

import java.util.List;

public interface CustomerService {
    boolean addCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(Integer id);
    List<Customer>getAll();
}
