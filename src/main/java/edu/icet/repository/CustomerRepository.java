package edu.icet.repository;

import edu.icet.model.Customer;

import java.util.List;

public interface CustomerRepository {
    boolean addCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(Integer id);
    List<Customer> getAll();
}
