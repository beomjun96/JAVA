package Prac3;

import java.util.*;
public class Prac3_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Number? ");
		int x = in.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know.");
				
		}
		
		in.close();
	}
}
