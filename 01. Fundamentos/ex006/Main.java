public class Main {
    public static void main(String[] args) {
        ProcessadorDeNumeros processo = new ProcessadorDeNumeros();
        int resultado = processo.processarNumero(12345);
        int outroResultado = processo.processarNumero(121);

        System.out.println(resultado);  // Se nao for palindromo, retorna o numero invertido.
        System.out.println(outroResultado); // Se for palindromo, retorna o numero original.
    }

}
