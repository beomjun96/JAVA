//민수와 기영이의 키와 몸무게를 입력받아 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출

package Prac2;

import java.util.*;
public class Prac2_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("민수 키와 몸무게 입력");
		int mh = input.nextInt();
		int mw = input.nextInt();
		
		System.out.println("기영 키와 몸무게 입력");
		int kh = input.nextInt();
		int kw = input.nextInt();
		
		if (mh > kh && mw > kw)
			System.out.println("1");
		else
			System.out.println("0");
		
	
		input.close();
	}
}
