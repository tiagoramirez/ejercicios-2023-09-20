package ar.edu.utn.frba.dds;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Mago")
public class Mago extends Personaje{
  int nivelDeMagia;
  boolean tieneAlas;

  public void atacar(Personaje personaje) {}
}
