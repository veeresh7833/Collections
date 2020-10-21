package collections;
import java.util.*;
class Student3 implements Comparable<Student3>
{
	int rollno;
	int age;
	String name;
	Student3(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Student3 st)
	{
		/*if(age==st.age)
		{
			return 0;
		}
		else if(age>st.age)
		{
			return 1;
		}
		else
			return -1;*/
		if(name==st.name)
		{
			return 0;
		}
		else if(name.compareTo(st.name)>0)
		{
			return 1;
		}
		else
			return -1;
	}
}
public class Sort {
 public static void main(String [] args)
 {
	ArrayList<Student3> al=new ArrayList<Student3>();
	al.add(new Student3(101,"prasad",23));
	al.add(new Student3(106,"raju",28));
	al.add(new Student3(102,"sai",25));
	Collections.sort(al);
	for(Student3 st :al)
	{
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
 }
}
