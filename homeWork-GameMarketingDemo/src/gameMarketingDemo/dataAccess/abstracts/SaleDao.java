package gameMarketingDemo.dataAccess.abstracts;

import gameMarketingDemo.entities.concretes.Sale;

public interface SaleDao {
	void add(Sale sale);
	void update(Sale sale);
	void delete(Sale sale);
}
