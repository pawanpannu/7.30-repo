package pkg_6;

public class classABC 
{
	public classABC()
	{
		System.out.println("default constructor");
	}

	public classABC(int a)
	{
		
		System.out.println("one parameterized constructor");
	}
	public classABC(int a, int b)
	{
		System.out.println("two parameterized constructor");
	}
	public classABC(int a, int b,int c)
	{
		this(4,7,8,7);
		System.out.println("three parameterized constructor");
	}
	
	public classABC(int a, int b,int c,int d)
	{
		
		System.out.println("four parameterized constructor");
	}
	public static void main(String[] args) 
	{
		classABC obj=new classABC(6,7,9);
	}
}
