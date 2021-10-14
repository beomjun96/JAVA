package Prac4;

import java.util.*;
public class Prac4_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int num = in.nextInt();
		int i = 1;
		int sum = 0;
		
		
		
		while (i <= num) {
			sum += i++;
		}
		
		
		System.out.println(sum);
		in.close();
	}
	
}
