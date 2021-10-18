package Task1;


class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		account = "441-0290-1203";
		balance = 500000;
		interestRate = 7.3;
	}
	
	public Account(String a, int b, double c) {
		account = a;
		balance = b;
		interestRate = c;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getAccount() {
		return account;
	}
	
	public int getBalance() {
		return balance;
	}
	
	double calculateInterest() {
		double interbal;
		interbal = balance * interestRate *0.01;
		return interbal;
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		balance -= money;
	}
	
}

public class AccountTest{
	public static void main(String[] args) {
		Account acc = new Account();
		System.out.printf("계좌정보: %s 현재잔액: %d \n",acc.getAccount(),acc.getBalance());
		acc.deposit(20000);
		System.out.printf("계좌정보: %s 현재잔액: %d \n",acc.getAccount(),acc.getBalance());
		System.out.println("이자: " + acc.calculateInterest());
	}
}