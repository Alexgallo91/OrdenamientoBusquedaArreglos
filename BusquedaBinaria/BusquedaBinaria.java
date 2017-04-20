package BusquedaBinaria;

import java.util.Arrays;
import java.util.Random;

public class BusquedaBinaria {

    private int[] datos;
    private static Random generador = new Random();

    public BusquedaBinaria(int tamanio) {
        datos = new int[tamanio];

        for (int i = 0; i < datos.length; i++) {
            datos[i] = generador.nextInt(90) + 10;
        }

        Arrays.sort(datos);
    }//fin constructor

    public int busquedaBinaria(int elementoABuscar) {
        int inferior = 0;
        int superior = datos.length - 1;
        int medio = (inferior + superior + 1) / 2;
        int ubicacion = -1;

        do {
            System.out.print(elementosRestantes(inferior, superior));

            for (int i = 0; i < medio; i++) {
                System.out.print("  ");
            }
            System.out.println("*");

            if (elementoABuscar == datos[medio]) {
                ubicacion = medio;
            } else if (elementoABuscar < datos[medio]) {
                superior = medio - 1;
            } else {
                inferior = medio + 1;
            }

            medio = (inferior + superior + 1) / 2;

        } while (inferior <= superior && ubicacion == -1);

        return ubicacion;
    }

    public String elementosRestantes(int inferior, int superior) {
        StringBuilder temporal = new StringBuilder();

        for (int i = 0; i < inferior; i++) {
            temporal.append("   ");
        }

        for (int i = inferior; i < superior; i++) {
            temporal.append(datos[i] + " ");
        }

        temporal.append("\n");
        return temporal.toString();
    }

    public String toString() {
        return elementosRestantes(0, datos.length - 1);
    }

}
