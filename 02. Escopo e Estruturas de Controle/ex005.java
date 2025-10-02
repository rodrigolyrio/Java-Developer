public class ex005 {
    public static void main(String[] args) {
        int[] idades = {25, 31, 19, 45, 28, 31, 22};
        int maiorIdade = idades[0];

        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
        }
        System.out.println("A maior idade encontrada na lista é " + maiorIdade);
    }
}
