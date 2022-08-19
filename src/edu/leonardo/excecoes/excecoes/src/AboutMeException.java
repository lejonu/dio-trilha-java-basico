import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeException {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    try {
      System.out.println("Digite seu nome: ");
      String nome = scanner.next();
  
      System.out.println("Digite seu sobrenome: ");
      String sobrenome = scanner.next();
  
      System.out.println("Digite sua idade: ");
      int idade = scanner.nextInt();
  
      System.out.println("Digite sua altura: ");
      double altura = scanner.nextDouble();
  
      scanner.close();
  
      String mensagem = "O seu nome é " + nome + " " + sobrenome + ", você tem " + idade + " anos e sua altura é " + altura;
  
      System.out.println(mensagem);
    } catch (InputMismatchException e) {
      System.err.println("Os campos idade e altura precisam ser numéricos.");
    }

  }
}
