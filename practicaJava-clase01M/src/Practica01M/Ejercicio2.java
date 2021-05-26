package Practica01M;

import java.util.Scanner;

public class Ejercicio2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese n:");
        int m = scanner.nextInt();
        System.out.print("Ingrese m:");
        int n = scanner.nextInt();
        scanner.close();

        for (int i=m;i<=m*n;i=i+m)
        {
            System.out.println("Numero Par: " + i);
        }
    }
}
