
package disponibilitateagenti;

import java.applet.*;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Cursor;



public class Login extends javax.swing.JFrame {

   

	
  
    
    public Login() {
        initComponents();
        
        
       
        
           }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        incUsPS = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        incUsPS.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Disponibilitate");

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Password:");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        JLabel lblRegisterMouseClick = new JLabel("Create a new account");
        lblRegisterMouseClick.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblRegisterMouseClick.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        lblRegisterMouseClick.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		
        		Register.main(new String[0]);
        		           	
        	
                dispose();
        	
        		
        		
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(82)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
        					.addComponent(jButton2))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        							.addGap(0, 5, Short.MAX_VALUE))
        						.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(username)
        						.addComponent(password, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))))
        			.addGap(84))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(123, Short.MAX_VALUE)
        			.addComponent(lblRegisterMouseClick, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
        			.addGap(105))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(23)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2))
        			.addGap(18)
        			.addComponent(lblRegisterMouseClick)
        			.addGap(12))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        
    }//GEN-LAST:event_usernameActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        
               
String un = username.getText();
 String ps = password.getText();
    
        
        if (un.equals("User") && ps.equals("User")){
            
        Disponibilitate d = new Disponibilitate();
        d.setVisible(true);
        
       
        }
        else{
            
            incUsPS.showMessageDialog(rootPane, "Incorrect Username or Password");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

      
            
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

   
   
    
    public static void main(String args[]) {
      
       
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public static int getABORT() {
        return ABORT;
    }
     
    
      
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane incUsPS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextField password;
    protected javax.swing.JTextField username;
}


