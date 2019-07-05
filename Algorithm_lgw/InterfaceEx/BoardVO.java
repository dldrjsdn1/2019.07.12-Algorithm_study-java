package InterfaceEx;

import java.util.Date;

public class BoardVO {
	
	private String writer;
	private String title;
	private String contents;
	private Date date;
	private int index = 0;
	private String delflag = "N";
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getDelflag() {
		return delflag;
	}
	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}
	@Override
	public String toString() {
		return "BoardVO [writer=" + writer + ", title=" + title + ", contents=" + contents + ", date=" + date
				+ ", index=" + index + ", delflag=" + delflag + "]";
	}
	
	

}
