
package adivinador;

import java.io.File;
import javax.swing.JFrame;
import ventanas.Ventana1;
import ventanas.Ventana2;

//ventana de inicio con botones con diferentes opciones para el usuario

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        cuadro = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 0, 0));
        titulo1.setText("ADIVINADOR");
        jPanel1.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 200, 60));

        titulo2.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        titulo2.setForeground(new java.awt.Color(0, 0, 0));
        titulo2.setText("DE");
        jPanel1.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        titulo3.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        titulo3.setForeground(new java.awt.Color(0, 0, 0));
        titulo3.setText("ANIMALES");
        jPanel1.add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        boton1.setBackground(null);
        boton1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        boton1.setForeground(new java.awt.Color(0, 0, 0));
        boton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        boton1.setLabel("Nueva sesión");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirVentana1(evt);
            }
        });
        jPanel1.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 140, 40));

        boton2.setBackground(null);
        boton2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        boton2.setForeground(new java.awt.Color(0, 0, 0));
        boton2.setText("Árbol binario");
        boton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirVentana2(evt);
            }
        });
        jPanel1.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 140, 40));

        boton3.setBackground(null);
        boton3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        boton3.setForeground(new java.awt.Color(0, 0, 0));
        boton3.setText("Borrar datos");
        boton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarDatos(evt);
            }
        });
        jPanel1.add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 140, 40));

        cuadro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(cuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 320, 320));

        fondo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        fondo.setForeground(new java.awt.Color(0, 0, 0));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/plants.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JFrame getFrame(){
        return this;
    }
    
    //al presionar el botón "nueva sesión" se abre la ventana con las preguntas 
    private void abrirVentana1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirVentana1
        Ventana1 f = new Ventana1();
        f.setVisible(true);
    }//GEN-LAST:event_abrirVentana1

    //al presionar el botón "árbol binario" se abre la ventana que muestra el árbol al usuario
    private void abrirVentana2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirVentana2
        Ventana2 f = new Ventana2();
        f.setVisible(true);
    }//GEN-LAST:event_abrirVentana2

    //al presionar el botón "borrar datos" se borra el archivo de texto que contiene la información de los nodos del árbol
    private void borrarDatos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarDatos
        File archivo = new File("arbol_binario.txt");
        if(archivo.delete()){
            System.out.println("El archivo ha sido borrado correctamente");
        }else{
            System.out.println("El archivo no pudo ser borrado");
        }
    }//GEN-LAST:event_borrarDatos

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.Box.Filler cuadro;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    // End of variables declaration//GEN-END:variables
}
