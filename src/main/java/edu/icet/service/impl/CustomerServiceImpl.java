package edu.icet.service.impl;

import edu.icet.model.Customer;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final private CustomerRepository repository;

    @Override
    public boolean addCustomer(Customer customer) {
        return repository.addCustomer(customer);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return repository.updateCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(Integer id) {
        return repository.deleteCustomer(id);
    }

    @Override
    public List<Customer> getAll() {
        return repository.getAll();
    }
}
