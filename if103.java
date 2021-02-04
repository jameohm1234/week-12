package it.com;

import java.util.Scanner;

public class if103 {
	
public static void main(String[]args) {
	Scanner read = new Scanner(System.in);
	System.out.println("Enter any value:");
	
	int age = read.nextInt();
	if(age<=13) {
		System.out.println("you child");		
	 }
	else if(age>13 && age<18) {
		System.out.println ("you are Teenager");
	}
	else if (age>=18) {
		if(age>=18 && age<=25) {
		System.out.println("you are adult and Midle age");
		}
		else if(age>25) {
			System.out.println("you are adult and Old man");
		
		 }
		}
	}
	}



