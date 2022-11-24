package decisionmakingstatment;

import java.util.Scanner;

public class Ifconditiondemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");

		int age = sc.nextInt();
		
		if(age>=18) {
			
			System.out.println("you are eligible for voting");
						
		}else {
			
			System.out.println("You are Not Eligible for Voting");
				
		}
				
	}

}

