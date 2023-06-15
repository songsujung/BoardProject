package org.zerock.board.mappers;

import java.util.List;

import org.zerock.board.dto.BoardDTO;
import org.zerock.board.dto.PageRequestDTO;
import org.zerock.board.dto.PageResponseDTO;

public interface BoardMapper {
	
	// list
	List<BoardDTO> getList(PageRequestDTO pageRequestDTO);

	long getCountEnd(PageRequestDTO pageRequestDTO);

	// regist
	int regist(BoardDTO boardDTO);

	// read
	BoardDTO read(int bno);

	// delete
	int delete(int bno);

	// modify
	int modify(BoardDTO boardDTO);


	

}
