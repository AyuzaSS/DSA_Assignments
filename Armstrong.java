package com.DSA;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a number to check Armstrong");
		int num = in.nextInt();
		int rem = 0 , sum = 0;
		int temp = num;
		while(num > 0) {
			rem = num % 10;
			sum += Math.pow(rem, 3);
			num /= 10;
		}
		
		if(temp == sum)
			System.out.println(temp + " is an Armstrong");
		else
			System.out.println(temp + " is not an Armstrong");

	}

}
