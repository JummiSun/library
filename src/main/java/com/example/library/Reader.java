package com.example.library;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity(name = "reader")
@Table(name = "reader")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private String phone;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthDay;
    private String address;
    private String reading_history;

//    @ManyToMany
//    @JoinTable(
//            name = "reader_book",
//            joinColumns = @JoinColumn(name = "reader_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id"))
//    private Set<Book> books = new HashSet<>();

}
