//1.[사과 , 포도 , 딸기  , 복숭아 , 치즈 , 사과 , 사과, 포도, 자두 , 치즈 , 포도 ]
//이걸 map에 넣고 가장 많이 중복이 된것을 출력하세요.
package ArrayListEx;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String[] array = new String[] { "사과 ", "포도", "딸기", "복숭아", "치즈", "사과", "사과", "포도", "자두", "치즈", "포도" };
		int Max = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		System.out.println(map); 
		
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<i; j++) {
				if(map.get(array[i]) > (map.get(array[j]))) {
					Max = i;
				}
			}
		}
		System.out.println("가장 많은 과일 "+array[Max] + "는 " + map.get(array[Max]));
	}
}
