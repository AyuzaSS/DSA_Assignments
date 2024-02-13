package com.DSA;


import java.util.Scanner;

public class Armstrong_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a range  to check Armstrong");
		int num = in.nextInt();
		int num2 = in.nextInt();
		
		int rem = 0 , sum = 0;
		System.out.println("The Armstrongs are: ");
		
		for(int i=num ;i<=num2;i++) {
			
			int temp = i;
		while(temp > 0) {
			rem = temp % 10;
			sum += Math.pow(rem, 3);
			temp /= 10;
		}
		
		if(i == sum)
			System.out.print(i + " ");
		sum =0;
		rem =0;
		}

	}

}
