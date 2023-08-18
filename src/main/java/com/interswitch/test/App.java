package com.interswitch.test;

import com.interswitch.maven.ArithmeticOperations;

import java.time.LocalDateTime;

public class App
{
  public static void main( String[] args )
  {
    ArithmeticOperations.userOperation();

    UpperLowerCase upperLowerCase = new UpperLowerCase();
    System.out.println(upperLowerCase.toUpperCase("Tgjagjkk hskjhkaj"));
    System.out.println(upperLowerCase.toLowerCase("Tgjagjkk hskjhkaj"));
    System.out.println(upperLowerCase.toLowerCase(""));

    System.out.println("Please, Let's go home! " + LocalDateTime.now());
  }
}
