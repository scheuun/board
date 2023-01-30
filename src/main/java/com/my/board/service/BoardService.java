package com.my.board.service;

import com.my.board.model.Board;

import java.util.List;

public interface BoardService {
    List<Board> listBoard(int start);
    List<Board> detailBoard(int boardNum);
    int insertBoard(Board board);
    double countBoard();
}
