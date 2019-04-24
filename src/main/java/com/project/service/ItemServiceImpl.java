package com.project.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.project.model.Item;
import com.project.repository.ItemRepository;



@Service("itemService")
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	DataSource datasource;
	
	public Item findById(int id) {
		return itemRepository.findById(id);
	}
	
	public Iterable<Item> findAllItems() {
		return itemRepository.findAll();
	}
	
	public void create(Item item) {
		item = itemRepository.save(item);
	}
	
	public Item update(Item item) {
		return itemRepository.save(item);
	}
	
	class UserMapper implements RowMapper<Item> {
		public Item mapRow(ResultSet rs, int arg1) throws SQLException {
			Item item = new Item();

			item.setId(rs.getInt("id"));
			item.setItemName(rs.getString("itemName"));
			item.setPrice(rs.getInt("price"));
		    item.setManufacturer(rs.getString("manufacturer"));
		    item.setStockNumber(rs.getInt("stockNumber"));

			return item;
		}

	}
	
	
	
	

}
