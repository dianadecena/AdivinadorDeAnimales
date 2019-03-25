
package arbolbinario;

public class Arbol {
    //Atributos
    public Nodo pRoot;
    
    //Constructor
    public Arbol() {
        pRoot = null;
    }

    //Setters & Getters
    public Nodo getpRoot() {
        return pRoot;
    }

    public void setpRoot(Nodo pRoot) {
        this.pRoot = pRoot;
    }
    
    //Metodos
    
    public boolean isVacio(){ //Revisar si el arbol es vacio
        return pRoot == null;
    }
    
    public void preorden(Nodo N){ //Recorrido en preorden
        if(N != null){
            System.out.print(N.gettInfo() + " "); //Imprimir arbol en consola
            preorden(N.getHijoIzquierdo()); //recorre subarbol izquierdo
            preorden(N.getHijoDerecho()); //recorre subarbol derecho
        }
    }
    
    public int Altura(Nodo N){ //Obtener la altura del arbol
        if (N == null){
            return 0;
        }else{
            return 1 +
            Math.max(Altura(N.getHijoIzquierdo()),
                Altura(N.getHijoDerecho()));
        }
    }
    
}
