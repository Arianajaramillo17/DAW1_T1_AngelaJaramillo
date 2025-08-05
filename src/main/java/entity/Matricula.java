package entity;

import jakarta.persistence.*;

@Entity
public class Matricula {
    @Id
    private Long id;

    @ManyToOne
    private Alumno alumno;

    @ManyToOne
    private Curso curso;
}
