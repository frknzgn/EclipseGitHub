package nLayeredApp;

import nLayeredApp.bussiness.abstracts.ProductService;
import nLayeredApp.bussiness.concretes.ProductManager;
import nLayeredApp.dataAccess.concretes.hiberNateImpls.ProductHiberNateDao;
import nLayeredApp.dataAccess.concretes.ýnMemoryImpls.ProductInMemoryDao;
import nLayeredApp.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new ProductInMemoryDao());
		Product product1 = new Product(1,"aa",10);
		Product product2 = new Product(2,"ab",11);
		Product product3 = new Product(3,"ba",12);
		Product product4 = new Product(4,"bb",13);
		productService.add(product1);
		productService.add(product2);
		productService.add(product3);
		productService.add(product4);
		productService.delete(product1);
		productService.delete(new Product());
		productService.getAll();
	}

}
