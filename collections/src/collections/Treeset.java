package collections;
import java.util.*;
public class Treeset {
 public static void main(String [] args)
 {
	//Scanner sc=new Scanner(System.in); 
	 TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	 map.put(100, "zmith");
	 map.put(105, "ravi");
	 map.put(101, "vijay");
	 map.put(103, "rahul");
	 String str="veeresh";
	 map.put(103, str);
	 for(Map.Entry m: map.entrySet())
	 {
	System.out.println(m.getKey()+"  "+m.getValue());
	 }
	 map.remove(103);
	 
	 for(Map.Entry m: map.entrySet())
	 {
	System.out.println(m.getKey()+"  "+m.getValue());
	 }
 }
}
