package com.cakefactory.storefront;

import javax.persistence.*;


@Entity
public class Pastry {

	@Id
	private String id;
	private String description;
	private double price;
	
	public String getId() {
		return id;
	}
	
	public void setId(String value) {
		id = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String value) {
		description = value;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double value) {
		price = value;
	}
	
	public Pastry() {}
	
	public Pastry(String id, String description, double price) {
		this.id = id;
		this.description = description;
		this.price = price;
	}
	
	public String toString() {
		return id + ": " + description + " - $ " + Double.toString(price);
	}
	
}
