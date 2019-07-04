//마름모 별 찍기
import java.util.Scanner;

public class rhombusStar {
	public static void main(String[] args) {
		int count = 0;	// 입력 받는 수
		int mid = 0;	// 행의 중간 값
		int num = 1;	// 2씩 증가하는 별을 찍기 위한 변수

		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 입력 : ");
		count = sc.nextInt();

		mid = count/2 + 1;
		int starStart = mid;	//mid변수는 그대로 두고  별의 시작 위치를 정하기 위한 변수
		int num1 = count;	// 2씩 감소하는 별을 찍기 위한 변수

		for (int i = 0; i < count; i++) {
			if (i < mid) {
				for (int j = 0; j < starStart-1; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < num; k++) {
					System.out.print("*");
				}
				num += 2;
				starStart--;
				System.out.println("");
			}
			
			if (i >= mid) {
				num1-=2;
				for (int j = 0; j < starStart+1; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < num1; k++) {
					System.out.print("*");
				}
				starStart++;
				System.out.println("");
			}
		}
	}
}
