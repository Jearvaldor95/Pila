package pila;

/**
 *
 * @author USUARIO
 */
public class Pila {

    class Nodo{
    int dato;
    Nodo siguiente;
    public Nodo(int d){
        dato=d;
        siguiente=null;
    }
}
    private Nodo raiz;
    private int cantidad;
    public Pila(){
        raiz=null;
        cantidad=0;
    }
    public void Inserta(int d){
        Nodo nuevo= new Nodo(d);
        if(raiz==null){
            nuevo.siguiente=null;
            raiz=nuevo;
        }else{
            nuevo.siguiente=raiz;
            raiz=nuevo;
        }
        cantidad++;
    }
    public boolean estavacia(){
        if(raiz==null){
            return true;
        }else{
            return false;
        }
    }
    public int extraer(){
        if(raiz!=null){
            int info=raiz.dato;
            raiz=raiz.siguiente;
            return info;
        }else{
            return 0;
        }
    }
    public void imprimir(){
        Nodo reco=raiz;
        System.out.println("listado de todos los elementos de la pila");
        while(reco!=null){
            System.out.println(reco.dato+"");
            reco=reco.siguiente;
        }
        System.out.println();
    }
     public void eliminar(){
        if(raiz!=null){
        Nodo ultimo= raiz;
        raiz=raiz.siguiente;
        ultimo.siguiente=null;
        cantidad--;
        }else{
            System.out.println("No hay elementos para eliminar ");
        }
    }
    public int cantidad(){
        return cantidad;
    }
    public int ultimoelemento(){
        return raiz.dato;
    }
    public int obtener(int n){
       if(raiz==null){
           return 0;
       } else{
           Nodo puntero=raiz;
           int contador=0;
           while(contador<n &&puntero.siguiente!=null){
              puntero=puntero.siguiente;
              contador++;
           }
           if(contador!=n){
             return 0;
           }else{
               return puntero.dato;
           }
           
        }
    }
    public static void main(String[] args) {
        Pila pila1= new Pila();
        pila1.Inserta(8);
        pila1.Inserta(45);
        pila1.Inserta(23);
        pila1.Inserta(5);
        pila1.imprimir();
        pila1.eliminar();
        
        System.out.println("el tamaño de la pila es "+pila1.cantidad());
        System.out.println("la pila esta vacia:"+pila1.estavacia());
        System.out.println("el ultimo elemento insertado a la pila es:"+pila1.ultimoelemento());
        System.out.println("obtener el elemento que esta en la posicion 0:"+pila1.obtener(0));
        while(pila1.estavacia()==false){
            System.out.println(pila1.extraer());
        }
        System.out.println("la pila esta vacia:"+pila1.estavacia());
        pila1.eliminar();
    }
    
}
