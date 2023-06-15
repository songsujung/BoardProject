package org.zerock.board.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.dto.BoardDTO;
import org.zerock.board.dto.PageRequestDTO;
import org.zerock.board.mappers.BoardMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardTest {
	
	@Autowired(required = false)
	private BoardMapper boardMapper;

	@Test
	public void modifyTest() {
		
		BoardDTO dto = BoardDTO.builder()
		.bno(720866)
		.title("수정")
		.content("수정함")
		.build();

		boardMapper.modify(dto);

		
		
		log.info(dto);
	

	}

	@Test
	public void deleteTest(){

		int result = boardMapper.delete(1);

		if (result == 0) {
			log.info("실패");
		}else{
			log.info("성공");
		}
	}

	@Test
	public void readTest(){

		BoardDTO dto = boardMapper.read(1);

		log.info("============================");
		log.info("============================");
		log.info(dto);
	}

	@Test
	public void registTest(){
		
		BoardDTO dto = BoardDTO.builder()
				.title("test title")
				.content("test content")
				.writer("test writer")
				.build();

				boardMapper.regist(dto);

				log.info("============================");
				log.info("============================");
				log.info(dto);
				log.info("============================");
				log.info("============================");
				
	}

	@Test
	public void getList(){

		List<BoardDTO> list = boardMapper.getList();

		log.info(list);
	}
	
}
