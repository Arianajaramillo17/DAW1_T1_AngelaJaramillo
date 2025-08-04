package entity.herencia;

import entity.Publicacion;
import jakarta.persistence.Entity;

@Entity
public class Tutorial extends Publicacion {

    private String nivel;
    private String tecnologia;


}