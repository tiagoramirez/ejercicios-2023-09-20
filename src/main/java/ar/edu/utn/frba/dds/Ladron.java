package ar.edu.utn.frba.dds;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Ladron")
public class Ladron extends Personaje{
  int nivelSiniestro;
  boolean tieneNavaja;

  public void atacar(Personaje personaje) {}
}
