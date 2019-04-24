package com.project.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String itemName;
	@Column
	private int price;
	@Column
	private String manufacturer;
	@Column
	private int stockNumber;
	@Column
	@ManyToMany
	@JoinTable(
	  name = "item_review", 
	  joinColumns = @JoinColumn(name = "review_id", referencedColumnName = "id"), 
	  inverseJoinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id" ))
	Set<Review> review; 
	
	public Item() {
		
	}

	public Item(int id, String itemName, int price, String manufacturer, int stockNumber) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.manufacturer = manufacturer;
		this.stockNumber = stockNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}
	
	

}
