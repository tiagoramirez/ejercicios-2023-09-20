package ar.edu.utn.frba.dds;

import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import javax.persistence.EntityTransaction;

public class App implements WithSimplePersistenceUnit {
  public static void main(String[] args) {
    new App().persistir();
  }

  public void persistir(){
    Personaje personaje = new Mago();
    personaje.aniadir(new Arco());
    personaje.aniadir(new Escudo());
    personaje.aniadir(new Espada());

    EntityTransaction transaction = entityManager().getTransaction();
    transaction.begin();
    entityManager().persist(personaje);
    transaction.commit();
  }
}