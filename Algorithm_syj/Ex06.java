import java.util.Scanner;

public class Ex06 {
	// ���� �簢��2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w;
		System.out.print("����: ");
		h = sc.nextInt();
		System.out.print("�ʺ�: ");
		w = sc.nextInt();
		int num = 1;

		int[][] array = new int[h][w];

		for (int i = 0; i < h; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < w; j++) {
					array[i][j] = num++;
				}
			} else {
				for (int j = w - 1; j >= 0; j--) {
					array[i][j] = num++;
				}
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

// �ϼ��ȵ�,,,