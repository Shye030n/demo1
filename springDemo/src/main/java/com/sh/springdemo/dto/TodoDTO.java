package com.sh.springdemo.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor //디폴트 생성자를 만들어줌
@Builder // new로도 만들지만 build로도 만듦.
@ToString
public class TodoDTO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
    private String writer;
}
