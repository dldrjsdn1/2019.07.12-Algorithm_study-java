import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		int[] arr = new int[7];
		Random r = new Random();
		
		
		for(int i=0; i<7; i++) {
			arr[i] = r.nextInt(45)+1;
			for(int j=0; j<i;j++) {
				if(arr[j] == arr[i])
					i--;
			}
		}
		for(int i=0; i<7; i++) {
		System.out.print(arr[i]+" ");
		}
	}

}
