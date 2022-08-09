package edu.leonardo.primeiraclasse;

public class MinhaClasse {

  private static int somar(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {

    int currentYear = 2021; // variavel
    currentYear = 2022; 

    final String COUNTRY = "Brasil"; // constante
    final double PI = 3.1415;

    boolean chageKey = true;

    System.out.println("Olá Mundo!!!");
    System.out.println("Olá " + COUNTRY + "!!!");
    System.out.println("Estamos em " + currentYear + "!!!");
    System.out.println(PI);
    System.out.println(chageKey);
    System.out.println(somar(1,3));
  }
}
