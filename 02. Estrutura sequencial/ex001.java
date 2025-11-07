import java.util.Scanner;
public class ex001 {
    // Solicita ao usuário uma confirmação (S/N) e exibe o caractere digitado.
    static void main() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Confirmar operação (S/N)?: ");
        char confirmacao = leitor.next().charAt(0);
        System.out.println("Confirmação recebida: " + confirmacao);
        leitor.close();
    }
}
