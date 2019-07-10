package RecursiveEx;

public class Star {
	
	static void draw(int d) {
		if(d<=0) return;
		draw(d-1);
		System.out.print("*");
	}
	
	static void spaceDraw(int d) {
		if(d<=0) return;
		spaceDraw(d-1);
		System.out.print(" ");
	}
	
	
	static void RightTriangleStar(int n) {
		if(n<=0) return;
		RightTriangleStar(n-1);
		draw(n);
		System.out.println();
	}
	
	static String IsoscelesTriangle(int n, int s) {
		if(n==0) return "";
		spaceDraw(n-1);
		draw(s+1);
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		RightTriangleStar(5);
		

	}

}
