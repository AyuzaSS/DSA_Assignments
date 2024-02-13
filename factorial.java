package com.DSA;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a number to find the factorial");
		int num = in.nextInt();
		int fact =1;
		
		System.out.println("The factorial of "+num+" is: ");
		while(num>0) {
			fact *= num;
			num--;
		}
		System.out.println(fact);

	}

}
