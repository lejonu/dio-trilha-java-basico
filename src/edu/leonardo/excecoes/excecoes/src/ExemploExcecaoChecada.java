package edu.leonardo.excecoes.excecoes.src;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecaoChecada {
  public static void main(String[] args) {
    Number valor;
    try {
      // Esta classe vai exigir tratamento da exceção.
      // extends de Exception
      valor = NumberFormat.getInstance().parse("a1.75");
      System.out.println(valor);
    } catch (ParseException e) {
      e.printStackTrace();
      // returns Unparseable number
    }
    
  }
}
