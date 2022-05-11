import java.io.*;
import java.util.*;
class Student implements Serializable
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
		return "Roll No = "+this.rollNo + " Name = "+this.name;
	}
	
	public static void main(String asdfg[]) throws Exception
	{
		ArrayList <Student> al = new ArrayList<Student>();
		al.add(new Student(1,"ABC"));
		al.add(new Student(3,"BCD"));
		al.add(new Student(2,"ABD"));
		al.add(new Student(4,"ACD"));
		
		ObjectOutputStream oos = new ObjectOutputStream(
		new FileOutputStream("stud.txt")
		);
		oos.writeObject(al);
		oos.close();
		
		ArrayList <Student> al1 = new ArrayList<Student>();
		ObjectInputStream ois = new ObjectInputStream(
		new FileInputStream("stud.txt")
		);
		al1 = (ArrayList<Student>)ois.readObject();
		ois.close();
		
		for(Student s:al1)
		{
			System.out.println(s);
		}
	}
}