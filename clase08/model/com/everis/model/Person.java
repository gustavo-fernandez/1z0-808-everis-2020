package com.everis.model;

public class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }
  
  public String toString() {
    return "Person[" + this.name + "]";
  }
}