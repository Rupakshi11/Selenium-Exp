import java.util.ArrayList;
import java.util.List;

import org.testng.collections.Lists;

public class Learning {

	public static void main(String[] args) {
	
		List<Integer> listOfInteger = new ArrayList<Integer>();
		
		listOfInteger.add(1);
		listOfInteger.add(2);
		
		
		
		for(int i=0;i<listOfInteger.size();i++) {
			System.out.println(listOfInteger.get(i));
		}
		System.out.println("--------------------");
		
		for(Integer i : listOfInteger) {
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		
		//jdk 8
		//streams, lambdas
		// lambdas--->>> a->System.out.println(a)
		
		
		listOfInteger.stream().forEach(a->System.out.println("Apoorv"));
		listOfInteger.stream().filter(a-> {
			if(a==2) {
				return false;
			} else {
				return true;
			}
		}).forEach(a->System.out.println(a));
		
		
		
		
	}
		
}
