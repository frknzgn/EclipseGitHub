package nLayeredApp.dataAccess.concretes.ýnMemoryImpls;

import myArrayList.MyArrayList;
import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryInMemoryDao implements CategoryDao{
	MyArrayList<Category> categoryArrayList = new MyArrayList<>();
	
	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		categoryArrayList.add(category);
	}

	@Override
	public void update(Category entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		if(categoryArrayList.contains(category)) {
			System.out.println("Deleted.");
		}else {
			System.out.println(categoryArrayList.contains(category));
		}
	}
	
	public void getAll() {
		categoryArrayList.getAll();
		System.out.println(categoryArrayList.size());
	}

}
