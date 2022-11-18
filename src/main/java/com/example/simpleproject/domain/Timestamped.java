package com.example.simpleproject.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Timestamped {
    String createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
    String modifiedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
}
