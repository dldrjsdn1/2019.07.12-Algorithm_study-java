// 마름모 못품
import java.util.Scanner;

public class java1 {
	public static void main(String[] args) {
		int count = 0;
		int center = 0;
		int num = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 입력 : ");
		count = sc.nextInt();

		center = count / 2 + 1;

		for (int i = 0; i < count; i++) {
			for (int k = 0; k < count; k++) {
				System.out.print(" ");
				if (k == center) {
					for (int j = 0; j < num; j++) {
						System.out.print("*");
					}
				}
			}
			center--;
			num+=2;
			System.out.println();
		}
	}
}
