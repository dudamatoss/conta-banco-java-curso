import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


   
        System.out.println("Por favor, digite o numero da Agência: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();


        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " +numero+ " e seu saldo é de --> R$" +  saldo + ". E já está disponível para saque!");

  
    }
}
