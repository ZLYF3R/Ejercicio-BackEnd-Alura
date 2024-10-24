package PACKAGE_NAME;

import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe el año de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Por últimos, dinos que nota le das a esta película");
        double notaDePelicula = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(notaDePelicula);

    }
}
