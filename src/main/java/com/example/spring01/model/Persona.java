package com.example.spring01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nombres", nullable = false, length = 70)
    private String nombres;

    @Column(name="apellidos", nullable = false, length = 70)
    private String apellidos;

    @Column(name="dni", nullable = false, length = 8, unique = true)
    private String dni;
}
