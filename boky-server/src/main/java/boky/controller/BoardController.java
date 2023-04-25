package boky.controller;

import boky.entity.board.Board;
import boky.service.board.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("current/board")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class BoardController {

    @Autowired
    private BoardService service;

    @GetMapping("/list")
    public void list (){
        List<Board> tmp = service.BoardList();
        log.info("list()");
        log.info(tmp.toString());
    }
    @PostMapping("/register")
    public void register (@RequestBody BoardRequest boardRequest) {
        log.info("register()");
        service.write(boardRequest);
    }
}
