package edu.icet.repository.impl;

import edu.icet.model.Order;
import edu.icet.repository.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public boolean addOrder(Order order) {
        return false;
    }

    @Override
    public boolean updateOrder(Order order) {
        return false;
    }

    @Override
    public boolean deleteOrder(Integer id) {
        return false;
    }

    @Override
    public List<Order> getAll() {
        return List.of();
    }
}
