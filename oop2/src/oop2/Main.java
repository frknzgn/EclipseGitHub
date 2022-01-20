package oop2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1 = new Product(1, "elma", -12);
		Product product2 = new Product(2, "armut", 11);
		Product product3 = new Product(3, "üzüm", 10);
		
		
		ProductManager productManager = new ProductManager();
		
		productManager.add(product1);
		productManager.add(product2);
		productManager.add(product3);
		
		for (Product product : productManager.getAll()) {
					System.out.println(product.getName());
		}
	}

}

//özellik tutucu classlar
//Operasyon tutucular

