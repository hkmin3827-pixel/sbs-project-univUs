package com.univus.project.dto.todo;

import com.univus.project.entity.Todo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class TodoModifyDto {
    private Long id;        // 수정할 작성자 Id
    private String name;    // 작성자 이름
    private String content; // 할일 내용
    private boolean done;   // 완료 여부
    private Todo todo;
}
