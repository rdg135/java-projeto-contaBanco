import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome :");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da sua conta :");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite qual sua agência :");
        String agencia = scanner.next();

        System.out.println("Digite o valor do depósito :");
        double saldo = scanner.nextDouble();
        String saldoFormatado = String.format("%.2f", saldo);
        
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta +" e seu saldo " + saldoFormatado + " já está disponível para saque.");
    }
}
