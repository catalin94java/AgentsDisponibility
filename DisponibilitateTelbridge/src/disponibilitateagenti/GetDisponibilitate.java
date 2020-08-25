/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package disponibilitateagenti;


import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author Dan Ursache
 */
public class GetDisponibilitate extends javax.swing.JButton{
    
    
    
   
                               
public GetDisponibilitate(){
initComponents();
    



}

private void initComponents(){

    GetTextButton = new javax.swing.JButton();
    
     GetTextButton.setText("Get Date");
        GetTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGetTextButtonActionPerformed(evt);
            }
        });

}

    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntroducereDisponibiltate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroducereDisponibiltate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroducereDisponibiltate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroducereDisponibiltate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               new GetDisponibilitate().setVisible(true);
               
            }
        });
        

      
    }


protected void jGetTextButtonActionPerformed(java.awt.event.ActionEvent evt) {

   
    
}
         
       private javax.swing.JButton GetTextButton;
}

