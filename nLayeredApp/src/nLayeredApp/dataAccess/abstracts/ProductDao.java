package nLayeredApp.dataAccess.abstracts;

import nLayeredApp.core.dataAccess.CrudRepository;
import nLayeredApp.entities.concretes.*;

public interface ProductDao extends CrudRepository<Product> {
	public void getAll();
}
