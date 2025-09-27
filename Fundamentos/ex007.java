import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Distância da viagem (km): ");
        int distancia = leitor.nextInt();

        System.out.println("Consumo do veículo (km/l): ");
        double consumo = leitor.nextDouble();

        System.out.println("Preço do combustivel (R$/l): ");
        double preco = leitor.nextDouble();

        double distanciaConsumo = distancia / consumo;
        double precoTotal = distanciaConsumo * preco;

        System.out.println("Para uma viagem de " + distancia + ", você precisará de " + distanciaConsumo + " litros de combustível.");
        System.out.println("O custo total da viagem será de R$ " + precoTotal);
    }
}

