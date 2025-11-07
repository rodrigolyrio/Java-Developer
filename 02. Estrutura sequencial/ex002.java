import java.util.Scanner;
public class ex002 {
    // Solicita ao usuário um caractere (modo) e exibe o modo selecionado.
    static void main() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o modo: ");
        char modo = leitor.next().charAt(0);
        System.out.println("Modo selecionado: " + modo);
        leitor.close();
    }
}
