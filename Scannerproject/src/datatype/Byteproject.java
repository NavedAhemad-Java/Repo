package datatype;

import java.util.Scanner;

public class Byteproject {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Byte");
		byte Number = sc.nextByte();
		System.out.println("Which Number of byte digit:"+Number);
	
		System.out.println("Number of Short");
		
		short a = sc.nextShort();
		System.out.println("Which Number of short:"+a);
		
		System.out.println("Number of Long");
		Long a2 = sc.nextLong();
		System.out.println("Which Number of Long:"+a2);
		
		System.out.println("Number Of Decimal");
		Float a3= sc.nextFloat();
		System.out.println("Which Number of Decimal:"+a3);
		
		System.out.println("Number of Double");
		Double a4= sc.nextDouble();
		System.out.println("Which Number of Double:"+a4);
		
		System.out.println("Enter Any Charactor");
		char c = sc.next().charAt(0);
		System.out.println(c);
		
		System.out.println("Enter any Boolean Value");
		Boolean Value=sc.nextBoolean();
		System.out.println(Value);
	
	
	
	}

}
