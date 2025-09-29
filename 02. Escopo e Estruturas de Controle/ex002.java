import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nota do filme: ");
        double notaFilme = leitor.nextDouble();

        String classificacao = notaFilme >= 8 ? "Excelente" :
                (notaFilme >= 6 && notaFilme < 8 ? "Bom" :
                        (notaFilme >= 4 && notaFilme < 6 ? "Regular" :
                                ("Ruim")));
        System.out.println(classificacao);
    }
}
