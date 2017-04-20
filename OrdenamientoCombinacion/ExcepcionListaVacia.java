
package OrdenamientoCombinacion;

public class ExcepcionListaVacia extends RuntimeException{
    
    public ExcepcionListaVacia()
    {
        this("Lista");
    }
    
    public ExcepcionListaVacia(String nombre)
    {
        super(nombre + "esta vacia");
    }
    
}
