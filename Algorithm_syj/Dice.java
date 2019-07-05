
public class Dice {

	public static void main(String[] args) {

		int[] arr = new int[6];

		for (int i = 0; i < 30; i++) {
			arr[(int) (Math.random() * 6)]++;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

// 혹은 이것도 됨
//	int[] arr = new int[6];
//
//	for (int i = 0; i < 30; i++) {
//		int num = (int) (Math.random() * 6 + 1);
//		for (int j = 0; j < arr.length; j++) {
//			if (num == j-1)
//				arr[j]++;
//		}
//	}
//	for (int i = 0; i < arr.length; i++) {
//		System.out.println(arr[i]);
//	}
//
//}
