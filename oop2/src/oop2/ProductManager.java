package oop2;

import java.util.ArrayList;

public class ProductManager {
	//Collections
	ArrayList<Product> products = new ArrayList<Product>();
	public ProductManager() {
			
		}
		
		
	

		public void add(Product product) {
			
			if(product.getUnitPrice()<=0) {
				System.out.println("Ürün fiyatý 0'a eþit ve ya 0'dan küçük olamaz.");
				return;
			}
			
			if(product.getName().startsWith("A,a")) {
				System.out.println("Ürün adý A harfi ile baþlayamaz.");
				return;
			}
			
			this.products.add(product);
		}
		
		public void delete() {
			System.out.println("Ürün silindi");
		}
		
		public void update() {
			System.out.println("Ürün güncellendi");
		}
		
		public ArrayList<Product> getAll(){
		
			return this.products;
			
			
		}
		
}
