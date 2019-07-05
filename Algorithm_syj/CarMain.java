import java.util.ArrayList;
import java.util.List;

public class CarMain {

	public static void main(String[] args) {
		List<Car> list = new ArrayList<Car>();

		Car car1 = new Car();
		Car car2 = new Car("±â¾Æ", 50, "black");
		Car car3 = new Car();

		list.add(new Car());
		list.add(car2);
		list.add(car3);

		System.out.println(list.get(0).equals(list.get(1)));
		System.out.println(list.get(0).equals(list.get(2)));

		list.get(0).setColor("y");
		list.get(0).setSpeed(50);
		list.get(0).setName("a");

		System.out.println(list.get(0).equals(list.get(1)));
		System.out.println(list.get(0).equals(list.get(2)));

		int[] a = new int[1];

	}

}
