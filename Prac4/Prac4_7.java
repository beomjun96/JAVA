//아래와 같이 출력되는 프로그림 작성
// 2 3 4 5 6
// 3 4 5 6 7
// 4 5 6 7 8
// 5 6 7 8 9
// 6 7 8 9 10

package Prac4;

public class Prac4_7 {
	public static void main(String[] args) {
		
		for (int i = 2; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j+i + " ");
			}
			System.out.println();
		}
		
	}
}
