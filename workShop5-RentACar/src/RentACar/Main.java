package RentACar;

import RentACar.CrossCuttingConcern.concretes.DataBaseLogger;
import RentACar.bussiness.abstracts.CarService;
import RentACar.bussiness.concretes.CarManager;
import RentACar.dataAccess.concretes.CarMsSqlDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarService carService = new CarManager(new CarMsSqlDao(),new DataBaseLogger());
		
		carService.add(null);
	}

}
