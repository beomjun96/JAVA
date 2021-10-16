//1부터 100까지의 정수 중 한 개를 입력받아 100 보다 작은 배수들을 차례로 출력하다가
//10의 배수가 출력되면 프로그램을 종료하는 프로그램 작
package Prac5;

import java.util.*;
public class Prac5_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int a=1;
		
		
		for (int i = 1; a<100 ; i++) {
			a = num*i;
			if (a>100)
				break;
			
			System.out.printf("%d ",a);
			
			if (a%10==0)
				break;
		}
		
		
		in.close();
	}
}
