package edu.leonardo.tiposdevariaveis;

public class TiposVariaveis {

  public static void main(String[] args) {
    // 8 tipos primitivos:
    // int, byte, short, long, float, double, boolean e char
    // preferir int e double
    // <Tip> <nomeVairavel> <atribuicaoDeValorOpcional>

    int idade;
    // System.out.println(idade); // The local variable idade may not have been initialized
    
    idade=10;
    System.out.println(idade);

    double salarioMinimo = 2500.33;
    System.out.println(salarioMinimo + " - Mínimo");
  
    float floatNoFinalF = 2.521123F;
    System.out.println(floatNoFinalF);

    long longNoFinalL = 1231231231231123213L;
    System.out.println(longNoFinalL);

    // Constantes final
    final double PI = 3.1415;
    // PI = 3; // The final local variable PI cannot be assigned. It must be blank and not using a compound assignment
    System.out.println(PI);
  }
  
}
