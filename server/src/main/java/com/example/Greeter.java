package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
    * @param someone the name of some freaking person
    * @return a greeting string for that freaking person
    */

  final public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
