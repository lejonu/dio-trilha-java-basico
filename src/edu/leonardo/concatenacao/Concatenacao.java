package edu.leonardo.concatenacao;

public class Concatenacao {
  public static void main(String[] args) {
    // calcula até encontrar uma string e passa a concatenar
    System.out.println(1+1+1+"6"+9+9+9);

    // calcula a prioridade e depois concatena
    System.out.println("6" + (9+9+9));
  }
}
