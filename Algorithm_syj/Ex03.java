import java.util.Scanner;

public class Ex03 {
	// 삼각형 만들기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int count = sc.nextInt();
		for (int i = 1; i < count+1; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
