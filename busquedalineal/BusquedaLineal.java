package busquedalineal;

import java.util.Scanner;

public class BusquedaLineal {

    private static Scanner entrada;
    private static boolean numeroEncontrado = false;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        System.out.println("array obtenido:\n");

        int[] a = Arreglo.obtenerArreglo();

        //imprimir el array
        for (int num : a) {
            System.out.print(num + " ");
        }

        System.out.println("\nIngres el numero a buscar en el rango de 10 a 99");
        int numBuscar = entrada.nextInt();

        //Buscarmos en el array el numero ingresado por el usuario
        for (int i = 0; i < a.length; i++) {
            if (numBuscar == a[i]) {
                System.out.println("Si esta el numero dentro del arreglo y esta"
                        + " en la posicion " + (i + 1) + "\n");

                for (int numero : a) {
                    System.out.print(numero + " ");
                }

                System.out.println();

                for (int j = 0; j < a.length; j++) {
                    if (j == i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("   ");
                    }
                }

                numeroEncontrado = true;
                break;
            }
        }

        if (numeroEncontrado == false) {
            System.out.println("No esta el numero a buscar en el arreglo");
        }
    }

}
