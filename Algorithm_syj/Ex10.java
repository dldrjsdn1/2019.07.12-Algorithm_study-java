import java.util.Scanner;

public class Ex10 {
//�𸣰ڴٿ� �ڰ�ʹ� �׽ô� �Ӹ�����ȭ,,
	public static void main(String[] args) {
		int n, m, mid;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ﰢ�� ����: ");
		n = sc.nextInt();
		System.out.print("����: ");
		m = sc.nextInt();
		mid = n / 2 + 1;

		if (n > 100)
			System.out.println("INPUT ERROR");
		
		if (m == 1) {
			for (int i = 0; i < mid; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
			for (int i = mid; i < n; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		
		
		}else if(m==2) {
			
		}else if(m==3){
			
		}else {
			
		}

	}

}
