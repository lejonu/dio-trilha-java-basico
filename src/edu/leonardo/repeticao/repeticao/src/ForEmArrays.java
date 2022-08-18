public class ForEmArrays {

  public static String mensagem(String aluno, int nota) {
    return "O aluno " + aluno + " recebeu a nota " + nota;
  };

  public static void main(String[] args) {
    String alunos[] = { 
      "FELIPE",
      "JONAS",
      "JULIA"
    };

    int notas[] = {
      10,
      6,
      5
    };

    for(int i=0; i < alunos.length; i++) {
      String msg = mensagem(alunos[i], notas[i]);
      System.out.println(msg);
      System.out.println();
    }

    for (String aluno : alunos) {
      System.out.println(aluno);
    }

    for(int nota: notas)
      System.out.println(nota);
  }
}
