package edu.icet.service.impl;

import edu.icet.model.Order;
import edu.icet.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
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
