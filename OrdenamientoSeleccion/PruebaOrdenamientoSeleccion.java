
package OrdenamientoSeleccion;

public class PruebaOrdenamientoSeleccion {
    
    public static void main(String []args)
    {
        OrdenamientoSeleccion arregloOrden = new OrdenamientoSeleccion(10);
        
        System.out.println("Arreglo desordenado");
        System.out.println(arregloOrden);
        
        arregloOrden.ordenar();
        
        System.out.println("Arreglo ordenado");
        System.out.println(arregloOrden);
    }
    
}
