import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //importando a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Solicitando o número da agência e definindo o valor informado na variável agencia
        System.out.println("Por favor, digite o número da agência com o dígito: ");
        String agencia = scanner.next();

        //Solicitando o número da conta e definindo o valor informado na variável numero
        System.out.println("\nPor favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        //Solicitando o nome do cliente e definindo o valor informado na variável nomeCliente
        System.out.println("\nPor favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        //Solicitando o saldo inicial da conta e definindo o valor informado na variável saldo
        System.out.println("\nPor favor, digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        //Imprimindo a mensagem final com os dados informados via terminal.
        System.out.println("\nOlá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta "+numero+" e seu saldo R$"+saldo+" já está disponível para saque");

    }
}