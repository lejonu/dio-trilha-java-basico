package enums;

public enum EstadoBrasileiro {
  SAO_PAULO ("SP", "São Paulo"),
  MINAS_GERAIS("MG", "Minas Gerias"),
  PIAUI ("PI", "Piauí"),
  MARANHAO ("MA", "Maranhão")
  ;

  private String sigla;
  private String nome;
  
  private EstadoBrasileiro(String sigla, String nome) {
    this.sigla = sigla;
    this.nome = nome;
  }

  public String getSigla() {
    return sigla;
  }
  public String getNome() {
    return nome;
  }
  
}
