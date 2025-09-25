public class ex004 {
    /* 
    Trata-se de um sistema simples para pré-aprovação de empréstimos. 
    O algoritmo avalia diferentes condições, como pontuação de crédito, renda mensal e se o solicitante é funcionário, para decidir se o empréstimo pode ser concedido.
    */
    public static void main(String[] args) {
        int pontuacaoCredito = 720;
        double rendaMensal = 3800.00;
        boolean ehFuncionario = true;

        int minimo = 700;
        double rendaMinima = 4000.00;

        if (ehFuncionario == true) {
            if (pontuacaoCredito >= minimo) {
                System.out.println("Empréstimo pré-aprovado!");
            } else {
                System.out.println("Empréstimo não aprovado.");
            }
        } else {
            if ((pontuacaoCredito >= minimo) && (rendaMensal >= rendaMinima)) {
                System.out.println("Empréstimo pré-aprovado!");
            } else {
                System.out.println("Empréstimo não aprovado.");
            }
        }
    }
}


