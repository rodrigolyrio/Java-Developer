public class ex001 {
    // define uma função que cria uma etiqueta de produto. A função gerarEtiqueta recebe o nome do produto e seu ano de lançamento como entrada e retorna uma string formatada
    public static void main(String[] args) {
        String etiqueta = gerarEtiqueta("Notebook Gamer", 2025);
        System.out.println(etiqueta);
    }

    public static String gerarEtiqueta(String nomeProduto, int anoLancamento) {
        return "Produto: " + nomeProduto + " - Lançamento: " + anoLancamento;
    }
}
