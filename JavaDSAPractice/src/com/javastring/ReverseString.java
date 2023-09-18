package com.javastring;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string to be reverse  : ");
		String str = sc.next();
		
		StringBuilder sb = new StringBuilder(str).reverse();
		
		System.out.println("reversed == "+sb);
		
		
		// Using for loop 
		String reversedString = ""; 
		for(int i = str.length()-1 ; i >= 0 ; i-- ) {
			reversedString += str.charAt(i);
		}
		
		System.out.println("reversed == "+reversedString);
		
		sc.close();
	}

}
