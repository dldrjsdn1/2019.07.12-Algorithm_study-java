import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ݺ� Ƚ���� �Է��ϼ��� : ");
		int count = sc.nextInt();
		
		// 1.Ƚ�� ok
		// 2.�Է� �ޱ� 
		// 3.��
		// 4.�ִ� ����
		
		//ex : 10 20 30 
		int max =0;
		for (int i = 0; i < count ; i++) {
			System.out.print("���ڸ� �Է��ϼ���: ");
			int num = sc.nextInt();
			
			max = Math.max(num,max);
		}
		System.out.println(max);
	}

}
