public class FormatadorCep {
  public static void main(String[] args) {
    // Exception - Exige tratamento.
    try {
      String cepFormatado = formatarCep("123456");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("Cep inválido");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if(cep.length() != 8)
      throw new CepInvalidoException();

    //simulando um cep formatado
    return "23.765-064";
  }
}
