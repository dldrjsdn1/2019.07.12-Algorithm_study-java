package basicstudy;

import java.util.Scanner;

public class square1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < m+1; j++) {
				System.out.print(sum++ + " ");
			}
			System.out.println("");
		}
		sc.close();
	}
}
