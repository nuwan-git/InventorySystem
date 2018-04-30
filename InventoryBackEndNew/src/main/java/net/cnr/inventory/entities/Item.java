package net.cnr.inventory.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long id;
	private String itemName;
	private Double unitPrice;
	private Double quantity;
	private String Description;
	private String itemCatagory;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getItemCatagory() {
		return itemCatagory;
	}
	public void setItemCatagory(String itemCatagory) {
		this.itemCatagory = itemCatagory;
	}
	
	public Item(Long id, String itemName, Double unitPrice, Double quantity, String description, String itemCatagory) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		Description = description;
		this.itemCatagory = itemCatagory;
	}
	public Item(String itemName, Double unitPrice, Double quantity, String description, String itemCatagory) {
		super();
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		Description = description;
		this.itemCatagory = itemCatagory;
	}
	public Item() {
		super();
	}
	
	
	
	
	
	
	
	
	
}
