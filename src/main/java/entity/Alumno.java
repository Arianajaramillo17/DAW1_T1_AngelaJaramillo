package entity;

import jakarta.persistence.*;

@Entity
public class Alumno {
    @Id
    private Long id;
    private String nombre;
    private String email;
}