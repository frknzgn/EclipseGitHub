package RentACar.CrossCuttingConcern.concretes;

import RentACar.CrossCuttingConcern.abstracts.LogService;
import RentACar.entities.concretes.Car;

public class FileLogger implements LogService {

	@Override
	public void log(Car car) {
		// TODO Auto-generated method stub
		System.out.println("File Logger.");
	}

}
