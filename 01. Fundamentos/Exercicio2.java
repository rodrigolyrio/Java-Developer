public class Exercicio2 {
    public static void main(String[] args) {
        String codigo1 = unificarCodigos("FIN", "REC01");
        String codigo2 = unificarCodigos("VENDAS", "SP");

        System.out.println(codigo1);
        System.out.println(codigo2);
    }

    public static String unificarCodigos(String codigoParteA, String codigoParteB) {
        // Como o desafio envolve a proibição do uso do operador +...
        String resultadoParcial = codigoParteA.concat("_");
        return resultadoParcial.concat(codigoParteB);
    }
}