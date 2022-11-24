package incrimentoperator;

import java.util.Scanner;

public class IncrimentDecrimentOperator {
	public static void main(String[] args) {
		System.out.println("*********Pre and Post Increment*************");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println("Post Increment:"+  ++a);
		
		System.out.println("Pre Increment:"+   a++);
		System.out.println(a);
		
		
		System.out.println("Post Decrement:"+   --a);
		
		System.out.println("Post Decrement:"+    a--);
		
		System.out.println(a);
	}

}
