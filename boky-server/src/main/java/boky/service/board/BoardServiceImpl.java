package boky.service.board;

import boky.controller.BoardRequest;
import boky.entity.board.Board;
import boky.repository.board.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    BoardRepository repository;
    @Override
    public List<Board> BoardList() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "boardNo"));
    }

    @Override
    public void write(BoardRequest boardRequest) {
        String title = boardRequest.getTitle();
        String content = boardRequest.getContent();
        Board board = new Board(
                title,
                content
        );

        repository.save(board);
    }
}
