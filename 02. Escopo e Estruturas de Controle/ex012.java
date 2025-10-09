public class ex012 {
    /*
    Esse código simula o processamento de 117 tarefas em lotes de 15.
    Utilizando um laço do-while, ele progressivamente soma o tamanho do lote ao total de tarefas já processadas.
    O programa inclui uma lógica para lidar com o último lote, que pode ser menor que 15:
    quando o número de tarefas processadas excede o total, ele corrige o valor para o total exato (117) e exibe uma
    única mensagem final no console, confirmando a conclusão de todas as tarefas.
     */

    public static void main(String[] args) {
        int totalDeTarefas = 117;
        int tarefasProcessadas = 0;
        int tamanhoDoLote = 15;
        int tarefasAProcessar;

        do {
            tarefasProcessadas += tamanhoDoLote;
            tarefasAProcessar = totalDeTarefas - tarefasProcessadas;
            if (tarefasAProcessar < 0) {
                tarefasProcessadas += tarefasAProcessar;
                System.out.println("Lote processado. Total de tarefas concluídas: " + tarefasProcessadas + " de " + totalDeTarefas);
            }
        } while (tarefasProcessadas < totalDeTarefas);
    }
}
