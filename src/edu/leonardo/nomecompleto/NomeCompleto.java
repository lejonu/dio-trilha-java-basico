package edu.leonardo.nomecompleto;

public class NomeCompleto {

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ")
                       .concat(segundoNome);
  }

  public static void main(String[] args) {
    String primeiroNome="Leonardo José";
    String segundoNome="Nunes";

    String nome = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nome);

  }
  
}
