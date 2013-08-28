package com.infinitemule.jsr353;

import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 */
public class ObjectModel {


  public static void helloJson() {

    JsonObject model = Json.createObjectBuilder()
      .add("hello", "JSON")
      .build();

    System.out.println(model);

  }

  public static void simpleModel() {

    JsonObject people = Json.createObjectBuilder()
      .add("people", Json.createArrayBuilder()
        .add(Json.createObjectBuilder()
        .add("firstName", "Jeffery")
        .add("lastName",  "Lebowski"))

        .add(Json.createObjectBuilder()
        .add("firstName", "Walter")
        .add("lastName",  "Sobchak"))

        .add(Json.createObjectBuilder()
        .add("firstName", "Donny")
        .add("lastName",  "Kerabatsos"))
    ).build();


    System.out.println(people);
  }

  /**
   *
   */
  public static void main(String[] args) {

    helloJson();
    simpleModel();
  }

}
