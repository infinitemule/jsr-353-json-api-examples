package com.infinitemule.jsr353;

import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonGeneratorFactory;
import java.util.HashMap;

/**
 *
 */
public class Generator {

  public static void prettyPrint() {

    HashMap<String, Object> props = new HashMap<String, Object>();

    props.put(JsonGenerator.PRETTY_PRINTING, true);

    JsonGeneratorFactory jgf = Json.createGeneratorFactory(props);

    JsonGenerator json = jgf.createGenerator(System.out);

    json.writeStartObject()
      .writeStartArray("people")
        .writeStartObject()
          .write("firstName", "John")
          .write("lastName",  "Alpha")
          .writeStartObject("address")
            .write("street", "1 Elm St.")
            .write("city", "Boston")
            .write("state", "MA")
          .writeEnd()
          .writeStartArray("cars")
            .writeStartObject()
              .write("make", "Porsche")
              .write("model", "911")
              .write("color", "silver")
            .writeEnd()
          .writeEnd()
        .writeEnd()
      .writeEnd()
    .writeEnd()
    .close();

  }

  public static void main(String[] args) {
    prettyPrint();
  }
}
