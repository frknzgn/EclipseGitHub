package loops;

import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		
		for(int i = 1;i<10;i++) {
			System.out.println(i);
		}
		
		String[] cities = {"Ankara","Ýzmir","Ýstanbul"};
		
		for(String city : cities) {
			System.out.println(city);
		}
		
		int counter=1;
		while(counter<=10) {
			System.out.println(counter);
			counter++;
		}
		
		int counter2=1;
		do {
			System.out.println(counter2);
			counter2++;
		}while(counter2<10);
 	}

}
