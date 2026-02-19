package edu.icet.service.impl;

import edu.icet.model.Order;
import edu.icet.repository.OrderRepository;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    final private OrderRepository repository;

    @Override
    public boolean addOrder(Order order) {
        return repository.addOrder(order);
    }

    @Override
    public boolean updateOrder(Order order) {
        return repository.updateOrder(order);
    }

    @Override
    public boolean deleteOrder(Integer id) {
        return repository.deleteOrder(id);
    }

    @Override
    public List<Order> getAll() {
        return repository.getAll();
    }
}
