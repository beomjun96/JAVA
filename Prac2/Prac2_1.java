/*
두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출
*/

package Prac2;

import java.util.*;
public class Prac2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(a +">" +b +"---" + (a>b) );
		System.out.println(a +"<" +b +"---" + (a<b) );
		System.out.println(a +">=" +b +"---" + (a>=b) );
		System.out.println(a +"<=" +b +"---" + (a<=b) );
		input.close();
	}
}
