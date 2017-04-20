
package OrdenamientoCombinacion;

public class NodoLista {
    
    Object datos;
    NodoLista siguienteNodo;

    NodoLista(Object objeto) 
    {
        this(objeto, null);
    }
    
    NodoLista(Object objeto, NodoLista nodo)
    {
        datos = objeto;
        siguienteNodo = nodo;
    }
    
    Object obtenerObject()
    {
        return datos;
    }
    
    NodoLista obtenerSiguiente()
    {
        return siguienteNodo;
    }   
}//fin clase lista


//definicion de la clase Lista
class Lista
{
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;
    private String nombre;
    
    public Lista()
    {
        this("lista");
    }
    
    public Lista(String nombreLista)
    {
        nombre = nombreLista;
        primerNodo = ultimoNodo = null;
    }
    
    public void insertarAlFrente(Object elementoInsetar)
    {
        if(estaVacia())
        {
            primerNodo = ultimoNodo = new NodoLista(elementoInsetar);
        }
        else
        {
            primerNodo = new NodoLista(elementoInsetar, primerNodo);
        }
    } 
    
    public void insertarAlFinal(Object elementoInsertar)
    {
        if(estaVacia())
        {
            primerNodo = ultimoNodo = new NodoLista(elementoInsertar);
        }
        else
        {
            ultimoNodo = ultimoNodo.siguienteNodo = 
                    new NodoLista(elementoInsertar);
        }
    }
    
    public Object eliminarDelFrente() throws ExcepcionListaVacia
    {
        if(estaVacia())
        {
            throw new ExcepcionListaVacia(nombre);
        }
        
        Object elementoEliminado = primerNodo.datos;
        
        if(primerNodo == ultimoNodo)
        {
            primerNodo = ultimoNodo = null;
        }
        else
        {
            primerNodo = primerNodo.siguienteNodo;
        }
        
        return elementoEliminado;
    }
    
    public boolean estaVacia()
    {
        return primerNodo == null;//devu
    }
    
    public Object eliminarDelFinal() throws ExcepcionListaVacia
    {
        if(estaVacia())
        {
            throw new ExcepcionListaVacia(nombre);
        }
        
        Object elementoEliminado = ultimoNodo.datos;
        
        if(primerNodo == ultimoNodo)
        {
            primerNodo = ultimoNodo = null;
        }
        else
        {
            NodoLista actual = primerNodo;
            
            while(actual.siguienteNodo != ultimoNodo)
            {
                actual = actual.siguienteNodo;
            }
            
            ultimoNodo = actual;
            actual.siguienteNodo = null;
        }
        
        return elementoEliminado;
    }
    
    public void imprimir()
    {
        if(estaVacia())
        {
            System.out.printf("%d vacia\n", nombre);
        }
        
        System.out.printf("La %s es: ", nombre);
        NodoLista actual = primerNodo;
        
        while(actual != null)
        {
            System.out.printf("%s ", actual.datos);
            actual = actual.siguienteNodo;
        }
        
        System.out.println("\n");
    }
}
























