package edu.icet.repository.impl;

import edu.icet.model.Customer;
import edu.icet.repository.CustomerRepository;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public boolean addCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean deleteCustomer(Integer id) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return List.of();
    }
}
