package collections;
import java.util.*;
import java.util.List;

public class Testcollections {
public static void main(String [] args)
{
	List<String> list=new ArrayList<String>();
	
	list.add("prasad");
	list.add("ravi");
	list.add("sai");
	list.add("ravi");
	System.out.println(list.size());
	for(String obj:list)
	{
		System.out.println(obj);
	}
	Collections.sort(list);
	for(int i=0;i<list.size();i++)
{
		System.out.println(list.get(i));	
}
}
}
