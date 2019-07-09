import java.util.ArrayList;
import java.util.List;

public class Board_Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		BoardServiceImp board = new BoardServiceImp();
		board.insertBoard("서유진", "첫번째", "하이하이");
		board.insertBoard("서유진", "두번째", "방가방가");
		board.insertBoard("서유진", "세번째", "집가고싶다");
		System.out.println(board.listBoard());


	}

}
