import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        int numeroConta = 0;
        Double saldo = 0.0;

        System.out.println("Por favor, digite o número da Conta!");

        try {
            numeroConta = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Erro no número da conta.");
            System.out.println("Este campo deve conter apenas números.");
            scanner.close();
            return;
        }
                    
        System.out.println("Por favor, digite o nome da Agência.");
        String numeroAgencia = scanner.next(); 

        System.out.println("Por favor, digite o seu Nome.");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu Saldo.");
        
        try {
            saldo = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Erro na entrada do saldo.");
            System.out.println("Por favor use o padrão Norte Americano. ex.: 1234.55 ");
            scanner.close();
            return;
        }

        scanner.close();  
    
        System.out.println("Olá " + nomeCliente.concat(", obrigado por criar a conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta +  " e seu saldo "+ saldo +" já está disponível para saque."));
           
    }
}
