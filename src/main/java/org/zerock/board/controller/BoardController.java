package org.zerock.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.board.dto.BoardDTO;
import org.zerock.board.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/board/")
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;

	// 목록
	@GetMapping("list")
	public void list(Model model){

		log.info("list......");

		List<BoardDTO> list = boardService.getList();

		model.addAttribute("board", list);
		
	}

	// 등록
	@GetMapping("regist")
	public void getRegistForm(){

		log.info("GET regist............");

	}


	// 등록 뿌려
	@PostMapping("regist")
	public String registBoard(BoardDTO boardDTO){
		boardService.registBoard(boardDTO);

		return "redirect:/board/list";

	}

	// 조회
	@GetMapping("read/{bno}")
	public String getRead(@PathVariable("bno") int bno, Model model){

		log.info("GET read............");

		BoardDTO dto = boardService.read(bno);

		model.addAttribute("read", dto);

		return "/board/read";
	}


	// 수정
	@GetMapping("modify/{bno}")
	public String getModify(@PathVariable("bno") int bno, Model model) {

		log.info("GET Modify............");

		BoardDTO dto = boardService.read(bno);

		model.addAttribute("modify", dto);

		return "/board/modify";

	}

	@PostMapping("modify/{bno}")
	public String postModify(@PathVariable("bno") int bno, BoardDTO boardDTO) {

		boardService.modifyService(boardDTO);

		return "redirect:/board/read/{bno}";

	}

	// 삭제
	@PostMapping("delete/{bno}")
	public String postDelete(@PathVariable("bno") int bno ){

		boardService.delete(bno);

		return "redirect:/board/list";

	}
	


	
}
