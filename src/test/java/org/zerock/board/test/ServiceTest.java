package org.zerock.board.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.dto.BoardDTO;
import org.zerock.board.service.BoardService;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class ServiceTest {

	@Autowired
	private BoardService boardService;

	@Test
	public void deleteService(){

		int result = boardService.delete(720876);

		log.info(result);

	}

	@Test
	public void read(){

		BoardDTO dto = boardService.read(720877);

		log.info(dto);
	}

	@Test
	public void registService(){

		BoardDTO boardDTO = BoardDTO.builder()
		.title("title")
		.content("content")
		.writer("yewon")
		.build();

		boardService.registBoard(boardDTO);

		log.info(boardDTO);

	}

	@Test
	public void modifyServiceTest() {

		BoardDTO dto = BoardDTO.builder()
		.bno(720865)
		.title("test")
		.content("test123")
		.build();

		boardService.modifyService(dto);

		log.info(dto);

	}

	public static void main(){
		Tblboard tblboad = new Tblbo
	}

	
}
