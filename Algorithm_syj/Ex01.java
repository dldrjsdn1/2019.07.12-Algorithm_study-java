import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		String str = "1";
		String str1 = "2";
		Person p = new Person();
		Person p1 = new Person(1, "null");

		System.out.println(p.equals(p1));

		System.out.println(str.getClass());
		System.out.println(p.getClass());
		System.out.println(str.equals(str1));

		String str3 = (10 == 11) ? "true" : "false ";
		
		System.out.println(Math.max(11,90));

	}

}
