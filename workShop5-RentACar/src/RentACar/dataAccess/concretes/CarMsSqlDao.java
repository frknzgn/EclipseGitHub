package RentACar.dataAccess.concretes;

import RentACar.dataAccess.abstracts.CarDao;
import RentACar.entities.concretes.Car;

public class CarMsSqlDao implements CarDao {

	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		System.out.println("MsSql Add.");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println("MsSql update.");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println("MsSql Delete");
	}

}
