package divided;

import java.util.Scanner;

public class Dividation {
	
	public static void main(String[] args) {
		
		System.out.println("Enter First Number");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println("Enter second Number");
		
		int b = sc.nextInt();
		
		int c = a/b;
		
		System.out.println("Division of a and b:"+c);
		
	}

}
