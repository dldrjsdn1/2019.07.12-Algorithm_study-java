import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("반복 횟수를 입력하세요 : ");
		int count = sc.nextInt();
		
		// 1.횟수 ok
		// 2.입력 받기 
		// 3.비교
		// 4.최댓값 저장
		
		//ex : 10 20 30 
		int max =0;
		for (int i = 0; i < count ; i++) {
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();
			
			max = Math.max(num,max);
		}
		System.out.println(max);
	}

}
