// 자연수 n을 입력받고 1부터 홀수를 차례대로 더해가면서 합이 n이상이면 
// 그 때까지 더해진 홀수의 개수와 그 합을 출

package Prac5;

import java.util.*;
public class Prac5_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		int count = 0;
		
		for (int i = 1; n > sum; i += 2) {
			sum += i;
			
			count++;
		}
		
		System.out.printf("%d %d",count, sum);
		in.close();
	}
}
