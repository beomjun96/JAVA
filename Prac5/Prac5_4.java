//자연수 n을 입력바아서 n줄만큼 다은과 같이 출력하는 프로그램 작

package Prac5;

import java.util.*;
public class Prac5_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		in.close();
	}
}

