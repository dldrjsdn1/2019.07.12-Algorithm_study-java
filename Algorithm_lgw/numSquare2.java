
//http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=1129&sca=20
import java.lang.reflect.Array;
import java.util.Scanner;

public class numSquare2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int height = 0;
		int width = 0;
		int i, j;
		int num = 1;

		System.out.print("높이를 입력하시오 : ");
		height = sc.nextInt();
		System.out.print("너비를 입력하시오 : ");
		width = sc.nextInt();

		int arr[][] = new int[height][width];

		for (i = 0; i < height; i++) {
			if (i % 2 == 0) {
				for (j = 0; j < width; j++) {
					arr[i][j] = num++;
				}
			} else {
				for (j = width - 1; j >= 0; j--) {
					arr[i][j] = num++;
				}
			}
			System.out.println();
		}

	}
}
