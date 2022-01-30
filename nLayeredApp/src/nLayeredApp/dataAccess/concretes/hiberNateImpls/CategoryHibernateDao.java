package nLayeredApp.dataAccess.concretes.hiberNateImpls;

import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryHibernateDao implements CategoryDao{

	@Override
	public void add(Category cateogry) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate eklendi.");
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate güncellendi.");
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate silindi.");
	}
}
