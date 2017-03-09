package wiki.java.basics;

public class PrintLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=0;
    String s="Hello World";
    int j=s.length();
    System.out.println(j);
   
    for(i=0;i<j;i++)
    {
    	System.out.println(s.charAt(j-i-1));
    	
    }
	}
	
}
