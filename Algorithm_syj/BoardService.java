import java.util.List;

public interface BoardService {
	public void insertBoard(String witer, String title, String contents);

	public void deleteBoard(int boardNo);

	public void updateBoard(String witer, String title, String contents, int boardNo);

	public List<Board_Vo> listBoard();

}
