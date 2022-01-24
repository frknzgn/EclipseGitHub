package RentACar.CrossCuttingConcern.abstracts;

import RentACar.entities.concretes.Car;

public interface LogService {
	void log(Car car);
}
