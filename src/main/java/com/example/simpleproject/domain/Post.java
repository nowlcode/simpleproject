package com.example.simpleproject.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Post extends Timestamped{
    @Id @GeneratedValue
    private Long id;

    @Column(name = "title", nullable = false, length = 20)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "view", nullable = false)
    private int view;

//    private int bookmark;
}
