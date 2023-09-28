public class ResultadoEscolar {
    public static void main(String[] args) {
        /*
        int nota = 10;

        if (nota >= 7) {
            System.out.println("Aprovado");

        } else if (nota >= 5 && nota < 7) {
            System.out.println("Prova de recuperação");

        } else{
            System.out.println("Reprovado");
        }
        */

        // Operador ternario
        int nota = 3;

        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Prova de recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
