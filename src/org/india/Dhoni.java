package org.india;

public class Dhoni{
public  int Dhonimsd(int i) {
		
		System.out.println("total amount is"+i);
		return i;
	}
public  int Kohli(int j) {
		
		System.out.println("total amount is"+j);
		return j;

	}
	
	public static void main(String[] args) {
		Dhoni a = new Dhoni();
		int Dhonimsd=a.Dhonimsd(50000);
		System.out.println("amount given is"+ Dhonimsd/2);
		int Kohli=a.Kohli(40000);
		System.out.println("amount value is"+Kohli/2);
		System.out.println((Dhonimsd+Kohli)/2);
		System.out.println(" thalaivar  ");
		
	}
}
