public class Ternario {

  public static String verificaNota(int nota) {
    return nota >= 7 ? "Aprovado!!!" : "Reprovado.";
  }
  public static void main(String[] args) {

    String resultado = verificaNota(10);
    System.out.println(resultado);
  }
}
