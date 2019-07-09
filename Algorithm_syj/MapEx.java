import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] array = { "사과", "포도", "딸기", "복숭아", "치즈", "사과", "사과", "포도", "자두", "치즈", "포도", "사과" };
		int max = 0;
//		for (int i = 0; i < map.size(); i++) {
//			int count = 1;
//			map.put(array[i], count);
//			if (map.containsKey(array[i])== false)
//				map.put(array[i], count++);
//			System.out.println(map.keySet()+" : "+map.get(array[i]));
//				
//		}
//		 for(String key : map.keySet()){
//			 
//	            Integer value = map.get(key);
//	 
//	            System.out.println(key+" : "+value);
//	 
//	        }

		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i]))
				map.put(array[i], map.get(array[i]) + 1);
			else
				map.put(array[i], 1);
		}
		System.out.println(map);

//		Set set = map.keySet();
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			String key = (String)it.next();
//		}
	
		for (int i = 0; i < map.size(); i++) {
			if(map.get(array[i])>max)
				max = map.get(array[i]);
		}
		
		for (int i = 0; i < map.size(); i++) {
			if(map.get(array[i]) == max)
				System.out.println(map.key +":"+map.get(array[i]));
		}
		
		
		
		
	}

}
