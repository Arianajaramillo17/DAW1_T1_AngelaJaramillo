package entity;

import jakarta.persistence.*;

@Entity
public class Curso {
    @Id
    private Long id;
    private String nombre;
    private int creditos;
}