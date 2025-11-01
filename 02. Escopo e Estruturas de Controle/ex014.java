public class ex014 {

  /*
  Executa uma lista de comandos para o robô, parando se encontrar um comando inválido.
  */
  
    public static void executarMissao (String[] comandos) {
        System.out.println("Iniciando missão...");
        for (String comando : comandos) {
            try {
                switch (comando) { // Substitui múltiplos condicionais
                    case "AVANCAR":
                    case "RECUAR":
                    case "VIRAR_DIREITA":
                    case "VIRAR_ESQUERDA":
                        System.out.println("Executando comando: " + comando);
                        break;
                    default:
                        throw new IllegalArgumentException ("Comando inválido");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("\nErro na missão. Comando desconhecido! Abortando...");
                break;
            }
        }
    }

    static void main() {
        // Comandos Válidos = {"AVANCAR", "RECUAR", "VIRAR_DIREITA", "VIRAR_ESQUERDA"};
        String[] missao = {"AVANCAR", "AVANCAR", "VIRAR_DIREITA", "ANALISAR_ROCHA", "RECUAR"};
        executarMissao(missao);
    }
}
