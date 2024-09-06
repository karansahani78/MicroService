package com.karan.UserService.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(name="NAME",length = 302222)
    private String name;
    @Column(name="EMAIL")
    private String email;
    @Column(name="ABOUT")
    private String about;
    @Transient
    private List<Rating> ratings= new ArrayList<>();

}
