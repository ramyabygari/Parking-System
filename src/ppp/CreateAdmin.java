/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppp;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ppp.SQLCONNECTION_NEW;
import ppp.user;
import java.text.DecimalFormat;
import java.awt.HeadlessException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.time.Clock;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ppp.SQLCONNECTION_NEW;
import ppp.user;
import java.text.DecimalFormat;
import java.awt.HeadlessException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.time.Clock;
/**
/**
/**
 *
 * @author pawan
 */
public class CreateAdmin extends javax.swing.JFrame {
String address,port,user,pass;
    /**
     * Creates new form CreateAdmin
     */
    public CreateAdmin(String a,String b,String c,String d) {
        run();
        setResizable(false);
        address = a;
        port = b;
        user = c;
        pass = d;
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        usertxt = new javax.swing.JTextField();
        passtxt = new javax.swing.JPasswordField();
        cnfpasstxt = new javax.swing.JPasswordField();
        nametxt = new javax.swing.JTextField();
        addrtxt = new javax.swing.JTextField();
        phntxt = new javax.swing.JTextField();
        ranktxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        monthtxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dailytxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        mtaxtxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dtaxtxt = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("user");

        jLabel2.setText("pass");

        jLabel3.setText("cnfpass");

        jLabel4.setText("namw");

        jLabel5.setText("phone");

        jLabel6.setText("add");

        jLabel7.setText("rank");

        jRadioButton1.setText("male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        passtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxtActionPerformed(evt);
            }
        });

        ranktxt.setText("Admin");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        monthtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthtxtActionPerformed(evt);
            }
        });

        jLabel9.setText("montly fare");

        jLabel10.setText("30 mins fare");

        dailytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailytxtActionPerformed(evt);
            }
        });

        jLabel11.setText("monthy tax");

        jLabel12.setText("daily tax");

        jTextField1.setText("jTextField1");

        jLabel14.setText("vehicle");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(195, 195, 195))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(72, 72, 72)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usertxt)
                                    .addComponent(nametxt)
                                    .addComponent(addrtxt)
                                    .addComponent(phntxt)
                                    .addComponent(cnfpasstxt)
                                    .addComponent(monthtxt)
                                    .addComponent(passtxt)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ranktxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dailytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mtaxtxt)
                            .addComponent(jTextField1)
                            .addComponent(dtaxtxt))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(mtaxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(dtaxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cnfpasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ranktxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel10)
                    .addComponent(dailytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String c_user,c_pass,c_compass,c_name,c_gen,c_phone,c_address,c_rank,c_monthly,c_daily,c_mtax,c_dtax,c_vehi;
        
        c_user = usertxt.getText();
        c_pass =passtxt.getText();
        c_compass = cnfpasstxt.getText();
        c_name = nametxt.getText();
        c_gen = gender;
        c_vehi=jTextField1.getText();
        c_phone= phntxt.getText();
        c_address = addrtxt.getText();
        c_rank = ranktxt.getText();
        c_monthly=monthtxt.getText();
        c_daily=dailytxt.getText();
        c_mtax=mtaxtxt.getText();
        c_dtax=dtaxtxt.getText();
        Date d = new Date(System.currentTimeMillis());
        
        //String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        
        
       
        if("".equals(c_user)){
                    JOptionPane.showMessageDialog(null, "Please enter Username");
                }else if("".equals(c_pass)){
                    JOptionPane.showMessageDialog(null, "Please enter Password");
                }else if("".equals(c_compass)){
                    JOptionPane.showMessageDialog(null, "Please enter Comfirm Password");            
                }else if("".equals(c_name)){
                    JOptionPane.showMessageDialog(null, "Please enter your Full Name");
                }
                else if(c_gen == null){
                    JOptionPane.showMessageDialog(null, "Please select your Gender");
                }else if("".equals(c_phone)){
                    JOptionPane.showMessageDialog(null, "Please enter your Phone Number");
                }else if("".equals(c_address)){
                    JOptionPane.showMessageDialog(null, "Please enter the Address");
                }else if(!c_pass.equals(c_compass)){
                    JOptionPane.showMessageDialog(null, "Password not math");
                }else if("".equals(c_daily)){
                    JOptionPane.showMessageDialog(null, "Please enter Monthly fare");
                }else if("".equals(c_monthly)){
                    JOptionPane.showMessageDialog(null, "Please enter Daily Fare");}
                else if("".equals(c_mtax)){
                    JOptionPane.showMessageDialog(null, "Please enter Monthly tax");}
                else if("".equals(c_dtax)){
                    JOptionPane.showMessageDialog(null, "Please enter Daily tax");}
                 else if("".equals(c_vehi)){
                    JOptionPane.showMessageDialog(null, "Please enter Vehicle NO.");}
                 else{
                    Connection c;    SQLCONNECTION_NEW MyCon;
                    Statement stmt;  String SQL;
                    Connection theConn = null;java.util.Date date = new java.util.Date();
      long t = date.getTime();
      java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(t);
                    try {
                
                MyCon = new SQLCONNECTION_NEW(address,port,user,pass);
                theConn = MyCon.getConnection("Software_Parking_Project");
                stmt = theConn.createStatement();
                SQL = "insert into Regular (user,password,name,gender,phone,address,rank,Vehicle,Time) values "
                        + "('" + c_user + "','" + c_pass + "','"+ c_name +"','" + c_gen + "','"+ c_phone +"','" + c_address +"','" + c_rank +"','" + c_vehi +"','" + sqlTimestamp + "')";  
                stmt.executeUpdate(SQL); 
                JOptionPane.showMessageDialog(null, "Adding Successful");//monthly_fare INT not NULL,daily_fare INT not NULL
                int i = Integer.parseInt(c_monthly);
                int j = Integer.parseInt(c_daily);System.out.println(i);System.out.println(j);
                Float monthly=Float.parseFloat(c_mtax);System.out.println(c_mtax);System.out.println(c_dtax);
                Float daily=Float.parseFloat(c_dtax);System.out.println(monthly);System.out.println(daily);
                
                SQL = "INSERT INTO Fare(monthly_fare,daily_fare,mtax,dtax,time) VALUES ('"+i+"','"+j+"','"+monthly+"','"+daily+"','"+sqlTimestamp+"')";  
                stmt.executeUpdate(SQL); 
                JOptionPane.showMessageDialog(null, "Monthly fares and tax updated");
                 JOptionPane.showMessageDialog(null, "Daily fares and tax updated");
                new user(address,port,user,pass).setVisible(true);
                setVisible(false);
                
                }
                    catch(SQLException ex) {
                     JOptionPane.showMessageDialog(null, ex);
                }
                    finally {
                    try {
                            if (theConn != null) theConn.close();
                        }
                             catch (Exception e) {
                                 
                 }
               }
                }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxtActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        gender="Male";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
  gender="Female";        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void dailytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dailytxtActionPerformed

    private void monthtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthtxtActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
       // /* Set the Nimbus look and feel */
       //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       private void run(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
          //  public void run() {
          //      new CreateAdmin().setVisible(true);
           // }
      // });
  //  }
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrtxt;
    private javax.swing.JPasswordField cnfpasstxt;
    private javax.swing.JTextField dailytxt;
    private javax.swing.JTextField dtaxtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField monthtxt;
    private javax.swing.JTextField mtaxtxt;
    private javax.swing.JTextField nametxt;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JTextField phntxt;
    private javax.swing.JTextField ranktxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables

   
    String gender;

   

   
}
