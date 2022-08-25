public class Pessoa {
  private String nome;
  private String cpf;
  private String endereco;

  // método construtor - não tem retorno
  // o nome do método construtor deve ser igual ao nome da classe
  // ao criar nova pessoa deverá ter o nome e o cpf
  public Pessoa(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
}
