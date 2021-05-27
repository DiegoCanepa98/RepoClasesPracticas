package Practica01M;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese valor: ");
        int n = scanner.nextInt();
        scanner.close();

        if (esPrimo(n))
        {
            System.out.println("El numero " + n + " es primo");
        } else {
            System.out.println("El numero " + n + " no es primo");
        }
    }

    public static boolean esPrimo(int numero)
    {
        if (numero == 0 || numero == 1 || numero == 4 ) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}
