package pkg_5;

public class classABC 
{
  int deepak=256;
 
  public void m1(int pawan)
  {
	  deepak=pawan;
	  System.out.println("local variable pawan "+ pawan);
}
  public static void main(String[] args)
  {
	classABC obj=new classABC();
	obj.m1(123);
	System.out.println("value of deepak "+ obj.deepak);
  }

  
}
