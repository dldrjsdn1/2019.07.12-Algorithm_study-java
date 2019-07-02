// http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=288&sca=20
import java.util.Scanner;

public class numberReverseSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String num = "";
		int sum =0;
		
		System.out.print("숫자입력 : ");
		num = sc.nextLine();
		
		char[] array_word = new char[num.length()];
		
		for(int i=0;i<array_word.length;i++){ 
			array_word[i]=(num.charAt(i));
		}
		
		for(int i=0; i<array_word.length; i++) {
			System.out.print(array_word[(array_word.length-1)-i]);
		}
		
		System.out.println();
		
		for(int i=0; i<array_word.length; i++) {
			sum += (array_word[(array_word.length-1)-i]) -'0';
		}
		System.out.print(sum);
	}
}
