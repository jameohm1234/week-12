package it.com;

import java.util.Scanner;

public class Swith {
	
	public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		switch(num)
		{
		
		case 1:
			System.out.println("First block");
			break ;
		case 2:
			System.out.println("secobd block");
			break ;
			
			default:
				System.out.println("default block");
				break;
		
		}
	}

}
