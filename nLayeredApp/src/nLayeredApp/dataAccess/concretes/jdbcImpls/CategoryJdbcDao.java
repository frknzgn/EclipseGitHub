package nLayeredApp.dataAccess.concretes.jdbcImpls;

import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryJdbcDao implements CategoryDao{

	@Override
	public void add(Category cateogry) {
		// TODO Auto-generated method stub
		System.out.println("JDBC eklendi.");
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		System.out.println("JDBC güncellendi.");
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		System.out.println("JDBC silindi.");
	}

}
