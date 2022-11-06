package com.example.simpleproject.application.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Request & Response DTO 클래스를 하나로 묶어 InnerClass로 한 번에 관리
public class CommentDto {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Request{
        private Long id;
        private String comment;
        private String createdDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
        private String modifiedDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));

    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response{

    }
}
