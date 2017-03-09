package wiki.java.basics;

public class BookSwapper {
 public void swapTitle(Integer b1, Integer b2) 
 {
	 Integer temp = b1;
	 b1 = b2;
	 b2 = temp;
 }
 
 public static void main(String[] args) {
	 BookSwapper b = new BookSwapper();
	 Integer x =42;
	 Integer y = 36;
	 b.swapTitle(x,y);
	 System.out.println(x +" " + y);
}
}
