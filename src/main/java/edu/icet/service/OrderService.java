package edu.icet.service;

import edu.icet.model.Order;

import java.util.List;

public interface OrderService {
    boolean addOrder(Order order);
    boolean updateOrder(Order order);
    boolean deleteOrder(String orderId);
    List<Order> getAll();
}
