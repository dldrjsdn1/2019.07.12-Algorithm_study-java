import java.sql.Date;

public class YMD {
	private int y;
	private int m;
	private int d;

	YMD() {
		this.y = 2019;
		this.m = 1;
		this.d = 1;
	}
	
	YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	public void YMDAfter(int n) {
		Date date = new Date(y-1900,m-1, d+n);
		System.out.println(date);
	}

	public void YMDBefore(int n) {
		Date date = new Date(y-1900,m-1, d-n);
		System.out.println(date);
	}
	
}
