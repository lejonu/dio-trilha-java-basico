package edu.leonardo.operadores.relacionais;

public class Relacionais {
  /* 
    ==    igualdade
    !=    diferença
    >     maior que
    <     menor que
    >=    maior ou igual
    <=    menor ou igual
  */ 

  public static void main(String[] args) {

    String nomeUm = "LEONARDO";
    String nomeDois = new String("LEONARDO");

    // para comparar conteúdo de objetos usamos o método equals da classe String

    System.out.println(nomeUm.equals(nomeDois) ? "nomes iguais" : "nomes diferentes");
    System.out.println();

    int num1 = 1;
    int num2 = 2;
    String result;
    boolean yesNo;

    yesNo =  num1 > num2;

    result = num1 > num2 ? "maior" : "menor ou igual";
  
    System.out.println(result + " " + yesNo);
    
  }

}
