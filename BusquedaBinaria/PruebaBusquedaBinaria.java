
package BusquedaBinaria;

import java.util.Scanner;

public class PruebaBusquedaBinaria {
    
    public static void main(String []args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int enteroABuscar;
        int posicion;
        
        BusquedaBinaria arregloBusqueda = new BusquedaBinaria(15);
        System.out.println("Escriba un valor entero (-1 para salir)");
        
        enteroABuscar = entrada.nextInt();
        System.out.println(arregloBusqueda);
        
        while(enteroABuscar != -1)
        {
            posicion = arregloBusqueda.busquedaBinaria(enteroABuscar);
            
            if(posicion == -1)
            {
                System.out.println("El entero " + enteroABuscar + 
                                   " no se encontro\n");
            }
            else
            {
                System.out.println("El entero " + enteroABuscar +
                                    " se encontro en la posicion: "+
                                    posicion+"\n");
            }
            
            System.out.print("Escriba el valor entero (-1 para salir): ");
            
            enteroABuscar = entrada.nextInt();
            System.out.println();
                
        }
    }
    
}
