package com.example.simpleproject.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Comment extends Timestamped{
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn
    private User writer;

    @Column(name = "comment")
    private String comment;
}
