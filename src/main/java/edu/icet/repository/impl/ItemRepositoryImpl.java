package edu.icet.repository.impl;

import edu.icet.model.Item;
import edu.icet.repository.ItemRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepositoryImpl implements ItemRepository {

    final private JdbcTemplate template;

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
        String sql="SELECT * FROM item";
        List<Item>itemList=template.query(sql,(rs, rowNum) -> {
            Item item=new Item();
            item.setCode(rs.getString(1));
            item.setDescription(rs.getString(2));
            item.setPackSize(rs.getString(3));
            item.setUnitPrice(rs.getDouble(4));
            item.setStock(rs.getInt(5));
            return item;
        });
        return itemList;
    }
}
