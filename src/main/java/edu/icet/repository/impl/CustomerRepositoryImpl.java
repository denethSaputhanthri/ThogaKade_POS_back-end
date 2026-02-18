package edu.icet.repository.impl;

import edu.icet.model.Customer;
import edu.icet.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.List;
@Repository
@RequiredArgsConstructor
public class CustomerRepositoryImpl implements CustomerRepository {

    final private JdbcTemplate template;

    @Override
    public boolean addCustomer(Customer customer) {
        String sql = "INSERT INTO customer values(?,?,?,?,?,?,?,?,?)";

        return template.update(sql,
                customer.getId(),
                customer.getTitle(),
                customer.getName(),
                customer.getDobValue(),
                customer.getSalary(),
                customer.getAddress(),
                customer.getCity(),
                customer.getProvince(),
                customer.getPostalCode()
                )>0;
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
        String sql="SELECT * FROM customer";
        List<Customer>customerList=template.query(sql,(rs, rowNum) -> {
           Customer customer=new Customer();
                   customer.setId(rs.getString(1));
                   customer.setTitle(rs.getString(2));
                   customer.setName(rs.getString(3));
                   customer.setDobValue(LocalDate.parse(rs.getString(4)));
                   customer.setSalary(Double.valueOf(rs.getString(5)));
                   customer.setAddress(rs.getString(6));
                   customer.setCity(rs.getString(7));
                   customer.setProvince(rs.getString(8));
                   customer.setPostalCode(rs.getString(9));
                   return customer;
        });
        return customerList;
    }
}
