public class ex008 {
    public static void main(String[] args) {
        /*
        Este código calcula a média de um conjunto de notas pré-definidas.
        Ele inicializa um array de double com seis notas, percorre esse array somando todos os valores, e, ao final, divide a soma total pelo número de notas para obter a média.
        O resultado é então exibido no console.
         */

        double[] notas = {8.5, 9.0, 7.5, 10.0, 6.5, 8.0};
        double somaNotas = 0.0;

        for (double nota : notas) {
            somaNotas += nota;
        }
        double media = somaNotas / notas.length;
        System.out.println("A média da turma é " + media);
    }
}
