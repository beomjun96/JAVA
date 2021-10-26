package Task1;


class Book{
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public Book() {
		
	}
	
	public Book(String bookName, int bookPrice, double bookDiscountRate ) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public int getBookPrice() {
		return bookPrice;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	
	public double getDiscountBookPrice() {
		double disbp = bookPrice * (1-0.01 * bookDiscountRate);
		return disbp;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Book bookArray[] = new Book[3];
		int sumBp = 0;
		double sumDisBp = 0;
		
		bookArray[0] = new Book("SQL Plus", 50000,5);
		bookArray[1] = new Book("Java 2.0", 40000,3);
		bookArray[2] = new Book("JSP Servlet", 60000,6);
		
//		get,set 안만들고 출력시 주소로 출력되는데 해결 방법 물어보
//		for (int i = 0; i < bookArray.length; i++) {
//			System.out.println(Arrays.toString(bookArray));
//		}
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println(bookArray[i].getBookName() + " " + bookArray[i].getBookPrice() 
					+ "원 " + bookArray[i].getBookDiscountRate() + "%");
			sumBp += bookArray[i].getBookPrice();
			sumDisBp += bookArray[i].getDiscountBookPrice();
		}
		System.out.println("\n");
		System.out.println("책 가격의 합: "+sumBp+"원");
		System.out.println("할인 된 책 가격의 합: "+sumDisBp+"원");
	}
}
