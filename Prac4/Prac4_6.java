//삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아
//그 문자가 'Y' 나 'y'이면 작업을 반복하고 다른문자면 종

package Prac4;

import java.util.Scanner;

public class Prac4_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char con;
		
		do
		{
			System.out.println("Base = ");
			int wid = in.nextInt();
			
			System.out.println("Height = ");
			int hei = in.nextInt();
			
			double tri =  wid * hei / 2.;
			System.out.println("Triangle width = " + Math.round(tri*10)/10.0 );
			
			System.out.println("Continue? = ");
			char incon = in.next().charAt(0);
			con = incon;

		} while (con == 'y' || con =='Y');
		in.close();
	}
}
