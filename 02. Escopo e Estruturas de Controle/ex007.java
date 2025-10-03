public class ex007 {
    public static void main(String[] args) {
        String[] listaDeNomes = {"Mariana", "Roberto", "Camila", "Lucas"};

        int totalDeCaracteres = 0;
        for (String nome : listaDeNomes) {
            totalDeCaracteres += nome.length();
        }
        System.out.println("O número total de caracteres em todos os nomes é: " + totalDeCaracteres);
    }
}
