package RentACar.dataAccess.abstracts;

import RentACar.entities.concretes.Car;

public interface CarDao {
	
	void add(Car car);
	void update(Car car);
	void delete(Car car);

}
