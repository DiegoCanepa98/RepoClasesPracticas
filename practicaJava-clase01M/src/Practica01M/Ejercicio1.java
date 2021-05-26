package Practica01M;

import java.util.Scanner;

public class Ejercicio1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int cant = 0;
        int par = 0;
        while (n > cant)
        {
            if (par%2 == 0)
            {
                System.out.println("Numero par: " + par);
                cant++;
            }
            par++;
        }
    }
}
