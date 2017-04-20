
package OrdenamientoInsercion;

public class PruebaOrdenamientoInsercion {
    
    public static void main(String []args)
    {
        OrdenamientoInsercion arregloOrden = new OrdenamientoInsercion(10);
        
        System.out.println("Arreglo desordenado");
        System.out.println(arregloOrden);
        
        arregloOrden.sort();
        
        System.out.println("Arreglo ordenado");
        System.out.println(arregloOrden);
    }
    
}
