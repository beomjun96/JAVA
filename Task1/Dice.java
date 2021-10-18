package Task1;

import java.util.*;
public class Dice {
	private int value;
	
	public Dice() {
		value = 0;
	}
	
	int sum(int i, int j) {
		value = i + j;
		return value;
	}
	
	int roll() {
		Random ran = new Random();
		return ran.nextInt(6)+1;
	}
	
	public static void main(String[] args) {
		Dice di = new Dice();
		int dice1=0;
		int dice2=0;
		int cnt=0;
		
		while(di.sum(dice1, dice2) != 2) {
		dice1 = di.roll();
		dice2 = di.roll();
		cnt++;
		System.out.printf("주사위1=%d 주사위2=%d\n",dice1,dice2);
		}
		System.out.println("(1,1)이 나오는데 걸린 횟수="+cnt);
	}
}
