//남자는 'M' 여자는 'F로 나타내기로 하고 18세 이상을 성인이라고 하자.

package Prac3;

import java.util.*;
public class Prac3_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("성별(M or W)과 나이를 입력해주세요.");
		
		char sex = in.next().charAt(0);
		int age = in.nextInt();
		
		
		switch(sex) {
		case 'M':
			if (age >= 18)
				System.out.println("MAN");
			else
				System.out.println("BOY");
			break;
		case 'W':
			if (age >= 18)
				System.out.println("WOMAN");
			else
				System.out.println("GIRL");
			break;
		default:
			System.out.println("다시 입력해주세요.");
		}
		
		in.close();
	}
}
