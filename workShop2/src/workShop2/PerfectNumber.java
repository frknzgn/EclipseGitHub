package workShop2;


import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
	
	public static void main(String[] args) {
			
		List<Integer> perfectNumbers = new ArrayList<>();
		int counter =0;
		int i =1;
		while(counter<4) 
		{

			int sum = 0;
			for(int j=1 ; j<i ; j++) 
			{
				if(i%j==0) 
				{
					sum+=j;
				}
			}
			
			if(sum==i) 
			{
				perfectNumbers.add(i);
				counter++;
			}
			i++;
		}
		
		System.out.println(perfectNumbers);
		
		
	}
}
