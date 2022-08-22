import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    System.out.println("Processo Seletivo");
  //   analisarCandidato(1900.0);
  //   analisarCandidato(2200.0);
  //   analisarCandidato(2000.0);
  // selecaoCandidatos();
    imprimirSelecionado();
  }

  static void imprimirSelecionado() {
    String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

    System.out.println("Imprimindo a lista de candidatos informando o índice do elemento.");

    // for( int indice=0; indice < candidatos.length; indice++) {
    //   System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
    // }

    // System.out.println("Forma abreviada e iteração for each");
    for(String candidato: candidatos) {
      System.out.println("O candidato selecionado foi " + candidato);
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do {
      atendeu = atender();
      continuarTentando = !atendeu;

      if(continuarTentando)
        tentativasRealizadas++;
      else
        System.out.println("CONTATO REALIZADO COM SUCESSO");

    } while(continuarTentando && tentativasRealizadas < 3);
  
    if(atendeu)
      System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
    else 
      System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + ", NÚMERO MÁXIMO DE " + tentativasRealizadas + " REALIZADAS.");
  }

  static boolean atender() {
    return new Random().nextInt(3)==1;
  }

  static void selecaoCandidatos() {
    String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;

    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();
    
      System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
    
      if(salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
        candidatosSelecionados++;
      }

      candidatoAtual++;
    
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;

    if(salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    } else if(salarioBase == salarioPretendido) {
      System.out.println("Ligar para o candidato com contraproposta");
    } else {
      System.out.println("Aguardando o resultado dos demais candidadtos");
    }
  }
}
