import java.util.ArrayList;
import java.util.List;

public class Board_Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		BoardServiceImp board = new BoardServiceImp();
		board.insertBoard("������", "ù��°", "��������");
		board.insertBoard("������", "�ι�°", "�氡�氡");
		board.insertBoard("������", "����°", "������ʹ�");
		System.out.println(board.listBoard());


	}

}
