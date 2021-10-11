// 윤년 판별
// 400으로 나누어떨어지면 윤년이다. 또는 4로 나누어떨어지고 100으로 나누어 떨어지지 않으면 윤년이다. 나머지는 평

package Prac3;

import java.util.*;
public class Prac3_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("년도를 입력해주세요.");
		int year = in.nextInt();
		
		if (year%400 == 0)
			System.out.println("leap year");
		else if (year%4 ==0 && year%100 !=0 )
			System.out.println("leap year");
		else
			System.out.println("common year");
		
		in.close();
	}
}
