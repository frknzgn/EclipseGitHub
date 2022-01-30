package myArrayList;

public class Main {

	public static void main(String[] args) {
		MyArrayList<String> myArrayList = new MyArrayList<String>();
		myArrayList.add("furkan");
		myArrayList.add("engin");
		myArrayList.add("ahmet");
		myArrayList.add("selo");
		myArrayList.add("kerem");
		myArrayList.getAll();
		System.out.println(myArrayList.size());
		System.out.println(myArrayList.contains("furkan"));

	}

}
