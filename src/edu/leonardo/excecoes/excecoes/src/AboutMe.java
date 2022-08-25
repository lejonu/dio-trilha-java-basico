package edu.leonardo.excecoes.excecoes.src;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome: ");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome: ");
    String sobrenome = scanner.next();

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();
    // Se não digitar um inteiro:
    // Exception in thread "main" java.util.InputMismatchException

    System.out.println("Digite sua altura: ");
    double altura = scanner.nextDouble();

    scanner.close();

    String mensagem = "O seu nome é " + nome + " " + sobrenome + ", você tem " + idade + " anos e sua altura é " + altura;

    System.out.println(mensagem);

  }
}

/*
 * Exceções mais comuns
 * 
 * java.lang.NullPointerException // obter valor de variável nula.
 * java.lang.ArithmeticException  // dividir por zero
 * java.sql.SQLException          // exceção no BD.
 * java.io.FileNotFoundException  // arquivo não existe.
 * 
 * 
*/