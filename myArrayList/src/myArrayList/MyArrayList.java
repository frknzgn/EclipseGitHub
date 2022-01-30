package myArrayList;

import java.util.Arrays;



public class MyArrayList<T> {
	
	public int length=0;
	private Object[] array;
	private Object[] tempArray;
	
	
	public MyArrayList() {
		array = new Object[length];
	}


	public void add(T entity) {
		tempArray = new Object[array.length+1];
		for (int i =0;i<array.length;i++) {
			tempArray[i]=array[i];
		}
		tempArray[array.length]=entity;
		array=tempArray;
	}
	

	public int size() {
		return array.length;
	}
	
	public boolean contains(T entity) {
		for(Object object : array) {
			if(object==entity) {
				return true;
			}
		}return false;
	}
	
	public void getAll() {
		System.out.println(Arrays.toString(array));
	}
	
	
	
	
	
	
	
	
	

}
