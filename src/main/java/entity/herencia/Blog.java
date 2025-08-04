package entity.herencia;

import entity.Publicacion;
import jakarta.persistence.*;

@Entity
public class Blog extends Publicacion {

    private String autor;
    private int tiempoLectura;


}
