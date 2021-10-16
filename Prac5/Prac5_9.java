//자연수 n을 입력받아 "출력 예"와 같이 n x n 크기에 공백으로 구분하여 출력
//10 미만의 홀수만 출력
//주의! 숫자는 공백으로 구분하되줄사이에 빈줄은 없음.
//1 3 5
//7 9 1
//3 5 7
package Prac5;

import java.util.*;
public class Prac5_9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a=1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ",a);
				a += 2;
				a = a%10;
				
			}
			System.out.println();
		}
		
		
		in.close();
	}
}
