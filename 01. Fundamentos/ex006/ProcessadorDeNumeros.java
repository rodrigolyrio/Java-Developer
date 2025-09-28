public class ProcessadorDeNumeros {

    public int processarNumero(int numero) {
        if (ehPalindromo(numero)) {
            return numero;
        } else {
            return reverter(numero);
        }
    }

    private boolean ehPalindromo(int numero) {
        return (numero == reverter(numero));
    }

    private int reverter(int numero) {
        int numeroRevertido = 0;
        int numeroParaInverter = numero;

        while (numeroParaInverter > 0) {
            int digito = numeroParaInverter % 10;
            numeroRevertido = numeroRevertido * 10 + digito;
            numeroParaInverter /= 10;
        }
        return numeroRevertido;
    }
}