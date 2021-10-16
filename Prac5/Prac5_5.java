//자연수 n을 입력받아서 다음과 같이 출력하는 프로그램 작성
//*****
// ***
//  *

package Prac5;

import java.util.*;
public class Prac5_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = n;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 2*m-1; j > 0; j--) {
				System.out.print("*");
			}
			m--;
			System.out.println();
		}
		in.close();
	}
}
