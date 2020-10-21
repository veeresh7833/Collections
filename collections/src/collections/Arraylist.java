package collections;
import java.util.*;
public class Arraylist {
	public static void main(String [] args)
	{
		List<String> list=new ArrayList<String>();
		List<String> list2=new ArrayList<String>();
		list.add("veeresh");
		list.add("ravi");
		list2.add("rk");
		list2.add(1,"vinay");
		list.addAll(list2);
		//list.clear();
		//boolean n=list.equals(list2);
		//System.out.println(list);
		list.set(1, "sesi");
		System.out.println(list.get(1));
		System.out.println(list.size());
		Object [] array=list.toArray();
		boolean b=list.contains("rk");
		/*System.out.println(b);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}*/
		list.remove(1);
		list.remove("rk");
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		list2=list.subList(0, 2);
		System.out.println(list2);
		/*Collections.sort(list);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
	}

}
