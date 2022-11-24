package substraction;

import java.util.Scanner;

public class Substraction1 {
	
	public static void main(String[] args) {
		
	
		System.out.println("Enter first Number");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println("Enter second Number");
		int b = sc.nextInt();

		int c = a-b;
		System.out.println("Substraction of a and b:"+ c);
}

}
