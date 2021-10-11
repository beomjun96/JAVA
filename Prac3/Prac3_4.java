//1~12사이의 정수를 입력받아 평년의 경우 해다아 월의 날수를 출력하는 프로그램을 작

package Prac3;

import java.util.*;
public class Prac3_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("월을 입력: ");
		int month = in.nextInt();
		
		switch(month) {
		case 1,3,5,7,8,10,12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 4,6,9,11:
			System.out.println("30");
			break;
		default:
			System.out.println("다시 1~12월 입력해주세요.");
		}
		in.close();
	}
}
