package collections;
import java.util.*;
public class Linkedlsit {
	public static void main(String [] args)
	{
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("prasad");
		list.add("ravi");
		list.add("sai");
		list.add("ravi");
		list.addFirst("sesi");
		list.addLast("rk");
		list.remove("rk");
		//list.remove(1);
		//list.removeFirst();
		//list.removeLast();
		list.set(1, "god");
		 for (int i = 0; i < list.size(); i++) {  
			    
	            System.out.print(list.get(i) + " ");  
	        }  
		 System.out.println("The first occurrence of 10 is at index: "  
                 + list.indexOf("god"));
		 //list.lastIndexOf("god");
		System.out.println(list.size());
		for(String obj:list)
		{
			System.out.println(obj);
		}
		/*Collections.sort(list);
		for(int i=0;i<list.size();i++)
	{
			System.out.println(list.get(i));	
	}*/
	}
}
