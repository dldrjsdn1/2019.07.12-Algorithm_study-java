import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수: ");
		int n = sc.nextInt();
		System.out.print("몇번째로 작은 수: ");
		int k = sc.nextInt();
		if (k < 1 || k > n)
			System.out.print("k를 다시 입력해주세요.");

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				list.add(i);
		}

			System.out.println(list.get(k-1));
		
	}

}
