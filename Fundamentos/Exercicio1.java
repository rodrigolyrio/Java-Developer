public class Exercicio1 {
    public static void main(String[] args) {
        String etiqueta = gerarEtiqueta("Notebook Gamer", 2025);
        System.out.println(etiqueta);
    }

    public static String gerarEtiqueta(String nomeProduto, int anoLancamento) {
        return "Produto: " + nomeProduto + " - Lançamento: " + anoLancamento;
    }
}
