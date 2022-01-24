package RentACar.bussiness.concretes;

import RentACar.CrossCuttingConcern.abstracts.LogService;
import RentACar.bussiness.abstracts.CarService;
import RentACar.dataAccess.abstracts.CarDao;
import RentACar.entities.concretes.Car;


public class CarManager implements CarService {
	private CarDao carDao;
	private LogService logger;
	
	public CarManager(CarDao carDao,LogService logger) {
		super();
		this.carDao = carDao;
		this.logger = logger;
		
	}

	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		carDao.add(car);
		logger.log(car);
		
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		carDao.delete(car);
		logger.log(car);
		
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		carDao.update(car);
		logger.log(car);
	}

}
