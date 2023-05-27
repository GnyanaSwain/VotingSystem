import java.sql.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laguardia
 */
public class voteresult extends javax.swing.JFrame {

    /**
     * Creates new form voteresult
     */
    public voteresult() {
        initComponents();      
        setup();        
    }

    public Connection getConnection(){
        
        try{                                                                        //username //database         =pass no password
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
            return con;     
        }       
        catch(Exception e){               
        }
        return null;
}
       
    public void setup(){
        
        try{
            Connection con = getConnection();
             
            int president=1;
            String pre="SELECT * FROM candidate where position_id='"+president+"' order by -points limit 1";
            System.out.println("President Query : "+pre);
            Statement st1 =con.createStatement();
            ResultSet rs1= st1.executeQuery(pre);
                    
            int vicepresident=2;
            String vice="SELECT * FROM candidate where position_id='"+vicepresident+"' order by -points limit 1";
            Statement st2 =con.createStatement();
            ResultSet rs2= st2.executeQuery(vice);
            
            int secretary=3;
            String sec="SELECT * FROM candidate where position_id='"+secretary+"' order by -points limit 1";
            Statement st3 =con.createStatement();
            ResultSet rs3= st3.executeQuery(sec);
            
            int treasurer=5;
            String treas="SELECT * FROM candidate WHERE position_id='"+treasurer+"' ORDER BY -points limit 1";
            Statement st4 =con.createStatement();
            ResultSet rs4= st4.executeQuery(treas);
            
            int auditor=4;
            String audi="SELECT * FROM candidate WHERE position_id='"+auditor+"' ORDER BY -points limit 1";
            Statement st5 =con.createStatement();
            ResultSet rs5= st5.executeQuery(audi);
            
            int pio=6;
            String pio2="SELECT * FROM candidate WHERE position_id='"+pio+"' ORDER BY -points limit 1";
            Statement st6 =con.createStatement();
            ResultSet rs6= st6.executeQuery(pio2);
                      
            if(rs1.next()  && rs2.next() &&rs3.next() && rs4.next() && rs5.next() && rs6.next())  {
                presidentvotes.setText(rs1.getString(5));
                presidentname.setText(rs1.getString(2));
       
                vicepresidentvotes.setText(rs2.getString(5));
                vicename.setText(rs2.getString(2));
                
                secretaryvotes.setText(rs3.getString(5));
                secretaryname.setText(rs3.getString(2));
                
                treasurervotes.setText(rs4.getString(5));
                treasurername.setText(rs4.getString(2));
                
                auditorvotes.setText(rs5.getString(5));
                auditorname.setText(rs5.getString(2));
                
                piovotes.setText(rs6.getString(5));
                pioname.setText(rs6.getString(2));
                                              
            }           
        }      
        catch(Exception e){          
        }
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        vicename = new javax.swing.JTextField();
        secretaryvotes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        presidentname = new javax.swing.JTextField();
        secretaryname = new javax.swing.JTextField();
        treasurername = new javax.swing.JTextField();
        auditorname = new javax.swing.JTextField();
        pioname = new javax.swing.JTextField();
        presidentvotes = new javax.swing.JLabel();
        vicepresidentvotes = new javax.swing.JLabel();
        piovotes = new javax.swing.JLabel();
        treasurervotes = new javax.swing.JLabel();
        auditorvotes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Position");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 90, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Vice President");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 159, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Secretary");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 159, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Treasurer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 159, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Auditor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 159, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("P.I.O");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 159, 50));

        vicename.setEditable(false);
        vicename.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(vicename, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 250, 40));

        secretaryvotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        secretaryvotes.setText("10");
        getContentPane().add(secretaryvotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 50, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Winning Votes");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("President");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Candidate Name");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("WINNERS");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 132, 713, 10));

        presidentname.setEditable(false);
        presidentname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(presidentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 250, 40));

        secretaryname.setEditable(false);
        secretaryname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(secretaryname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 250, 40));

        treasurername.setEditable(false);
        treasurername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(treasurername, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 250, 40));

        auditorname.setEditable(false);
        auditorname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(auditorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 250, 40));

        pioname.setEditable(false);
        pioname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(pioname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 250, 40));

        presidentvotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        presidentvotes.setText("10");
        getContentPane().add(presidentvotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 50, 50));

        vicepresidentvotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        vicepresidentvotes.setText("10");
        getContentPane().add(vicepresidentvotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 50, 50));

        piovotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        piovotes.setText("10");
        getContentPane().add(piovotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 50, 50));

        treasurervotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        treasurervotes.setText("10");
        getContentPane().add(treasurervotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 50, 50));

        auditorvotes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        auditorvotes.setText("10");
        getContentPane().add(auditorvotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        adminmenu admin = new adminmenu();
        admin.setVisible(true);  
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(voteresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(voteresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(voteresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(voteresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new voteresult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField auditorname;
    private javax.swing.JLabel auditorvotes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField pioname;
    private javax.swing.JLabel piovotes;
    private javax.swing.JTextField presidentname;
    private javax.swing.JLabel presidentvotes;
    private javax.swing.JTextField secretaryname;
    private javax.swing.JLabel secretaryvotes;
    private javax.swing.JTextField treasurername;
    private javax.swing.JLabel treasurervotes;
    private javax.swing.JTextField vicename;
    private javax.swing.JLabel vicepresidentvotes;
    // End of variables declaration//GEN-END:variables
}
