package org.koreait.board.entities;

import lombok.Data;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode 전부 포함됐음.
public class Board {
    // 연습용 게시판이니 4개로만 해서 만들어보기.

    private long seq; // 게시글 번호
    private String poster; // 작성자
    private String subject; // 제목
    private String content; // 내용
}
