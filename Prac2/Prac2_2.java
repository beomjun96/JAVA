// 3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력
// 세 개의 수가 몸두 같으면 1 아니면 0을 출력하는 프로그램을 작

package Prac2;

import java.util.*;
public class Prac2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a>b && a>c) 
			System.out.print("1 ");
		else
			System.out.print("0 ");
		
		if (a==b && a==c )
			System.out.print("1 ");
		else
			System.out.print("0 ");
		
		input.close();
	}
}
