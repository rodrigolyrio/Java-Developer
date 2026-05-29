package ex025;

public class Student {
    public String nome;
    public double nota1, nota2, nota3;

    public double notafinal(){
        return this.nota1 + this.nota2 + this.nota3;
    }

    public void aprovacao(){
        double nota = notafinal();
        if (nota >= 60) {
            System.out.println("PASS");
        }
        else {
            double pontosFaltantes = 60 - notafinal();
            System.out.print("FAILED\n");
            System.out.printf("FALTARAM %.2f PONTOS", pontosFaltantes);        }
    }
}
