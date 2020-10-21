package collections;
import java.util.*;
class Employee
{
	int id;
	String name;
	int sal;
	 Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
}
public class EmploDemo {
	public static void main(String[] args)
	{
  HashSet<Employee> em=new HashSet<Employee>();
  Employee e1=new Employee(22,"veeresh",200);
  Employee e2=new Employee(2,"sumanth",300);
  Employee e3=new Employee(32,"ram",2000);
  em.add(e1);
  em.add(e2);
  em.add(e3);
  Iterator itr=em.iterator();
  for(Employee e:em)
  {
	  System.out.println(e.id+" "+e.name+" "+e.sal);  
  }

}
}
