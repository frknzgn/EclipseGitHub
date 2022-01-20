package oop2;

import java.util.ArrayList;

public class ProductManager {
	//Collections
	ArrayList<Product> products = new ArrayList<Product>();
	public ProductManager() {
			
		}
		
		
	

		public void add(Product product) {
			
			if(product.getUnitPrice()<=0) {
				System.out.println("�r�n fiyat� 0'a e�it ve ya 0'dan k���k olamaz.");
				return;
			}
			
			if(product.getName().startsWith("A,a")) {
				System.out.println("�r�n ad� A harfi ile ba�layamaz.");
				return;
			}
			
			this.products.add(product);
		}
		
		public void delete() {
			System.out.println("�r�n silindi");
		}
		
		public void update() {
			System.out.println("�r�n g�ncellendi");
		}
		
		public ArrayList<Product> getAll(){
		
			return this.products;
			
			
		}
		
}
