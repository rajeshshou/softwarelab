package softwareLab;

public class jUnitTest 
{
	
	
	public jUnitTest()
	{
		
	}
	//added a comment
	public int mult(int a, int b)
	{
		int c;
		c = a*b;
		return c;
	}
	
	public int sum(int a, int b)
	{
		int c;
		c= a+b;
		return c;
	}
	public static void main(String args[])
	{
		jUnitTest jst = new jUnitTest();
	
		int a[]={2,3,4,5};
		int b[]={6,7,8,9,10};
		
		a=b;
		System.out.println();
		
	}
}
