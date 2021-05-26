package Practica01M;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese m: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese d: ");
        int d = scanner.nextInt();

        int numero = 0;
        int cantidad = 0;
        while (n>cantidad)
        {
            if (CantDigitos(d,numero) >= m)
            {
                System.out.println(cantidad + 1 + " numero: " + numero);
                cantidad++;
            }
            numero++;
        }
    }

    public static int CantDigitos(int digito, int numero){
        int contador = 0;
        while (numero>0)
        {
            if (digito == numero%10)
            {
                contador++;
            }
            numero = numero / 10;
        }
        return contador;
    }
}
