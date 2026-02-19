package edu.icet.repository;

import edu.icet.model.Order;

import java.util.List;

public interface OrderRepository {
    boolean addOrder(Order order);
    boolean updateOrder(Order order);
    boolean deleteOrder(Integer id);
    List<Order> getAll();
}
