package arrayespractices;

import java.util.Scanner;

public class ArrayesDifined {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Arrays Coding");
//		int[] marks = new int [3];
//		int a= sc.nextInt();
//		int b = sc.nextInt();
//
//		for(int i =0;i<=a;++i ) {
//			for (int j = 0; j<=b;j++)
//				System.out.print("  " +j);
//		}
//		System.out.println(" ");
//	}
//	
	
//	public static void main(String[] args) {
//		int [] marks = new int [3];
//		marks [0] =97;
//		marks [1] =98;
//		marks [2] =95;
//		
////		System.out.println(marks[0]);
////		System.out.println(marks[1]);
////		System.out.println(marks[2]);
//		
//		for (int i = 0;i <3 ; i ++) {
//			System.out.println(marks[i]);
//		}
//	}
//	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int size= sc.nextInt();
		int number [ ]= new int [size];
		
		for (int i = 0; i <size; i++) {
			number[i] = sc.nextInt();	
			
		}
		for (int i =0; i < size; i++) {
			System.out.println(number[i]);
		}
		
	}
}
 