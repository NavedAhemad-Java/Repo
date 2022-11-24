package typesofoperator;

import java.util.Scanner;

public class TernaryOpertor {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		
		System.out.println("Enter Value of b");
		int b = sc.nextInt();
		
		System.out.println("Enter Value of C");
		int c = sc.nextInt();
		
//		if (a>b) {
//			System.out.println("Maximam number is:" + a);
//		}else {
//			System.out.println("Maximam Number is:"+b);
//		}
		
			int max;
	
			max = (a>b) ? a:b;
			System.out.println(max);
			
			int max1;
			max1 = (a>b)?a:b;
			System.out.println(max1);
			max1= (b>c)? a:b;
			System.out.println(max1);
			
}
}