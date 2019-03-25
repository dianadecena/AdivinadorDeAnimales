
package ventanas;

//ventana donde se le muestra el árbol binario al usuario 

import arbolbinario.Archivo;
import arbolbinario.Nodo;
import java.awt.Graphics;


public class Ventana2 extends javax.swing.JFrame {
    Archivo archivo = new Archivo();
    
    //Variables para graficar el arbol
    int x, y;
    boolean der, izq;

    public Ventana2() {
        initComponents();
    }
    
    public void preorden(Nodo N, Graphics g, int x, int y, boolean der, boolean izq){ //Recorrido en preorden
        if(N != null){
            
            
            if(der == true){//dibujos hacia la derecha
              x = x + 70;
              y = y + 70;
              g.drawRect(x, y, 70, 20);
              g.drawLine(x+30, y, x-40, y-50);
              g.drawString(N.gettInfo(), x+10, y+15);
            }else if(izq == true){//dibujos hacia la izquierda
              x = x - 70;
              y = y + 70;
              g.drawRect(x, y, 70, 20);
              g.drawLine(x+30, y, x+100, y-50);
              g.drawString(N.gettInfo(), x+10, y+15);
            }
            
            preorden(N.getHijoIzquierdo(), g, x, y, false, true); //recorre subarbol izquierdo
            preorden(N.getHijoDerecho(), g, x, y, true, false); //recorre subarbol derecho
        }else{
            y = y - 70; //Si no hay mas nodos hacia abajo, subir al anterior
        }
    }
    
    @Override
     public void paint(Graphics g){
       
        //extraer información contenida en el árbol (conocimientos)
        archivo.extraerDatos();
        
        //Dibujar primer rectangulo si la raiz no es null
        if(archivo.arbol.getpRoot() != null){
            g.drawRect(340, 50, 90, 20);
            g.drawString(archivo.arbol.pRoot.gettInfo(), x+10, y+15);
            x=340;
            y=50;
        }
        
        //llamar al recorrido
        preorden(archivo.arbol.getpRoot(), g, x, y, false, false);
    }
    
    //Fin de graficado del arbol
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
