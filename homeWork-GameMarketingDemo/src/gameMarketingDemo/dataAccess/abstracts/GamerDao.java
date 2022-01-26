package gameMarketingDemo.dataAccess.abstracts;

import gameMarketingDemo.entities.concretes.Gamer;

public interface GamerDao {
	void add(Gamer gamer);	
	void delete(Gamer gamer);
	void update(Gamer gamer);
}
