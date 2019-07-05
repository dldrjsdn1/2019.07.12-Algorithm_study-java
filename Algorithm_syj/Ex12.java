import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("문자 세개 입력: ");
	String result =sc.nextInt()*sc.nextInt()*sc.nextInt()+"" ;
	int[] array = new int[50];
	
	for (int i = 0; i < array.length; i++) {
		array[i] = result.charAt(i);
	}
	System.out.println(array);
	}

}
