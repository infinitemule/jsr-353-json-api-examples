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

        .writeStartObject()
          .write("firstName", "Jane")
          .write("lastName",  "Beta")
          .writeStartObject("address")
            .write("street", "47 Maple St.")
            .write("city", "New York")
            .write("state", "NY")
          .writeEnd()
          .writeStartArray("cars")
            .writeStartObject()
              .write("make",  "Plymouth")
              .write("model", "Voyager")
              .write("color", "maroon")
            .writeEnd()
            .writeStartObject()
              .write("make",  "Dodge")
              .write("model", "Omni")
              .write("color", "blue")
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
