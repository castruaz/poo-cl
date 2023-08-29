// Muestra la estación del año que corresponde al número introducido 

import java.util.Scanner;

public class _p25_EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Muestra la estación del año que corresponde al número introducido ");
        System.out.print("Dame un número entre 1 y 4 ? ");
        int n = new Scanner(System.in).nextInt();

        if( n>=1 && n<=4 ) {
            if( n==1 ) System.out.println("Primavera");
            if( n==2 ) System.out.println("Verano");
            if( n==3 ) System.out.println("Otoño");
            if( n==4 ) System.out.println("Invierno");
        }
        else System.out.println("\nNúmero fuera de rango ...");

        System.out.println("\nProceso terminado..");
    }
}
