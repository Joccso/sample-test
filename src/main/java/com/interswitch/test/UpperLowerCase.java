package com.interswitch.test;

public class UpperLowerCase {
  public String toUpperCase(String text) {
    if (null != text && !text.isEmpty()) {
      String[] words = text.split(" ");
      return words[0].toUpperCase();
    }
    return "Text cannot be empty";
//    throw new IllegalArgumentException("Text cannot be empty");
  }

  public String toLowerCase(String text) {
    if (null != text && !text.isEmpty()) {
      String[] words = text.split(" ");
      return words[0].toLowerCase();
    }
    return "Text cannot be empty";
//    throw new IllegalArgumentException("Text cannot be empty");
  }
}
