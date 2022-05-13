class MyTest extends Thread
{
	int no;
	String st;
	MyTest(int i,String s)
	{
		this.no=i;
		this.st=s;
	}
	public void run()
	{
		for(int i=0;i<this.no;i++)
		{
			System.out.println(this.st+" : "+(i+1));
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		MyTest mt1 = new MyTest(4,"A");
		//MyTest mt2 = new MyTest(3,"B");
		mt1.start();
		//mt2.start();
	}
}