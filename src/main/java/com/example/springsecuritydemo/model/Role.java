package com.example.springsecuritydemo.model;

import lombok.Data;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table(name = "\"role\"")
@Data
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String rolename;

}
