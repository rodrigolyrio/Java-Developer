import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Por favor, digite o número da sua conta: ");
        int conta = leitor.nextInt();

        leitor.nextLine(); // CONSOME A QUEBRA DE LINHA

        System.out.print("Digite seu nome: ");
        String nomeCliente = leitor.nextLine();

        System.out.print("Digite o número de sua agência: ");
        String agencia = leitor.nextLine();

        System.out.print("Digite o valor para saque: ");
        double saldo = leitor.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        leitor.close();

    }

}
