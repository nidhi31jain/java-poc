package wiki.java.basics;

public class ExOverloading {
	public Integer add(int a, int b)
	{
		int result= a+b;
		return result;
	}
	public Integer add(int a, int b,int c)
	{
		int result= a+b+c;
		return result;
	}
	
	public Integer add(int a, int b,int c,int d)
	{
		int result= a+b+c+d;
		return result;
	}

public static void main(String[] args)
		{
	      ExOverloading ex= new ExOverloading();
	      System.out.println(ex.add(1,2,3));
	      
		}
}