// http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=795&sca=20
import java.util.Scanner;

public class starTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int height = 0;
		int kinds = 0;
		

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
			int mid = height-1; // 맨 마지막에 나오는 별의 갯수 기준으로 중앙을 잡으면 height-1이된다.(5개->마지막 9개별->중앙 5번째)
			int num =1;
			
			for(int i=0; i<height; i++) {
				for(int j=0; j<mid; j++) {
					System.out.print(" ");
				}
				for(int k=0; k < num; k++)
					System.out.print("*");
				mid--;
				num+=2;
				System.out.println();
			}
		}
	}
}
