package org.zerock.board;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class BoardApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() {
	}


	@Test
	public void testConnection(){

		try(Connection con = dataSource.getConnection()){
			
			log.info("-----------------------------");
			log.info("-----------------------------");
			log.info("-----------------------------");

			log.info(con);

			log.info("-----------------------------");

		}catch(Exception e){
			
			e.printStackTrace();
		}
	}

}
