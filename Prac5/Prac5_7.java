// 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램 작성
// 주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.
//    1
//  1 2
//1 2 3
package Prac5;

import java.util.*;
public class Prac5_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			//빈칸 만들
			for (int j = 1; j <= n-i;j++) {
				System.out.print("  ");
			}
			//숫자 쓰기
			for (int k = 1; k <= i; k++) {
				System.out.printf("%d ",k);
			}
			System.out.println();
			
		}
		
		in.close();
	}
}
