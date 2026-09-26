//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

void main() {
    Scanner NICOL = new Scanner(System.in);

    int filas;

    System.out.print("Ingrese el número de filas: ");
    filas = NICOL.nextInt();

    for (int i = 1; i <= filas; i++) {

        for (int espacios = filas - i; espacios > 0; espacios--) {
            System.out.print(" ");
        }

        for (int asteriscos = 2 * i - 1; asteriscos > 0; asteriscos--) {
            System.out.print("*");
        }

        System.out.println();
    }
}
