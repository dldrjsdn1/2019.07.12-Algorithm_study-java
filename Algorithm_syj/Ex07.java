import java.util.Scanner;

public class Ex07 {
 //숫자사각형3
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정사각형 한 변 길이: ");
		int n = sc.nextInt();
		int num = 1;

		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[j][i] = num++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
