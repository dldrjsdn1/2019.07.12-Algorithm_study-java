//1. arraylist 2개 생성 한 후 중복 된 값을 출력
// 1[ a , b , c ,d ,e ,f]
// 2[c , d ,f ,e ,g]
//1.5 . 1번이랑 2번 합치기
//2. 중복이 안된 거 가져오기
//3.정렬 
//[r , a , c , f , d ,f ,b ,v ] 


package ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class Ex_DuplicateList {
	
	public static void main(String[] args) {
		
	Ex_DuplicateListClass ListClass = new Ex_DuplicateListClass();
	
	List<String> list1 = new ArrayList<String>();
	List<String> list2 = new ArrayList<String>();
	
	
	list1.add("a");
	list1.add("b");
	list1.add("c");
	list1.add("d");
	list1.add("e");
	list1.add("f");
	
	list2.add("c");
	list2.add("d");
	list2.add("e");
	list2.add("f");
	list2.add("g");
	list2.add("h");
	
	//중복 값 출력
	ListClass.overlap(list1,list2);
	
	//리스트 합치기
	ListClass.ListSum(list1,list2);
	
	//중복 아닌 것 가져오기
	ListClass.Deduplication(list1, list2);
	
	}
}
