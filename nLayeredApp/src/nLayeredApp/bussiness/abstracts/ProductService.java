package nLayeredApp.bussiness.abstracts;

import nLayeredApp.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	void getAll();
}
