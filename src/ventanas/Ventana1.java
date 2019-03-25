
package ventanas;

import arbolbinario.*;
import java.io.File;

//ventana donde se muestran las preguntas del adivinador y se obtienen las respuestas del usuario 

public class Ventana1 extends javax.swing.JFrame {
    String nuevoAnimal; //variable para guardar el nuevo animal ingresado por el usuario
    Nodo raiz = new Nodo("oso panda"); //crear raíz del árbol por primera vez (animal inicial)
    boolean preguntar = false;
    String animal = raiz.gettInfo(); //el animal inicial es igual al valor de la raíz 
    Archivo archivo = new Archivo(); //creación de archivo 
    File ar = new File("arbol_binario.txt");
    int cont=0;
    
    public Ventana1() {
        initComponents();
        if(ar.delete()){
            System.out.println("El archivo ha sido borrado correctamente");
        }else{
            System.out.println("El archivo no pudo ser borrado");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        respuesta = new javax.swing.JTextField();
        pregunta = new javax.swing.JLabel();
        indicador = new javax.swing.JLabel();
        cuadro1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        cuadro2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        respuesta.setBackground(null);
        respuesta.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        respuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta(evt);
            }
        });

        pregunta.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        pregunta.setText("¿Estás pensando en un animal? si (s) o no (n)");

        indicador.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        indicador.setForeground(new java.awt.Color(102, 102, 102));
        indicador.setText("presione ENTER para enviar su respuesta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(indicador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicador)
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 390, 180));

        cuadro1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(cuadro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 430, 240));

        cuadro2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(cuadro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 410, 220));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/border_plants.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -40, 760, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //se llama al presionar enter después de escribir el texto 
    private void respuesta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta
        adivinar();
    }//GEN-LAST:event_respuesta

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    public void adivinar(){
        String caracteristica, preg, resp;
        
            preg = pregunta.getText();
            resp = respuesta.getText();
            
            if(preg.startsWith("¿Estás pensando") && resp.equals("s") || preguntar){
                
            respuesta.setText("");

            if(raiz.getHijoIzquierdo()!=null){
                //preguntas de las características introducidas por el usuario 
                archivo.extraerDatos();
                raiz = archivo.arbol.getpRoot();
                pregunta.setText(raiz.gettInfo()+"?");
            }else{
                //intenta adivinar el animal
                pregunta.setText("¿Es un "+animal+"?"+" si (s) o no (n)");
            }
              
            if(raiz.getHijoIzquierdo()==null){
                preguntar = false;
            }

            }else if(preg.equals(raiz.gettInfo()+"?") && resp.equals("s")){
               
               //obtener la infomación de los nodos de la parte derecha (si) 
               if(raiz.getHijoDerecho()!=null){
                raiz = raiz.getHijoDerecho();
                animal = raiz.gettInfo();
                preguntar = true;
               }

            }else if(preg.equals(raiz.gettInfo()+"?") && resp.equals("n")){
                
               //obtener la infomación de los nodos de la parte izquierda (no)
               if(raiz.getHijoIzquierdo()!=null){
                raiz = raiz.getHijoIzquierdo();
                animal = raiz.gettInfo();
                preguntar = true;
               }
 
            }else if(preg.startsWith("¿Es un") && resp.equals("s")){
               
                //logro adivinar el animal
                respuesta.setText("");
                pregunta.setText("Soy el más grande!");
                respuesta.setVisible(false);
                
            }else if(preg.startsWith("¿Es un") && resp.equals("n")){
                
                if(raiz.getHijoIzquierdo()!=null){
                //preguntas de las características introducidas por el usuario 
                raiz = archivo.arbol.getpRoot().getHijoIzquierdo();
                pregunta.setText(raiz.gettInfo()+"?");
                }
                
                //obtener información 
                respuesta.setText("");
                pregunta.setText("¿Qué animal era?");
                
            }else if(preg.startsWith("¿Qué animal")){
                
                //agregar nuevo animal que piensa el usuario
                nuevoAnimal = resp;
                respuesta.setText("");
                pregunta.setText("¿Qué diferencia a un "+animal+" de un "+nuevoAnimal+"?");
                
            }else if(preg.startsWith("¿Qué diferencia")){
                
                //obtener característica que diferencia a los animales 
                caracteristica = respuesta.getText();
                raiz.settInfo(caracteristica);
                respuesta.setText("");
                pregunta.setText("Si el animal fuera un "+animal+" ¿cuál sería tu respuesta?");
                
            }else if(preg.startsWith("Si el animal")){
           
                //crear nodos para insertarlos
                Nodo n1 = new Nodo(nuevoAnimal);
                Nodo n2 = new Nodo(animal);
                //obtener información sobre dónde colocar los nodos 
                switch(resp) {
                    case "s":
                       //el nuevo animal se coloca en el lado izquierdo y el animal en el derecho
                       raiz.setHijoIzquierdo(n1);
                       raiz.setHijoDerecho(n2);
                       respuesta.setText("");
                       pregunta.setText("¿Estás pensando en un animal? si (s) o no (n)");
                       break;
                    case "n":
                       //el nuevo animal se coloca en el lado derecho y el animal en el izquierdo
                       raiz.setHijoIzquierdo(n2);
                       raiz.setHijoDerecho(n1);
                       respuesta.setText("");
                       pregunta.setText("¿Estás pensando en un animal? si (s) o no (n)");
                       break;
                }
            
            //guardar información de los nodos en archivos de texto
                archivo.grabarArchivo(raiz.gettInfo(), raiz.getHijoIzquierdo().gettInfo(), raiz.getHijoDerecho().gettInfo());
            }
        }
    
 
    
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler cuadro1;
    private javax.swing.Box.Filler cuadro2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel indicador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pregunta;
    private javax.swing.JTextField respuesta;
    // End of variables declaration//GEN-END:variables
}
