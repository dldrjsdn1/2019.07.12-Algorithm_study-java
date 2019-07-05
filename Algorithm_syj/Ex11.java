import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력해라: ");
		String str = sc.nextLine();
		int m = 0;
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		for (int i = 0; i < str.length(); i++) {
			m += str.charAt(i)-'0';
		}

		System.out.println(sb.reverse() + " " + m);
	}

}
