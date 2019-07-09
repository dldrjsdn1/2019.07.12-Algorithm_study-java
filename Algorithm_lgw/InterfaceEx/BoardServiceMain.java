package InterfaceEx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardServiceMain {

	public static void main(String[] args) {
		
		BoardVO vo = new BoardVO();
		BoardImpl boardImpl = new BoardImpl();
		
		List<BoardVO> list = new ArrayList<>();
		list = boardImpl.select();
		
		
		
		vo.setWriter("이건우");
		vo.setTitle("제목");
		vo.setContents("내용");
		vo.setDate(new Date());
		
		boardImpl.Insert(vo);
		
		vo.setWriter("이건우1");
		vo.setTitle("제목1");
		vo.setContents("내용1");
		vo.setDate(new Date());
		
		boardImpl.Insert(vo);
//		
//		vo.setWriter("수정 - 이건우1");
//		vo.setTitle("수정 - 1");
//		vo.setContents("수정 -1");
//		vo.setDate(new Date());
//		vo.setIndex(0);
//		
//		boardImpl.Update(vo);
		
		
		boardImpl.Delete(0);
		
		System.out.println(list.get(0).toString());
//		System.out.println(list.get(1).toString());
		
		
	}
}
