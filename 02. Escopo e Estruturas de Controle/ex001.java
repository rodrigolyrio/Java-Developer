import java.util.Scanner;
public class ex001 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor da Compra: R$");
        double valorCompra = leitor.nextDouble();

        int desconto = valorCompra < 200 ? 0 : (valorCompra >= 200 && valorCompra < 500 ? 10 : 15);
        System.out.println("Desconto aplicado: " + desconto + "%");
    }
}
