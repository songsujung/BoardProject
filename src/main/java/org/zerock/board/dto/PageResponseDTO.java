package org.zerock.board.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
public class PageResponseDTO {
	
	private List<BoardDTO> list;
	private long total;					// PageRequestDTO에서 getCountEnd를 담을 변수

	@Builder(builderMethodName = "withAll")
	public PageResponseDTO(List<BoardDTO> list, long total){
		this.list = list;
		this.total = total;
	}

}
