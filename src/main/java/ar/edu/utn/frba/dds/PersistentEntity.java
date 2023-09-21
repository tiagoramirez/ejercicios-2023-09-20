package ar.edu.utn.frba.dds;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
@Getter
public class PersistentEntity {

  @GeneratedValue
  @Id
  private long id;
}
