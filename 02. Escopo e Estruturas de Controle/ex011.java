public class ex011 {
    /*
    O código simula o consumo da bateria de um celular.
    Ele inicia com a carga em 100% e, repetidamente, exibe o nível atual e subtrai 8% de consumo.
    Esse processo continua enquanto a bateria estiver acima de 15%.
    Quando a carga atinge 15% ou menos, o laço de repetição para, e o programa exibe uma mensagem
    de alerta de "Bateria em estádo crítico!".
     */

    public static void main(String[] args) {
        int nivelBateria = 100;
        int consumoPorHora = 8;

        while (nivelBateria > 15) {
            System.out.println("Nivel da batéria do celular: " + nivelBateria);
            nivelBateria -= consumoPorHora;
        }
        System.out.println("Alerta. Bateria em estádo crítico!");
    }
}
