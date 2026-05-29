package ex025;

import java.util.Locale;
import java.util.Scanner;
import ANKI.Student;

public class Program {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        Student estudante = new Student();

        System.out.print("Nome do estudante: ");
        estudante.nome = leitor.nextLine();

        System.out.println("Notas do estudante: ");
        estudante.nota1 = leitor.nextDouble();
        estudante.nota2 = leitor.nextDouble();
        estudante.nota3 = leitor.nextDouble();

        System.out.printf("NOTA FINAL = %.2f\n", estudante.notafinal());

        estudante.aprovacao();

    }
}
