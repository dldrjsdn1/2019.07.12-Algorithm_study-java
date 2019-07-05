import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Scanner sc = new Scanner(System.in);

		System.out.print("�ζǹ�ȣ ���� ���� �Է�: ");
		int gameCnt = sc.nextInt();

		for (int i = 1; i <= gameCnt; i++) {
			System.out.println(i + "��° �ζǹ�ȣ: " + lotto.lottoNumbers());
		}
	}

	String lottoNumbers() {
		int[] lottoNums = new int[6];
		for (int i = 0; i < 6; i++) {
			lottoNums[i] = (int) (Math.random() * 45 + 1);
		}
		// ����
		Arrays.parallelSort(lottoNums);

		return Arrays.toString(lottoNums);
	}

}
