package com.example.springsecuritydemo.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "\"post\"")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private Instant postingDate;

    @NotEmpty // pas de guillemet vide
    @NotNull // pas de null
    @NotBlank(message = "Pas de ...") // pas de succesion d'espace
    @Column(nullable = false)
    private String content;

    @ManyToOne
    private User user;
}
