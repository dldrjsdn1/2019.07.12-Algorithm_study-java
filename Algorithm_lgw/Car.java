import java.util.ArrayList;

//자동차 만들기, 카 클래스, 메인, 카 변수 3개 이상, 변수는 private, 재정의 자동완성 사용 안함, 메인에서 arrayList 타입으로 객체를 저장, 객체 비교, 객체 값 수정
public class Car {

	public static void main(String[] args) {
		ArrayList<CarInfo> vo = new ArrayList<CarInfo>();
		
		vo.add(new CarInfo("건우","green",180));
		vo.add(new CarInfo("준서","red",200));
		vo.add(new CarInfo("유진","blue",110));
		vo.add(new CarInfo("건우","green",180));
		
		System.out.println(vo.get(0).equals(vo.get(1)));
		System.out.println(vo.get(0).equals(vo.get(3)));
		
		
	}
}
