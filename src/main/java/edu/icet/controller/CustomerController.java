package edu.icet.controller;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
@Tag(name = "Customer-Controller")
@CrossOrigin
public class CustomerController {

    final private CustomerService service;

    @PostMapping("/add")
    public boolean addCustomer(@RequestBody Customer customer){
        return service.addCustomer(customer);
    }

    @PutMapping("/update")
    public boolean updateCustomer(@RequestBody Customer customer){
        return service.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteCustomer(@PathVariable Integer id){
        return service.deleteCustomer(id);
    }

    @GetMapping("/get")
    public List<Customer> getAll(){
        return service.getAll();
    }

}
