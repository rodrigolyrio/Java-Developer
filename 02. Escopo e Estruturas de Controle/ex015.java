public class ex015 {
    /*
    Verifica um array de ações do sistema e retorna o nível de acesso máximo necessário entre elas.
    Níveis: LER(1) < ESCREVER(2) < EXECUTAR(3) < ADMIN(4).
    */  
    public static int verificarNivelAcesso (String[] acoesSistema) {
        int nivelMaximo = 0;

        for (String acao : acoesSistema) {
            int nivelAtual = 0;

            switch (acao) {
                case "LER_ARQUIVO":
                    nivelAtual = 1;
                    break;

                case "ESCREVER_ARQUIVO":
                    nivelAtual = 2;
                    break;

                case "EXECUTAR_SCRIPT":
                    nivelAtual = 3;
                    break;

                case "ACESSO_ADMIN":
                    nivelAtual = 4;
                    break;

                default:
                    continue;
            }

            if (nivelAtual > nivelMaximo) {
                nivelMaximo = nivelAtual;
            }

            if (nivelMaximo == 4)
                break;
        }

        return nivelMaximo;
    }

        static void main() {
        String[] acoesSistema = {"LER_ARQUIVO", "ESCREVER_ARQUIVO", "ACESSO_ADMIN"};
        System.out.println(verificarNivelAcesso(acoesSistema));
    }
}
