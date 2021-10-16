//자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력
//주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.

package Prac5;

import java.util.*;
public class Prac5_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a=1;
		
		for (int i = 0; i < n; i++) {
			//빈칸 만들
			for (int j = 0; j < i ; j++) {
				System.out.print("  ");
			}
			//숫자 쓰
			for (int k = 1; k <= n-i; k++) {
				System.out.printf("%d ",a);
				a++;
			}
			System.out.println();
		}
		
		in.close();
	}
}
