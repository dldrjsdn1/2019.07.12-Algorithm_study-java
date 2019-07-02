// 값이 다르게 나옴

import java.util.Scanner;

public class starTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int height = 0;
		int kinds = 0;
		int num =1;

		System.out.print("한 변의 길이 : ");
		height = sc.nextInt();
		System.out.print("종류 : ");
		kinds = sc.nextInt();
		
		if(kinds == 1) {
			for(int i=1; i<=height; i++) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else if(kinds == 2) {
			for(int i=height; i>0; i--) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else if(kinds == 3) {
			int mid = height/2+1;
			
			for(int i=0; i<height; i++) {
				for(int j=1; j<=height; j++) {
					if(j == mid) {
						for(int k=0; k < num; k++)
						System.out.print("*");
					}
					System.out.print(" ");
				}
				mid-=1;
				num+=2;
				System.out.println();
			}
		}
	}

}
