public class SistemaCadastro {
  public static void main(String[] args) {
    Pessoa marcos = new Pessoa("Marcos", "123456");

    // marcos.setNome("Marcos");
    // marcos.setEndereco("Rua das Marias");
  
    System.out.println(marcos.getNome() + "-" + marcos.getCpf() );
  }
}
