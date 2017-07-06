package caesar;

public class Caesar 
{
	int key;
	String s1;
	public Caesar(String s1,int key)
	{
		this.s1=s1;
		this.key=key;
	}
	public void encrpty()
	{
		for(int i=0;i<s1.length();i++)
		{
			int c,a;
			c = (int)s1.charAt(i);
			a = c+key;
			System.out.print(""+(char)a);
		}
	}
	public void decrpty()
	{
		for(int i=0;i<s1.length();i++)
		{
			int c,a;
			c=(int)s1.charAt(i);
			a=c-key;
			System.out.print(""+(char)a);
		}
	
	}
}
