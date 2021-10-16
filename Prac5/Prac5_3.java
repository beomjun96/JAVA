// 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성 
//1 2 3 4
//2 4 6 8
//3 6 9 12

package Prac5;

import java.util.*;
public class Prac5_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();
		
		for(int i=1; i<=row ;i++)
		{
			int out = i;
			for (int j = 0; j < col; j++) {
				System.out.printf("%d ",out);
				out += i;
			}
			System.out.println();
		}
			
		in.close();
	}
}
