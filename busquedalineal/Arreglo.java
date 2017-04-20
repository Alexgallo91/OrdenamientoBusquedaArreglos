
package busquedalineal;

import java.util.Random;

public class Arreglo {
    
    private static int[] arreglo;
    private static Random generador = new Random();
    
    public static int[] obtenerArreglo()
    {
       int tamanio = 10; //elementos del arreglo
       arreglo = new int[tamanio];
       
       for(int i = 0; i < arreglo.length; i++)
       {
           arreglo[i] = 10 + generador.nextInt(90); // numeros de 10 
       }
       return arreglo;
    }
}
