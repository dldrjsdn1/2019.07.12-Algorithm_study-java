import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ڿ����� �Է��Ͻÿ�: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd = 0; // �ִ�����
		int lcm = 0; // �ּҰ����

		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}

		for (int i = 1; i <= num1 * num2; i++) {
			if (Math.min(num1, num2) * i % Math.max(num1, num2) == 0) {
				lcm = Math.min(num1, num2) * i;
				break;
			}
		}
		System.out.println(gcd);
		System.out.println(lcm);
	}
}
