// http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=1316&sca=20
import java.util.Scanner;

public class numSquare4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int length = 0;
		int kinds = 0;
		int k=1;

		System.out.print("한 변의 길이 : ");
		length = sc.nextInt();
		System.out.print("종류 : ");
		kinds = sc.nextInt();

		if (kinds == 1) {
			for (int i = 1; i <= length; i++) {
				for (int j = 0; j < length; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		} else if (kinds == 2) {
			for (int i = 0; i < length; i++) {
				if (i % 2 == 0) {
					for (int j = 1; j <= length; j++) {
						System.out.print(j);
					}
				}else {
					for (int j = length; j > 0; j--) {
						System.out.print(j);
					}
				}
				System.out.println();
			}
		} else if (kinds == 3) {
			for (int i = 0; i < length; i++) {
				for (int j = 1; j <= length; j++) {
					System.out.print(j*k);
			}
				k++;
				System.out.println();
			}
		} else {
			System.out.println("종류가 없습니다.");
		}
	}
}
