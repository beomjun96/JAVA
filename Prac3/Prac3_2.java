package Prac3;

import java.util.*;
public class Prac3_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char word = in.next().charAt(0);      // 문자 하나 받을때 char c = scanner.next().charAt(0);
		
		switch(word) {
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("Good");
				break;
			case 'C':
				System.out.println("Usually");
				break;
			case 'D':
				System.out.println("Effort");
				break;
			case 'F':
				System.out.println("Fallure");
				break;
			default:
				System.out.println("error");
		}
		in.close();
	}
}
