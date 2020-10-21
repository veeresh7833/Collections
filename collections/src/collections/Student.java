package collections;
import java.util.*;
public class Student implements Comparable<Student>{
	
int id;
String name;
public  Student(int id,String name)
{
	this.id=id;
	this.name=name;
}
@Override
public int compareTo(Student st)
{
	if(st.id==id)
		return 0;
	else if(st.id<id)
		return 1;
	else return -1;
}
public static void main(String[] args)
{
	Student s1=new Student(101,"prasad");
	Student s2=new Student(99,"vamsi");
	Student s3=new Student(100,"sai");
	List<Student> al=new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	Collections.sort(al);
	//int s=al.size();
	Iterator<Student> i=al.iterator();
	while(i.hasNext())
	{
	Student dd=(Student)i.next();	
	System.out.println(dd.id+" "+dd.name);
	}
}
}
