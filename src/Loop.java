package PACKAGE_NAME;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darías a la película Matrix");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println("La nota media para Matrix es: " + mediaEvaluaciones / 3);
    }
}
