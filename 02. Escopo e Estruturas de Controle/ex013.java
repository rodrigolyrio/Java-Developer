public class ex013 {

    /*
    Calcula a média de temperaturas a partir de um array de leituras em String,
    ignorando valores que não podem ser convertidos.
     */

    public static double calcularMedia(String[] leituras) {
        double somaTotal = 0.0;
        int leiturasValidas = 0;

        for (String leitura : leituras) {
            try {
                double temperatura = Double.parseDouble(leitura); // Tenta converter String para Double
                somaTotal += temperatura;
                leiturasValidas++;
            } catch (NumberFormatException e) {
                System.out.println("Leitura inválida encontrada: " + leitura);
            }
        }

        if (leiturasValidas > 0)
            return (somaTotal / leiturasValidas); // Média
        else
            return 0.0;
    }

    static void main() {
        String[] leituras = {"22.5", "23.1", "erro", "21.9", "N/A", "24.0"};
        double media = calcularMedia(leituras);

        if (media == 0.0) {
            System.out.println("\nNão foi possível calcular a média pois não há leituras válidas.");
        } else
            System.out.println("\nMédia de temperaturas: " + media);
    }
}
