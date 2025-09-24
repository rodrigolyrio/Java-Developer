public class Exercicio3 {
    public static void main(String[] args) {
        boolean bateuMeta = true;
        double satisfacaoCliente = 7.5;

        if (bateuMeta && (satisfacaoCliente >= 8) == true) {
            System.out.println("Parabéns! Bônus concedido.");
        } else if (bateuMeta || (satisfacaoCliente >= 8) == true) {
            System.out.println("Vendedor no caminho certo.");
        } else {
            System.out.println("Continue se esforçando.");
        }

        System.out.println("Análise de performance finalizada.");
    }
}
