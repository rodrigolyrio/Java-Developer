public class ValidadorDeChave {

    public boolean validarChave(int chave) {
        return (temComprimentoValido(chave) && estaEmOrdemNaoDecrescente(chave) && possuiDigitoAdjacenteIgual(chave));
    }

    private boolean temComprimentoValido(int chave) {
        return ((chave >= 100000) && (chave <= 999999));
    }

    private boolean estaEmOrdemNaoDecrescente(int chave) {
        int numeroRestante = chave;
        while (numeroRestante > 9) {
            int digitoDireito = numeroRestante % 10;
            int digitoEsquerdo = (numeroRestante / 10) % 10;
            if (digitoDireito < digitoEsquerdo) {
                return false;
            }
            numeroRestante /= 10;
        }
        return true;
    }


    private boolean possuiDigitoAdjacenteIgual(int chave) {
        int numeroRestante = chave;
        while (numeroRestante > 9) {
            int digitoDireito = numeroRestante % 10;
            int digitoEsquerdo = (numeroRestante / 10) % 10;
            if (digitoDireito == digitoEsquerdo) {
                return true;
            }
            numeroRestante /= 10;
        }
        return false;
    }
}