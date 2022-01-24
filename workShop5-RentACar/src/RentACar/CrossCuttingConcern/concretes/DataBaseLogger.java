package RentACar.CrossCuttingConcern.concretes;

import RentACar.CrossCuttingConcern.abstracts.LogService;
import RentACar.entities.concretes.Car;

public class DataBaseLogger implements LogService {

	@Override
	public void log(Car car) {
		// TODO Auto-generated method stub
		System.out.println("DataBase Logger.");
	}

}
