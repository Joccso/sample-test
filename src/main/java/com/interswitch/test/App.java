package com.interswitch.test;

import com.interswitch.maven.ArithmeticOperations;

public class App
{
  public static void main( String[] args )
  {
    ArithmeticOperations.userOperation();

    UpperLowerCase upperLowerCase = new UpperLowerCase();
    System.out.println(upperLowerCase.toUpperCase("Tgjagjkk hskjhkaj"));
    System.out.println(upperLowerCase.toLowerCase("Tgjagjkk hskjhkaj"));
    System.out.println(upperLowerCase.toLowerCase(""));
  }
}
