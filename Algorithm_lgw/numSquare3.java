// http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=2070&sca=20
import java.util.Scanner;

public class numSquare3 {

	public static void main(String[] args) {
		int count=0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("한변의 길이 : ");
		count = sc.nextInt();
		
		for(int i=0; i < count; i++) {
			int num=1;
			num+=i;
			for(int j=0; j < count; j++ ) {
				System.out.print(num+" ");
				num+=count;
			}
			System.out.println();
		}
	}
}
