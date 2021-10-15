/* 출력 하시오.
 * kor 90
 * mat 80
 * eng 100
 * sum 270
 * avg 90
 */

package Prac1;

public class Practice1_1 {
	public static void main(String[] agrs) {
		int kor, mat, eng, sum, avg;
		kor = 90;
		mat = 80;
		eng = 100;
		sum = kor + mat + eng;
		avg = sum/3;
		
		System.out.println("kor "+kor);
		System.out.println("mat "+mat);
		System.out.println("eng "+eng);
		System.out.println("sum "+sum);
		System.out.println("avg "+avg);
		
	}
}
