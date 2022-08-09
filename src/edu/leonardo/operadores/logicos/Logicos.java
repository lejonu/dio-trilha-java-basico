package edu.leonardo.operadores.logicos;

public class Logicos {
  /*
  *
  * &&       Operador lógico 'E'
  * ||       Operador lógico "OU"
  * 
  */
  public static void main(String[] args) {
    boolean condicao1 = true;

    boolean condicao2 = false;

    if(condicao1 && condicao2){
      System.out.println("Ambas são verdadeiras");
    }

    if(condicao1 || condicao2){
      System.out.println("Pelo menos uma é verdadeira.");
    }

    if(condicao1 ^ condicao2){
      System.out.println("Apenas uma é verdadeira.");
    } else {
      System.out.println("Ambas são falsas ou ambas são verdadeiras");
    }
  }
}
