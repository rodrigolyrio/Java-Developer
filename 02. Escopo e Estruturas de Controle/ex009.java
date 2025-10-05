import java.util.Scanner;
/*
Solicita que o usuário insira um número inteiro que servirá como limite.
Em seguida, ele calcula a soma de todos os números pares de 0 até esse limite, mas
com uma condição: ele ignora qualquer número par que também seja divisível por 6.
Por fim, o resultado dessa soma é exibido no console.
 */

public class ex009 {
    public static int somaParesEspeciais(int limite) {
        int somaPar = 0;
        for (int i = 0; i <= limite; i += 2) {
            if (i % 6 == 0)
                continue;
            somaPar += i;
        }
        return somaPar;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número limite da contagem: ");
        int limite = leitor.nextInt();

        System.out.println("A soma dos numeros pares até " + limite + " sem contar divisores por 6, é " + somaParesEspeciais(limite));
    }
}