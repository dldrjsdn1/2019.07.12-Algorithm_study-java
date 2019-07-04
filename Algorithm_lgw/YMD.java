
public class YMD {
	private int y;
	private int m;
	private int d;

	YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	public void YMDAfter(int n) {
		int date = (this.d + n);
		if (date > 31) {
			int month = this.m + 1;
			if (month > 12) {
				this.y = this.y + 1;
				this.m = this.m % 12;
			} else
				this.m = month;
			this.d = date % 31;
		} else
			this.d = date;
		System.out.println(this.y + "년 " + this.m + "월" + this.d + "일");
	}

	public void YMDBefore(int n) {
		int date = (this.d - n);
		if (date < 1) {
			int month = this.m + date/31;
			if (month < 1) {
				this.y = this.y - 1;
				this.m = 12 - this.m;
			} else {
				this.m = month;
			}
			this.d = 31 + date/31 -1;
		} else
			this.d = date;
		System.out.println(y + "년 " + m + "월" + d + "일");
	}
}
