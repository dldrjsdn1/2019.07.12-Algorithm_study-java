
public class Board_Vo {
	private String witer;
	private String title;
	private String contents;
	private int boardNo;
	
	
	public String getWiter() {
		return witer;
	}
	public void setWiter(String witer) {
		this.witer = witer;
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
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	@Override
	public String toString() {
		return "Board_Vo [witer=" + witer + ", title=" + title + ", contents=" + contents + ", boardNo=" + boardNo
				+ "]";
	}
	
	
	
	

	
	
}
