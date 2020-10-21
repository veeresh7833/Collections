package collections;
import java.util.*; 
import java.lang.*; 
public class Hashmap {

		// function to sort hashmap by values 
		public static HashMap<String, String> sortByValue(HashMap<String, String> hm) 
		{ 
			// Create a list from elements of HashMap 
			List<Map.Entry<String, String> > list = 
				new LinkedList<Map.Entry<String, String> >(hm.entrySet()); 

			// Sort the list 
			Collections.sort(list, new Comparator<Map.Entry<String, String> >() { 
				public int compare(Map.Entry<String, String> o1, 
								Map.Entry<String, String> o2) 
				{ 
					return (o1.getValue()).compareTo(o2.getValue()); 
				} 
			}); 
			
			// put data from sorted list to hashmap 
			HashMap<String, String> temp = new LinkedHashMap<String, String>(); 
			for (Map.Entry<String, String> aa : list) { 
				temp.put(aa.getKey(), aa.getValue()); 
			} 
			return temp; 
		} 

		// Driver Code 
		public static void main(String[] args) 
		{ 

			HashMap<String, String> hm = new HashMap<String, String>(); 
			String []arr ={ "baqwer", "zacaeaz", "aaqzzaa", 
		            "aacaap", "abbatyo", "bbbacztr", 
		            "bbbdaaa" }; 
			int l=2,x=2;
			for(int  i=0;i<arr.length;i++)
			{
            hm.put(arr[i],arr[i].substring(l,x+l));
			}
			
			Map<String, String> hm1 = sortByValue(hm); 

			// print the sorted hashmap 
			for (Map.Entry<String, String> en : hm1.entrySet()) { 
				System.out.println(en.getKey());
			} 
		} 
		}
