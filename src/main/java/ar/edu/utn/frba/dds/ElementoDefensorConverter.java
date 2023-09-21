package ar.edu.utn.frba.dds;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import javax.swing.text.Element;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Converter(autoApply = true)
public class ElementoDefensorConverter implements AttributeConverter<ElementoDefensor,String> {

  @Override
  public String convertToDatabaseColumn(ElementoDefensor elementoDefensor) {
    return ElementoDefensor.class.getSimpleName();

  }
  @Override
  public ElementoDefensor convertToEntityAttribute(String elementoDefensor) {
    return switch (elementoDefensor) {
      case "Escudo" -> new Escudo();
      case "Espada" -> new Espada();
      case "Arco" -> new Arco();
      default -> null;
    };
  }
}
