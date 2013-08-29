package com.infinitemule.jsr353;

import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 */
public class ObjectModel {


  public static JsonObject helloJson() {

    return Json.createObjectBuilder()
      .add("hello", "JSON")
      .build();

  }

  public static JsonObject simpleModel() {

    return Json.createObjectBuilder()
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
  }

  /**
   *
   */
  public static void main(String[] args) {

    System.out.println(helloJson());
    System.out.println(simpleModel());
  }

}
