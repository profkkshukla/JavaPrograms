class Student
{
	int rollNo;
	String name;
	Student(int a, String b)
	{
		this.rollNo = a;
		this.name = b;
	}
	public String toString()
	{
		return this.rollNo+" : "+this.name;
	}
}
class MyTestT extends Thread
{
	int no;
	Student st;
	MyTestT(int i,Student s)
	{
		this.no=i;
		this.st=s;
	}
	public void run()
	{
		synchronized(st)
		{
			for(int i=0;i<5;i++)
			{
				System.out.println((i+1));
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
}
public class MyTestSynch
{
	public static void main(String args[])
	{
		System.out.println("START");
		MyTestT mt1 = new MyTestT(40,new Student(11,"A"));
		MyTestT mt2 = new MyTestT(30,new Student(12,"B"));
		
		mt1.setDaemon(true);
		mt2.setDaemon(true);
		mt1.start();
		mt2.start();
		System.out.println("END");
		
		try
		{
			mt1.join();
			mt2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("FINAL END");
	}
}