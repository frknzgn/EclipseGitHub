package RentACar.bussiness.abstracts;

import RentACar.entities.concretes.Car;

public interface CarService {
	void add(Car car);
	void delete(Car car);
	void update(Car car);
}
