// 정수를 입력받아 0 이면 "zero" 양수면 "plus" 음수면 "minus" 출

package Prac3;

import java.util.*;
public class Prac3_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		if (x == 0)
			System.out.println("zero");
		else if (x > 0)
			System.out.println("plus");
		else
			System.out.println("minus");
		
		
		in.close();
	}
}
