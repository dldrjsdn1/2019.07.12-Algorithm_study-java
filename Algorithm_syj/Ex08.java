import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int n, m, num;
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����: ");
		n = sc.nextInt();
		System.out.print("����: ");
		m = sc.nextInt();
		num = 1;
		int[][] array = new int[n][n];

		if (m == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					array[i][j] = num;
				}
				num++;
			}
		} else if (m == 2) {
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < n; j++)
						array[i][j] = num++;

				} else {
					for (int j = 0; j < n; j++)
						array[i][j] = --num;
				}
			}
		}
		// 3��° ������ �̿ϼ�
		else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					array[i][j] = num++;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) 
				System.out.print(array[i][j] + " ");
			
			System.out.println();
		}
	}

}
