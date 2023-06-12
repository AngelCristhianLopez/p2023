/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package figuras;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author Angel
 */
public class Traslacion extends javax.swing.JFrame {

    
int x=0;
int y=0;
int ancho=200;
int alto=100;
int rotacion=0;

double escalado=1.0;
double escalado1=1.0;
/**
     * Creates new form Traslacion
     */
    public Traslacion() {
this.setContentPane(new Graficos());

        initComponents();
this.setLocationRelativeTo(null);

jSpinner3.addChangeListener(new ChangeListener(){
@Override
public void stateChanged(ChangeEvent e){

rotacion=(int)jSpinner3.getValue();
repaint();
}

});

jSpinner1.addChangeListener(new ChangeListener(){
@Override
public void stateChanged(ChangeEvent e){
int exponente=(int)jSpinner1.getValue();
escalado=Math.pow(2, exponente);
repaint();
}

});

jSpinner2.addChangeListener(new ChangeListener(){
@Override
public void stateChanged(ChangeEvent e){
int expo=(int)jSpinner2.getValue();
escalado1=Math.pow(2, expo);
repaint();
}
});



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 712));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 131, -1));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 122, -1));

        jButton1.setText("Trasladar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, -1, -1));

        jLabel1.setText("X");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        jLabel2.setText("Y");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, -1, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 450, 80));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 100, -1));
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 100, -1));

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 100, -1));
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 690, 100, -1));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 200, 80));

        jLabel6.setText("ESCALADO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, -1, -1));

        jLabel7.setText("Altura");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jLabel8.setText("Ancho");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 360, 1));
        getContentPane().add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 100, -1));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 650, 150, 70));

        jLabel10.setText("ROTACION");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 730, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel11.setText("RECTANGULO:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 770, 80, 20));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 630, 80, 70));

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 140, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
/*
x=Integer.parseInt(txt1.getText());
y=Integer.parseInt(txt2.getText());
repaint();*/
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
x=Integer.parseInt(txt1.getText());
y=Integer.parseInt(txt2.getText());
//ancho=Integer.parseInt(txt3.getText());
//alto=Integer.parseInt(txt4.getText());
repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
ancho=Integer.parseInt(txt3.getText());
alto=Integer.parseInt(txt4.getText());
repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
menu o=new menu();
o.setVisible(true);
dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Traslacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traslacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traslacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traslacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traslacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
public class Graficos extends JPanel{
@Override
  public void paint(Graphics g){
super.paint(g);
Graphics2D g2d=(Graphics2D)g;
g2d.translate(x, y);
g2d.scale(escalado, escalado1);
g2d.rotate(Math.toRadians(rotacion));

g2d.fillRect(0, 0, ancho, alto);
}

}  

}