package edu.leonardo.operadores.unarios;

public class Unarios {
  public static void main(String[] args) {
    int numero = 5;

    // negação
    numero = - numero;
    System.out.println(numero);    
    
    // não inverte para positivo com
    numero = + numero;
    System.out.println(numero);

    // inverte para positivo multiplicando por -1.
    numero = numero * -1;
    System.out.println(numero);
    System.out.println("-----------");

    // incremento
    // numero++;
    // incrementa depois exibe
    System.out.println(++numero);

    // exibe depois incrementa
    System.out.println(numero++);

    // exibe
    System.out.println(numero);

    // incrementa depois exibe
    System.out.println(++numero);


    // Boolean
    boolean key = true;

    // normal
    System.out.println(key);

    // inverte valor booleano na exibição
    System.out.println(!key);

    // inverte valor na variável
    key = false;
    System.out.println(key);

    // inverte o valor da própria variável na variável.
    key = !key;
    System.out.println(key);

  }
}
