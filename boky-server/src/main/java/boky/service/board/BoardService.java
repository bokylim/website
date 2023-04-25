package boky.service.board;

import boky.controller.BoardRequest;
import boky.entity.board.Board;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BoardService {

    public List<Board> BoardList();
    // 질문게시판 게시물 등록
    public void write(BoardRequest boardRequest);
}
