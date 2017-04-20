
package OrdenamientoInsercion;

import java.util.Random;


public class OrdenamientoInsercion {
    
    private int[] datos;
    private static Random generador = new Random();
    
    public OrdenamientoInsercion(int tamanio)
    {
        datos = new int[tamanio];
        for(int i = 0; i < datos.length; i++)
        {
            datos[i] = 10 + generador.nextInt(90);
        }
    }
    
    //ordena el arreglo usando el ordenamiento por insercion
    public void sort()
    {
        int insercion; 
        
        for(int siguiente = 1; siguiente < datos.length; siguiente++)
        {
            insercion = datos[siguiente];
            
            int moverElemento = siguiente;
            
            while(moverElemento > 0 && datos[moverElemento - 1] > insercion)
            {
                datos[moverElemento] = datos[moverElemento - 1];
                moverElemento--;
            }
            
            datos[moverElemento] = insercion;
            imprimirPasada(siguiente, moverElemento);
        }
    }
    
    public void imprimirPasada(int pasada, int indice)
    {
        System.out.print(String.format("despues de una pasada"
                                     + " %2d:", pasada));
        
        for(int i = 0; i < indice; i++)
        {
            System.out.print(datos[i] + "   ");
        }
        
        System.out.print(datos[indice] + "*  ");
        
        for(int i = indice + 1; i < datos.length; i++)
        {
            System.out.print(datos[i] + "    ");
        }
        
        System.out.print("\n          ");//para alineacion
        
        //indica la cantidad del arreglo que esta ordenado
        for(int i = 0; i <= pasada; i++)
        {
            System.out.print("-- ");
        }
        
        System.out.println("\n");
    }
    
    public String toString()
    {
        StringBuilder temporal = new StringBuilder();
        for(int elemento: datos)
        {
            temporal.append(elemento + " ");
        }
        
        return temporal.toString();
    }
}
