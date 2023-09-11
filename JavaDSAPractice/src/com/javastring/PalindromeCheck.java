package com.javastring;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a String to check Palindrome or not :-  ");
            String str = sc.next();
            StringBuilder sb = new StringBuilder(str).reverse();

            if (sb.toString().equals(str)) {
                System.out.println("Palindrome String");
            } else {
                System.out.println("Not a Palindrome String !.");
            }
            System.out.println("Enter 1 to check other String.");
        }while(sc.nextInt() == 1 );
        sc.close();
    }
}
