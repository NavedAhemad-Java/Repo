package substraction;

import java.util.Scanner;

public class Twonosubstraction {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter First Number");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		int c =a-b;
		
		System.out.println("substraction of a and b:"-c);
		
	}
	

}
