// http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=992&sca=20
import java.util.Scanner;

public class starTriangle2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int height = 0;
		int kinds = 0;
		int num=0;
		int num1=1;

		System.out.print("높이 : ");
		height = sc.nextInt();
		System.out.print("종류 : ");
		kinds = sc.nextInt();

		int mid = height/2 +1 ;

		if (kinds == 1) {
			for (int i = 1; i <= height; i++) {
				if (i <= mid) {
					for (int j = 0; j < i; j++) {
						System.out.print("*");
					}
					System.out.println("");
				}else if(i > mid){
					mid -= 1;
					for (int j = mid; j > 0; j--) {
						System.out.print("*");
					}
					System.out.println("");
				}
			}
		} else if (kinds == 2) {
			for(int i =0; i<height; i++) {
				if(i < mid) {
					for(int j=0; j<i; j++) {
						System.out.print(" ");
					}
					for(int k = height; k >num; k--) {
						System.out.print("*");
					}
					num+=2;
					System.out.println("");
				}
				
				if(i >= mid) {
					num1+=2;
					for(int j=i+1; j<height; j++) {
						System.out.print(" ");
					}
					for(int k = 0; k < num1; k++) {
						System.out.print("*");
					}
					
					System.out.println("");
				}
			}
		} else {
			System.out.println("INPUT ERROR!");
		}

	}

}