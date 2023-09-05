package com.trail;

public class Ac {
	private int id;
	private String brand;
	private int rating;
	private String color;
	private int price;
	private int ton;

	public Ac(int id, String brand, int rating, String color, int price, int ton) {

		this.id = id;
		this.brand = brand;
		this.rating = rating;
		this.color = color;
		this.price = price;
		this.ton = ton;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTon() {
		return ton;
	}

	public void setTon(int ton) {
		this.ton = ton;
	}

	@Override
	public String toString() {
		return "Ac [id=" + id + ", brand=" + brand + ", rating=" + rating + ", color=" + color + ", price=" + price
				+ ", ton=" + ton + "]";
	}



}
