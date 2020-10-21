package collections;
import java.util.*;
public class Linkedhashset {
	public static void main(String [] args)
{
	Set<Integer> linkedHashSet = new LinkedHashSet<>();
	 linkedHashSet.add(3);
	 linkedHashSet.add(1);
	 linkedHashSet.add(2);
	 linkedHashSet.add(2);
	 for (int i : linkedHashSet) {
	     System.out.println(i);
	 }
}
}
