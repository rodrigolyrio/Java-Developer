public class ex010 {
    /*
    O código processa um array pré-definido de números de pedidos.
    Ele percorre o array e, para cada número, verifica se é positivo e ímpar.
    Se for, imprime uma mensagem de que o "pedido é válido".
    O programa para a execução do laço e encerra o processamento imediatamente ao encontrar o número 0, ignorando quaisquer números que venham depois dele na lista.
    Números de pedido pares ou negativos são simplesmente ignorados.
     */

    public static void processarPedidos(int[] pedidos) {
        for (int pedido : pedidos) {
            if (pedido > 0 && pedido % 2 != 0) {
                System.out.println("O pedido " + pedido + " é válido");
                }
            else if (pedido == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] pedidos = {101, 202, 103, -5, 105, 0, 107, 109};
        processarPedidos(pedidos);
    }
}
