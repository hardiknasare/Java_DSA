package com.javastring;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = "";
        String str2 = "";
        boolean anagramCheck = false ;

        do{
            System.out.println("Enter first String : ");
            str1 = sc.next();
            System.out.println("Enter Second String : ");
            str2 = sc.next();

            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            anagramCheck = Arrays.equals(charArray1,charArray2);

            if(anagramCheck){
                System.out.println(str1+ " and "+str2+" are anagram");
            }else{
                System.out.println(str1+ " and "+str2+" are not anagram");
            }
            System.out.println("Enter 1 to check other String.");
        }while(sc.nextInt() == 1 );
        sc.close();
    }
}
