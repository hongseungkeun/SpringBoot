package com.example.board.mapper;

import com.example.board.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
//    게시글 목록
    public List<BoardVO> getList();

//    게시글 작성 (insert)
    public void insert(BoardVO boardVO);
}
