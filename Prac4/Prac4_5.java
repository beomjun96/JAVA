package Prac4;

import java.util.*;
public class Prac4_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = 0;
		
		while (true) {
			int num = in.nextInt();
			
			if (num==0)
				break;
			else if (num%3==0 || num%5==0)
				continue;
			else
				cnt++;
		}
		System.out.println(cnt);
		in.close();
	}
}
