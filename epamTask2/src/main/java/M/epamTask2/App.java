package M.epamTask2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

interface chocos{
	public void inChocs();	
}
interface sweets{
	public void inSweets();		
}
interface operations{
	public void totalWeight();
	public void sortingC();
}

class giftOp implements sweets,chocos,operations {

	
	public int c,s,weight;
	
	Map<String, Integer> listChoc = new HashMap<String, Integer>(); 
	

	public void inSweets() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nenter the number of sweets");
		
		s = input.nextInt();
		System.out.println("\nnumber of Sweets recieved in gift " + s);
	}
	
	public void inChocs() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nenter the number of chocolates");
	
		c = input.nextInt();
		System.out.println("\nnumber of chocolates recieved in gift " + c);
		
	}

	

	public void totalWeight() {
		weight=c*200+s*300;
		System.out.println("\n *****the total Weight of gifts is "+weight+" grams***** \n");
	}
	
	
	public void sortingC() {
		
		 Scanner int1 = new Scanner(System.in);
		 Scanner sc = new Scanner(System.in); 
		  
	        
		for(int i=1;i<=c;i++) {
			
			System.out.println("enter the name of the  chocolate"+i);
	        String name = sc.nextLine(); 
	       
			System.out.println("enter the price of the  chocolate"+i);
			int a = int1.nextInt(); 
	        
			//adding name and price of chocolates in hashmap
			listChoc.put(name,a); 
			
		}
		//printing unsorted choloates to show difference between sorted and unsorted
		System.out.println(listChoc);
		
		//sorting the chocolates in alphabetical order
		//new list for storing sorted order
		Map<String,Integer> sortChocs = new TreeMap<String,Integer>(listChoc);
		System.out.println("Sorted Map   : " + sortChocs);
	}
}



public class App
{
	public static void main(String[] args) {
		
		giftOp gO= new giftOp();
		gO.inSweets();
		gO.inChocs();	
		gO.totalWeight();
		gO.sortingC();
		
		
	}
}