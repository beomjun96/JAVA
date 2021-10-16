//2부터 9까지 수 중 입력받은 수 사이의 구구단을 출력하는 프로그램 작성
//단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력
//구구단 사이의 공백은 3칸이다.

package Prac5;

import java.util.*;
public class Prac5_2 {
	public static void main(String[] arfs) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int num;
		
		if(a<2 || a>9)    // a 범위 안에 들어오기 
		System.out.println("2~9 사이의 두수를 입력해주세요.");
		else
		{
			if (b<2 || b>9)   // b 범위 안에 들어오기 
				System.out.println("2~9 사이의 두수를 입력해주세요.");
			else {
				if (a>b) {
					for (int i = 1; i < 10; i++) {
						num = a;
						for (int j = 0; b < num; j =1) {
							num -= j;
							
							if (num*i < 10)
								System.out.printf("%d * %d =  %d   ",num,i,num*i);
							else
								System.out.printf("%d * %d = %d   ",num,i,num*i);
						}
						System.out.println();
					}
				}
				
				else if (b>a) {
					for (int i = 1; i < 10; i++) {
						num = a;
						for (int j = 0; num < b; j =1) {
							num += j;
							
							if (num*i < 10)
								System.out.printf("%d * %d =  %d   ",num,i,num*i);
							else
								System.out.printf("%d * %d = %d   ",num,i,num*i);
						}
						System.out.println();
					}
					
				}
				
				else
					System.out.println("2~9 중 서로 다른 두 수를 입력해주세요.");

			}
		}
		
				
		
		in.close();
	}
}
