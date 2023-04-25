package boky.entity.board;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;


@Data
@Entity
@AllArgsConstructor
public class Board {

    public Board() {
        // 기본 생성자 코드
    }
    @Id
    @Column(name = "board_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardNo;

    @Column(length = 128, nullable = false)
    private String title;

    @Lob
    private String content;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
