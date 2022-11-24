package addition;

import java.util.Scanner;

public class TwonoAddition {
		
	
	public static void main(String[] args) {
			
		System.out.println("Enter First Number");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		int c=a+b;
		System.out.println("Addition of a and b;"+ c);
		
		
}
}


