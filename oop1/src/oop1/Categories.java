package oop1;

public class Categories {
	
	private int id;
	private String name;
	private String[] images;
	private String abbreviation;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}
	
	public String getAbbreviation() {
		String result="";
		String[] words =name.split("");
		for (String word : words) {
			result+=word.charAt(0);
		}
		
		abbreviation=result;
		return abbreviation;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

}
