package com.colin.fruityloops.models;

public class Fruit {

		public String name;
		public double price;
		
		public Fruit(String name, double price){
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}	
}
