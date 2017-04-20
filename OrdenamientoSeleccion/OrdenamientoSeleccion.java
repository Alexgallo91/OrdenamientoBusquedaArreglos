
package OrdenamientoSeleccion;

import java.util.Random;

public class OrdenamientoSeleccion {
    
    private int[] datos;
    private static Random generador = new Random();
    
    public OrdenamientoSeleccion(int tamanio)
    {
        datos = new int[tamanio];
        
        for(int i = 0; i < tamanio; i++)
        {
            datos[i] = 10 + generador.nextInt(90);
        }
    }//fin de constructor
    
    public void ordenar()
    {
        int masPequenio;
        
        for(int i = 0; i < datos.length - 1;i++)
        {
            masPequenio = 1; //primer indice del elemento mas pequeño
            
            for(int indice = i + 1; indice < datos.length; indice++)
            {
                if(datos[indice] < datos[masPequenio])
                {
                    masPequenio = indice;
                }
                
                intercambiar(i, masPequenio); //intercambia el elemanto
                                            //mas pequeño en la posicion
                                            
                imprmirPasada(i+1, masPequenio);//imprime la pasada del algoritmo
            }
        }
    }//fin del metodo ordenar
    
    public void intercambiar(int primero, int segundo)
    {
        int temporal = datos[primero];
        datos[primero] = datos[segundo];
        datos[segundo] = temporal;
    }//fin de intercambiar
    
    //imprime una pasada del algoritmo
    public void imprmirPasada(int pasada, int indice)
    {
        System.out.print(String.format("despues de pasada %2d", pasada));
        
        for(int i = 0; i < indice; i++)
        {
            System.out.print(datos[i] + "  ");
        }
        
        System.out.print(datos[indice] + "* "); //indice intercambio
        
        //termina de imprimir el arreglo en pantalla
        for(int i = indice + 1; i < datos.length; i++)
        {
            System.out.print(datos[i] + "  ");
        }
        
        System.out.printf("\n                         ");//alineacion
        
        for(int i = 0; i < pasada; i++)
        {
            System.out.print("--  ");
        }
        System.out.println("\n");
    }//fin de imprimirPasada
    
    public String toString()
    {
        StringBuilder temporal = new StringBuilder();
        for(int elemento: datos)
        {
            temporal.append(elemento + "  ");
        }
        
        temporal.append("\n");
        return temporal.toString();
    }
}
