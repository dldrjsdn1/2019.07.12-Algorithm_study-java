package RecursiveEx;

public class Ex1 {

	public static int func(int n){
		if(n<=1) 
			return n;
		else
			return func(n-1)*n;
	}
	
	public static void main(String[] args) {
		
		System.out.println(func(5));
	}
}
