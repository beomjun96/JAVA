// 세 개의 정수를 입력받아 합과 평균을 출력하는 프로그램을 작성하시오.
// (단, 평균은 소수 이하를 버림하여 정수 부분만 출력)
// 입력 20 50 100
// 출력 sum = 170  avg = 56

package Practice1;

import java.util.*;
public class Practice1_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y,z,sum,avg;

		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		sum = x+y+z;
		avg = sum/3;
		
		System.out.println("sum=" + sum + "\navg=" +  avg);
		
		input.close();
	}

}
