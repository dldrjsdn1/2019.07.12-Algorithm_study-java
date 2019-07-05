import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int n, m, mid;
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형 높이: ");
		n = sc.nextInt();
		System.out.print("종류: ");
		m = sc.nextInt();
		mid = n;

		if (n > 100)
			System.out.println("INPUT ERROR");

		if (m == 1) {
			for (int i = 1; i < n+1; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		} else if (m == 2) {
			for (int i = -1; i < n-1; i++) {
				for (int j = n - 1; i < j; j--) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		} else {
			for (int i = 0; i < n; i++) { // 종류3짜기
				for (int j = 1; j <= n * 2 - 1; j++) {
					
					if(j >= mid-i && j <= mid +i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
