package edu.icet.controller;

import edu.icet.model.Item;
import edu.icet.service.ItemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
@Tag(name = "Item-Controller")
public class ItemController {

    final private ItemService service;

    @PostMapping("/add")
    public boolean addItem(@RequestBody Item item){
        return service.addItem(item);
    }

    @PutMapping("/update")
    public boolean updateItem(@RequestBody Item item){
        return service.updateItem(item);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteItem(@PathVariable Integer id){
        return service.deleteItem(id);
    }

    @GetMapping("/get")
    public List<Item> getAll() {
        return service.getAll();
    }
}
