package InterfaceEx;

import java.util.ArrayList;
import java.util.List;

public class BoardImpl implements BoardService{
	
//	BoardVO vo = new BoardVO();
	public List<BoardVO> voList= new ArrayList<>();
	

	@Override
	public void Insert(BoardVO boardVO) {
		BoardVO vo = new BoardVO();
		vo.setWriter(boardVO.getWriter());
		vo.setTitle(boardVO.getTitle());
		vo.setContents(boardVO.getContents());
		vo.setDate(boardVO.getDate());
		vo.setDelflag(boardVO.getDelflag());
		
		voList.add(vo);
		voList.get(vo.getIndex()).setIndex(boardVO.getIndex()+1);
	}
	
	@Override
	public void Update(BoardVO boardVO) {
		BoardVO UpdateVO = voList.get(boardVO.getIndex());
		UpdateVO.setWriter(boardVO.getWriter());
		UpdateVO.setTitle(boardVO.getTitle());
		UpdateVO.setContents(boardVO.getContents());
		UpdateVO.setDate(boardVO.getDate());
		UpdateVO.setDelflag(boardVO.getDelflag());
	}
	
	@Override
	public void Delete(int index) {
		BoardVO DeleteVO = voList.get(index);
		DeleteVO.setDelflag("Y");
	}
	
	public List<BoardVO> select() {
		return voList;
	}

}
