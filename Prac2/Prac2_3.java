//두 개의 정수를 입력받아서 첫 번째수는 후치 증가 연산자를 사용하고
//두 번째 수는 전치 감소 연산자를 사용하여 두 수의 곱을 구한 후 각각의 값을 출력

package Prac2;

import java.util.*;
public class Prac2_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int mul = x++ * --y;
		
		System.out.print(x+" "+y+" " + mul);
		
		
		input.close();
	}
}
