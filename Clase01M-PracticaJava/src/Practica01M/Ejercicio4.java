package Practica01M;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese valor: ");
        int n = scanner.nextInt();
        scanner.close();


        int primo = 2;
        int cant = 0;
        while (n > cant)
        {
            if (Ejercicio3.esPrimo(primo))
            {
                System.out.println((cant+1) + " Primo: " + primo);
                cant++;
            }
            primo ++;
        }
    }
}
