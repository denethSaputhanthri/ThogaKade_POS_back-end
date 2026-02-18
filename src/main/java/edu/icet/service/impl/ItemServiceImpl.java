package edu.icet.service.impl;

import edu.icet.model.Item;
import edu.icet.repository.ItemRepository;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{

    final private ItemRepository repository;

    @Override
    public boolean addItem(Item item) {
        return false;
    }

    @Override
    public boolean updateItem(Item item) {
        return false;
    }

    @Override
    public boolean deleteItem(Integer id) {
        return false;
    }

    @Override
    public List<Item> getAll() {
        return List.of();
    }
}
