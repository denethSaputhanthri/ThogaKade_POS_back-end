package edu.icet.repository.impl;

import edu.icet.model.Order;
import edu.icet.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    final private JdbcTemplate template;

    @Override
    public boolean addOrder(Order order) {
        String sql ="INSERT INTO orders values(?,?,?)";
        return template.update(sql,
                order.getId(),
                order.getOrderDate(),
                order.getCustomerId()
                )>0;
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
        String sql="SELECT * FROM orders";
        List<Order>orderList=template.query(sql,(rs, rowNum) -> {
            Order order=new Order();
            order.setId(rs.getString(1));
            order.setOrderDate(rs.getDate(2).toLocalDate());
            order.setCustomerId(rs.getString(3));
            return order;
        });
        return orderList;
    }
}
