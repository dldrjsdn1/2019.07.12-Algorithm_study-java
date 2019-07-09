import java.util.ArrayList;
import java.util.List;

public class ArrayListEx_Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		List<String> list5 = new ArrayList<String>();
		List<String> list6 = new ArrayList<String>();
		
		list.add("a"); //너무한거 아니야
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		list2.add("c");
		list2.add("d");
		list2.add("f");
		list2.add("e");
		list2.add("g");
		
//		for (int i = 0; i < list3.size(); i++) {
//			if(list.get(i).equals(list2.get(i)))
//				list3.add(list.get(i));
//			else
//				list5.add(list.get(i));
//		}
//		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if(list.get(i).equals(list2.get(j))
						list3.add(e)
			}
		}
		
		
		
		
		
		
//		for (int i = 0; i < list4.size(); i++) {
//			list4.add(list.get(i));
//			list4.add(list2.get(i-list.size()));
//		}
		
		list4.addAll(list);
		list4.addAll(list2); 
		
		
		
		list6.add("r");
		list6.add("a");
		list6.add("c");
		list6.add("f");
		list6.add("d");
		list6.add("f");
		list6.add("b");
		list6.add("v");
		
		for (int i = 0; i < list6.size(); i++) {
			list6.sort(null);
			
		}
		
		System.out.println(list3);
		System.out.println(list4);
		System.out.println(list5);
		System.out.println(list6);
		
	}

}
