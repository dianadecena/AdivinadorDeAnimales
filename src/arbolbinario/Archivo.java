
package arbolbinario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Archivo {
    public Arbol arbol = new Arbol();
    
    public void grabarArchivo(String raiz, String dato_izq, String dato_der){
        try{
            //se crea el archivo 
            FileWriter f = new FileWriter("arbol_binario.txt", true); 
            //se escriben los datos en el archivo 
            PrintWriter p = new PrintWriter(f); 
            //guardar los datos en el archivo con un separador 
            p.println(raiz+"|"+dato_izq+"|"+dato_der); 
            p.close();
        }catch(Exception ex){
            System.out.println("Error al grabar el archivo");
        }
    }
    
    public void extraerDatos(){
        String linea;
        int cont=1;
        
        try{
            //leer el archivo 
            FileReader fr = new FileReader("arbol_binario.txt"); 
            BufferedReader br = new BufferedReader(fr);
            //leer linea por linea el contenido del archivo 
            while((linea = br.readLine())!=null){  
                //dividir string en partes (separador)
                StringTokenizer st = new StringTokenizer(linea, "|"); 
                //guardar el valor de la raíz una sola vez
                if(cont==1){
                  String raiz = st.nextToken();
                  Nodo aux = new Nodo(raiz);
                  arbol.setpRoot(aux);
                //obtener cada parte dividida por el separador (información de los nodos hijos)
                
                //izquierdo
                String izq = st.nextToken(); 
                Nodo aux2 = new Nodo(izq);
                arbol.getpRoot().setHijoIzquierdo(aux2);

                //derecho
                String der = st.nextToken();
                Nodo aux3 = new Nodo(der);
                arbol.getpRoot().setHijoDerecho(aux3);
                cont++;
                }else{
                    String raiz = st.nextToken();
                    Nodo aux = new Nodo(raiz);
                    Nodo aux3 = arbol.getpRoot().getHijoIzquierdo();
                    arbol.getpRoot().setHijoIzquierdo(null);
                    arbol.getpRoot().setHijoIzquierdo(aux);
                    
                    String der = st.nextToken();
                    Nodo aux2 = new Nodo(der);
                    aux.setHijoIzquierdo(aux2);
                    aux.setHijoDerecho(aux3);
                }
            }
            br.close();
        }catch(Exception ex){
            
        }
    }
    
}
