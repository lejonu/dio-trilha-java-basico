package escola;

public class Aluno {
  private String nome;
  private int idade;


  public String getNome() {
    return nome;
  }

  public void setNome(String newNome) {
    // Aplicar consistência antes de definir o atributo.
    nome = newNome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int newIdade) {
    idade = newIdade;
  }
}
