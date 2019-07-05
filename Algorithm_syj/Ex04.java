import java.util.Scanner;

public class Ex04 {
	// 마름모 별찍기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int count = sc.nextInt();
		int mid = count / 2 + 1;
		
		
		for (int i = 0; i < mid; i++) {
			for (int j = 1; j < count+1; j++) {
				if (j >= mid - i && j <= mid + i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = mid-1; i > 0 ; i--) {
			for (int j = 1; j < count; j++) {
				if (j >= mid-i+1 && j <= mid+i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
