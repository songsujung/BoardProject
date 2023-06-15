package org.zerock.board.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.board.dto.BoardDTO;
import org.zerock.board.dto.PageRequestDTO;
import org.zerock.board.dto.PageResponseDTO;

@Transactional
public interface BoardService {
	

	// 목록
	public PageResponseDTO<BoardDTO> getList(PageRequestDTO pageRequestDTO);


	// 수정
	public int modifyService(BoardDTO boardDTO);

	
	// 등록
	public int registBoard(BoardDTO boardDTO);

	// 조회
	public BoardDTO read(int bno);

	// 삭제
	public int delete(int bno);


}
