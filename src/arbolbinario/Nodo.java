
package arbolbinario;

public class Nodo {
    //Atributos
    private String tInfo;
    private Nodo hijoIzquierdo;
    private Nodo hijoDerecho;

    //Constructor
    public Nodo(String tInfo) {
        this.tInfo = tInfo;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    //Setters & Getters
    public String gettInfo() {
        return tInfo;
    }

    public void settInfo(String tInfo) {
        this.tInfo = tInfo;
    }

    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
}
