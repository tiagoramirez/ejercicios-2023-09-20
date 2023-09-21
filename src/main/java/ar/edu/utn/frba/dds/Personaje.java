package ar.edu.utn.frba.dds;

import lombok.RequiredArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,name="tipo")
public abstract class Personaje extends PersistentEntity{

  int stamina;
  int puntosDeVida;

  @ElementCollection
  @Convert(converter = ElementoDefensorConverter.class)
  List<ElementoDefensor> elementos = new ArrayList<>();

  public void atacar(Personaje personaje) {}

  public void aniadir(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }
}
