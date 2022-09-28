//  ********** Integrantes ********** //
//Kevin Li, Enrique Wen, Kenny Tang, Roberto Luo

//  ********** Problema 2 ********** //

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner MayorMenor = new Scanner(System.in);

        // declaracion de variable
        Double uno, dos, promedio, mayor = 0.0, menor = 0.0;

        System.out.println("Ingrese un numero");
        uno = MayorMenor.nextDouble();
        System.out.println("Ingrese otro numero");
        dos = MayorMenor.nextDouble();

        // inicio de condicionales

        if (uno > dos) {
            mayor = uno;
        } // fin 1er if
        if (uno < dos) {
            mayor = dos;
        } // fin 2do if

        if (uno > dos) {
            menor = dos;
        } // fin 3er if

        if (dos < uno) {
            menor = dos;
        } // fin 4to if

        // fin de condicionales

        // operacion
        promedio = (uno + dos) / 2;
        // fin de operacion

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("Su promedio es: " + promedio);

        MayorMenor.close(); // fin del Scanner
    }
}
