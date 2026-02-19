package edu.icet.controller;

import edu.icet.model.Item;
import edu.icet.model.Order;
import edu.icet.service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
@Tag(name = "Order-Controller")
public class OrderController {

    final private OrderService service;

    @PostMapping("/add")
    public boolean addOrder(@RequestBody Order order){
        return service.addOrder(order);
    }

    @PutMapping("/update")
    public boolean updateOrder(@RequestBody Order order){
        return service.updateOrder(order);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteOrder(@PathVariable Integer id){
        return service.deleteOrder(id);
    }

    @GetMapping("/get")
    public List<Order> getAll() {
        return service.getAll();
    }

}
