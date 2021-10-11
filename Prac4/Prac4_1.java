// 100이하의 양의 정수만 입력
// while 문을 이용하여 1부터 입력받은 정수까지의 합 출

package Prac4;

import java.util.*;
public class Prac4_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("100이하의 양의 정수 입력: ");
		
		int num = in.nextInt();
		int i=1, sum=0;
		
		if (num>100 || num<0)
			System.out.println("1~100 정수를 입력해주세요.");
		else
		{
			while (i <= num) {
				sum += i;
				i++;
			}
			System.out.println("sum = " + sum);
		}
		in.close();
	}
}
