package basicstudy;

import java.util.Scanner;

public class multiple2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		if ((s > 1 && s < 10) && (e > 1 && e < 10)) {
			if (s < e) {
				for (int i = s; i < e + 1; i++) {
					for (int j = 1; j < 10; j++) {
						System.out.print(i + " * " + j + " = " + i * j + "	");
						if (j % 3 == 0) {
							System.out.println("");
						}
					}
					System.out.println("");
				}
			} else {
				for (int i = s; i > e - 1; i--) {
					for (int j = 1; j < 10; j++) {
						System.out.print(i + " * " + j + " = " + i * j + "	");
						if (j % 3 == 0) {
							System.out.println("");
						}
					}
					System.out.println("");
					System.out.println("");
				}
			}
		} else {
			System.out.println("INPUT ERROR!");
		}
		sc.close();
	}
}