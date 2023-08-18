package com.interswitch.test;

import com.interswitch.maven.ArithmeticOperations;

public class App
{
  public static void main( String[] args )
  {
    ArithmeticOperations.userOperation();

    UpperLowerCase upperCase = new UpperLowerCase();
    System.out.println(upperCase.toUpperCase("Tgjagjkk hskjhkaj"));

    UpperLowerCase lowerCase = new UpperLowerCase();
    System.out.println(lowerCase.toLowerCase("Tgjagjkk hskjhkaj"));
  }
}
