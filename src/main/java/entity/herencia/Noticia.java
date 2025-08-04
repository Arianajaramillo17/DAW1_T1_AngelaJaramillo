package entity.herencia;

import entity.Publicacion;
import jakarta.persistence.Entity;

@Entity
public class Noticia extends Publicacion {

    private String fuente;
    private String categoria;


}