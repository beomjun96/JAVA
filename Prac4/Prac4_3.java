// 한개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작
package Prac4;

import java.util.*;
public class Prac4_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for (int i = 1; i < 11; i++) {
			System.out.print(num*i + " ");
		}
		
		in.close();
	}
}
