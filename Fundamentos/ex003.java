public class ex003 {
    // Este programa simula a análise de desempenho de um vendedor. Ele utiliza operadores lógicos (&& e ||) para verificar se o vendedor atingiu a meta e/ou se a nota de satisfação do cliente é alta, imprimindo mensagens diferentes para cada cenário.
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


