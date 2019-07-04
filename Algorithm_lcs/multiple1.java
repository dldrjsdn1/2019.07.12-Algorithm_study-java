package basicstudy;

import java.util.Scanner;

public class multiple1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		if ((s > 1 && s < 10) && (e > 1 && e < 10)) {
			for (int i = 1; i < 10; i++) {
				if (s < e) {
					for (int j = s; j < e + 1; j++) {
						if (j * i < 10) {
							System.out.print(j + " * " + i + " = " + " " + j * i + " ");
						} else {
							System.out.print(j + " * " + i + " = " + j * i + " ");
						}
					}
				} else {
					for (int k = s; k > e - 1; k--) {
						if (k * i < 10) {
							System.out.print(k + " * " + i + " = " + " " + k * i + " ");
						} else {
							System.out.print(k + " * " + i + " = " + k * i + " ");
						}
					}
				}
				System.out.println("");
			}
		} else {
			System.out.println("INPUT ERROR!");
		}
		sc.close();
	}
}