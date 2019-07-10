package ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class Ex_DuplicateListClass {
	
	//중복 출력
	
	public void overlap(List<String> list1, List<String> list2) {
		List<String> store = new ArrayList<String>();
		
		for(int i=0; i<list1.size();i++) {
			for(int j=0; j<list2.size();j++)
			if(list1.get(i).equals(list2.get(j))) {
				store.add(list2.get(j));
			}
		}
		
		System.out.println(store);
		System.out.println("중복 값 출력");
	}
	
	public void ListSum(List<String> list1, List<String> list2) {
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println("두 리스트 병합");
	}
	
	
//	public void Deduplication(List<String> list1, List<String> list2) {
//		
//		for(int i=0; i<list1.size();i++) {
//			for(int j=0; j<list2.size();j++)
//			if(!list1.get(i).equals(list2.get(j))) {
//				list1.add(list2.get(j));
//			}
//		}
//		System.out.println(list1);
//		System.out.println("중복 아닌 것만 출력");
//	}

}
