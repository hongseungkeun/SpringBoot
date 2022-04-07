package com.example.board.mapper;

import com.example.board.domain.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BoardMapperTests {
    @Autowired
    private BoardMapper boardMapper;

//    @Test
//    public void testInsert(){
//        BoardVO boardVO = new BoardVO();
//        boardVO.setTitle("테스트 제목2");
//        boardVO.setContent("테스트 내용2");
//        boardVO.setWriter("user01");
//
//        boardMapper.insert(boardVO);
//    }

    @Test
    public void testGetList(){
        boardMapper.getList().forEach(board -> log.info(board.toString()));
    }
}












