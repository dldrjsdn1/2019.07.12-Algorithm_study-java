import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 자연수 입력: ");
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

		for (int i = 0; i < arr.length; i++) {
			if((arr[i] != 2 && arr[i] != 3 && arr[i] !=5) && (arr[i]%2==0 || arr[i]%3==0 || arr[i]%5==0))
				System.out.println("composite number");
			else if (arr[i] == 1)
				System.out.println("number one");
			else
				System.out.println("prime number");
		}
	}
}
