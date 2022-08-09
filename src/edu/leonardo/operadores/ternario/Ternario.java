package edu.leonardo.operadores.ternario;

public class Ternario {
  public static void main(String[] args) {

    int a, b;
    String resultado;

    a = 5;
    b = 6;

    // if(a==b)
    //   resultado = "verdadeiro";
    // else  
    //   resultado = "falso";

    //variavel = <expressão booleana> ? < true > : <false>
    resultado = a < b ? "verdadeiro" : "falso";

    System.out.println(resultado);
  }
}
