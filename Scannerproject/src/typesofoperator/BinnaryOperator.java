package typesofoperator;

import java.util.Scanner;

public class BinnaryOperator {
//	public static void main(String[] args) {
//		System.out.println("Enter the Binnary Value");
//		int a = 7;
//		int b = 6;
//		
//		System.out.println("Bitwise AND:"+(a & b));
//		System.out.println("Bitwise OR:"+ (a | b));
//		System.out.println("Bitwise Ex-OR :"+(a^b));
//		System.out.println("Bitwise Complement:"+(~a));
//	
//}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the binnary number");
		int a = sc.nextInt();
		System.out.println("Enter the value a");
		int b = sc.nextInt();
		System.out.println("Enter the value b");
		
		System.out.println("Bitwise And:"+(a&b));
		System.out.println("Bitwise OR:"+(a|b));
		System.out.println("Bitwise Ex-OR:"+(a^b));
		System.out.println("Bitwise Complement:"+(~a));
	}
	
	
}


//
// 																						225	125	64	32	16	8	4	2	1
////Bitwise AND																									1	0	1
////																												1	1	1																						
////A  B  Result																									0	0	1
////1-true , 0-false
////0  0  0              5 =       0 1 0 1  
////0  1  0
////1  0  0              7 =       0 1 1 1
////1  1  1              5=        0 1 0 1
////
//
//Bitwise OR 
//
//A  B  Result 
//
//0  0  0            5 =      0  1  0   1
//0  1  1            7 =      0  1  1   1
//1  0  1
//1  1  1            7 =      0  1   1   1          
//
//Bitwise Ex-OR
//
//
//A  B  Result
//
//0  0   0            5 =      0  1  0   1
//0  1   1            7 =      0  1  1   1
//1  0   1 
//1  1   0            2 =      0  0  1   0  
//		125	64	32	16	8	4	2	1								
//							1	0	1