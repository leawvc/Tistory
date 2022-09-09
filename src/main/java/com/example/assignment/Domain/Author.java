package com.example.assignment.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "author")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUTHOR_ID")
    Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Long birthday;
    @ManyToOne
    @JsonManagedReference
//    순환참고 방지
    @JoinColumn(name = "BOOK_ID")
    private Book book;
}
