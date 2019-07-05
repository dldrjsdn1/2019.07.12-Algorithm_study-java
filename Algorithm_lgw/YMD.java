import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse('"'+this.y+'-'+this.m+'-'+this.d+'"');
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE,n);
		
		System.out.println(format.format(cal.getTime()));
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
	
	int[] a = {1,2,3,4};
}
