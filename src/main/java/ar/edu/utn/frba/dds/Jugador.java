package ar.edu.utn.frba.dds;

import lombok.RequiredArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;


@Entity
@RequiredArgsConstructor
public class Jugador extends PersistentEntity {

  String nombre;
  String apellido;

  @Column(columnDefinition = "TIMESTAMP")
  LocalDateTime fechaAlta;

}
