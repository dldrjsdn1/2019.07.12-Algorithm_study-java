import java.util.ArrayList;
import java.util.List;

public class BoardServiceImp implements BoardService {
	static int count = 1;
	List<Board_Vo> list = new ArrayList<Board_Vo>();

	@Override
	public void insertBoard(String witer, String title, String contents) {
		Board_Vo vo = new Board_Vo();
		vo.setBoardNo(count++);
		vo.setWiter(witer);
		vo.setTitle(title);
		vo.setContents(contents);
		list.add(vo);
	}

	@Override
	public void deleteBoard(int boardNo) {
		list.remove(boardNo);
	}

	@Override
	public void updateBoard(String witer, String title, String contents, int boardNo) {

		Board_Vo vo = new Board_Vo();
		vo.setBoardNo(count);
		vo.setWiter(witer);
		vo.setTitle(title);
		vo.setContents(contents);
		
		list.remove(boardNo);
		list.add(boardNo, vo);
		
	}

	@Override
	public List<Board_Vo> listBoard() {

		return list;
	}

}
