//New
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinic;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noeman
 */
public class actionMenu extends javax.swing.JFrame {
    public Patient x; 
    public Login p; 
    protected Doctor bookDoc; 
    protected int bDay ;
    protected int bTime ;
    public void catchPat(Patient x){
         
        this.x =  x; 
    }
      public void welcomeS(String n){
         
        welcNote.setText("welcome, "+n+"!");
    }
    /**
     * Creates new form actionMenu
     */
      public ArrayList <Doctor> d = new ArrayList(); 
    public void initDoctors(){
        //int doctorId, String doctorName, String phoneNumber,String specialization, double fees
        Doctor d1 = new Doctor(142,"Dr. Hussien","01112548664","Neurology",350); 
        Doctor d2 = new Doctor(242,"Dr. M.ELkady","01552217544","Cardiology",500); 
        Doctor d3 = new Doctor(254,"Dr. Ismail","01157007154","Cardiology",450); 
        Doctor d4 = new Doctor(312,"Dr. Nermin","011005126648","Cardiology",550); 
        Doctor d5 = new Doctor(395,"Dr. A.hamed","01003544051","Neurology",360); 
        Doctor d6 = new Doctor(445,"Dr. George","01203475654","Neurology",400); 
        Doctor d7 = new Doctor(498,"Dr. Karim","01000045711","Neurology",650); 
        		
                
        d1.setSchedule(1,3);
        d1.setSchedule(5,4);//5 4 
        d2.setSchedule(0,3);//0 3
        d2.setSchedule(2,0);      
        d3.setSchedule(4,1);
        d3.setSchedule(4,0);
        d4.setSchedule(3,1);
        d4.setSchedule(0,4);
        d5.setSchedule(3,1);
        d5.setSchedule(5,1);
        d6.setSchedule(5,3);
        d6.setSchedule(3,1);
        d7.setSchedule(1,2);
        d7.setSchedule(0,4);
        d.add(d1);
        d.add(d2);
        d.add(d3);
        d.add(d4);
        d.add(d5);
        d.add(d6);
        d.add(d7);
        
    }
    public actionMenu() {
        initComponents();
        initDoctors();
         
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewPinfoBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        setPassBtn = new javax.swing.JButton();
        welcNote = new javax.swing.JLabel();
        ChkSchedBtn = new javax.swing.JButton();
        BookApBtn = new javax.swing.JButton();
        viewCxlApBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Cbox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cbox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewPinfoBtn.setText("View personal info");
        viewPinfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPinfoBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Account actions");

        setPassBtn.setText("Set Password");
        setPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPassBtnActionPerformed(evt);
            }
        });

        welcNote.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        welcNote.setText("Welcome, ");

        ChkSchedBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ChkSchedBtn.setText("Check Schedule");
        ChkSchedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkSchedBtnActionPerformed(evt);
            }
        });

        BookApBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        BookApBtn.setText("Book Appointment");
        BookApBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookApBtnMouseClicked(evt);
            }
        });
        BookApBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookApBtnActionPerformed(evt);
            }
        });

        viewCxlApBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        viewCxlApBtn.setText("View/Cancel Appointments");
        viewCxlApBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCxlApBtnActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sat", null, null, null, null, null},
                {"Sun", null, null, null, null, null},
                {"Mon", null, null, null, null, null},
                {"Tue", null, null, null, null, null},
                {"Wed", null, null, null, null, null},
                {"Thu", null, null, null, null, null}
            },
            new String [] {
                "", "9-11", "11-1", "1-3", "3-5", "5-7"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(60);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        Cbox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cbox1ItemStateChanged(evt);
            }
        });
        Cbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cbox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Doctor");

        jLabel4.setText("Time");

        Cbox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cbox2ItemStateChanged(evt);
            }
        });
        Cbox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cbox2MouseEntered(evt);
            }
        });
        Cbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cbox2ActionPerformed(evt);
            }
        });

        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewCxlApBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(BookApBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ChkSchedBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(welcNote, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(448, 448, 448)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(viewPinfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setPassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewPinfoBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(welcNote, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setPassBtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(ChkSchedBtn)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Cbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Cbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(BookApBtn)
                        .addGap(110, 110, 110)
                        .addComponent(viewCxlApBtn)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
  
    private void viewPinfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPinfoBtnActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Name: "
                + x.getName()+"\nPhone: "+x.getPhoneNumber()+
                        "\nUsermame: "+x.getUsername(), "Account Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_viewPinfoBtnActionPerformed

    private void viewCxlApBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCxlApBtnActionPerformed
        System.out.println(this.x.getAppointments());    
        viewBook page = new viewBook(); 
            page.catchObj(bookDoc,x);
           page.view(this.x.getAppointments());
            page.show(); 
    }//GEN-LAST:event_viewCxlApBtnActionPerformed

    private void ChkSchedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkSchedBtnActionPerformed
        
        String space = "  ";
        Cbox1.removeAllItems();
        Cbox2.removeAllItems();
       for (int k = 0;k<6; k++){
           for(int i=1; i<6; i++){
               table.setValueAt(space,k,i);
           }
       }
        
        for(int k=0; k<6;k++){
             
            String day= ""; 
            switch(k){
                case(0) : day = "Sat"; break;
                case(1) : day = "Sun"; break;
                case(2) : day = "Mon"; break;
                case(3) : day = "Tue"; break;
                case(4) : day = "Wed"; break;
                case(5) : day = "Thu"; break;
            } System.out.print(day + " :");
            for(int j=0; j<6;j++){
                 for(int i=0;i<d.size();i++){
                     char t = d.get(i).getStatus(k, j);
                     if(t == 'A'){
                        // System.out.print(d.get(i).getName()+" :"+d.get(i).getSpecialization() + " ");
                         table.setValueAt(d.get(i).getName()+"("+d.get(i).getSpecialization()+")", k, j+1);
                     }
                   
            }
                 System.out.print("|");
            }
           
            System.out.println("");
        }
         
        for(int i = 0; i < d.size();i++){
            Cbox1.addItem(d.get(i).getName());
        }
    }//GEN-LAST:event_ChkSchedBtnActionPerformed

    private void BookApBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookApBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BookApBtnMouseClicked

    private void Cbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cbox1ActionPerformed
       
     //   System.out.println(name);
    
       
    }//GEN-LAST:event_Cbox1ActionPerformed
  
    private void BookApBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookApBtnActionPerformed
       
       String in = Cbox2.getSelectedItem().toString();
       
       String [] D = new String [6]; 
        D[0] = "Saturday"; 
        D[1] = "Sunday"; 
        D[2] = "Monday"; 
        D[3] = "Tuesday"; 
        D[4] = "Wedensday"; 
        D[5] = "Thursday"; 
        String [] t = new String[6]; 
        t [0] = "9-11";
        t [1] = "11-1";
        t [2] = "1-3";
        t [3] = "3-5";
        t [4] = "5-7";
        t [5] = "7-9"; 
        for(int i = 0; i <6; i++){
            for(int j = 0; j<6; j++){
                
        String temp = D[i]+t[j];
                if(temp.equals(in)){
                    this.bDay = i;
                    this.bTime = j;
                }
            }
        }
        
        this.x.Book(bookDoc, bDay, bTime);
         
                        JOptionPane.showMessageDialog(this,"     Booked!\n"+bookDoc.getName() +
                                "\nTime: "+ in + "\nFees: "+String.valueOf(bookDoc.getFees())
                                ,"Information",JOptionPane.INFORMATION_MESSAGE);
                        
         ChkSchedBtnActionPerformed(evt);
    }//GEN-LAST:event_BookApBtnActionPerformed

    private void Cbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cbox2ActionPerformed
        
    }//GEN-LAST:event_Cbox2ActionPerformed

    private void Cbox2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cbox2MouseEntered
      
    }//GEN-LAST:event_Cbox2MouseEntered

    private void Cbox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cbox2ItemStateChanged
      
    }//GEN-LAST:event_Cbox2ItemStateChanged

    private void Cbox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cbox1ItemStateChanged
         if(evt.getStateChange()==java.awt.event.ItemEvent.SELECTED){
                String name = Cbox1.getSelectedItem().toString();
      Cbox2.removeAllItems();
          for (int i=0;i<d.size();i++){
           if(d.get(i).getName().equals(name)){
               this.bookDoc=d.get(i);
              for(int j=0; j<bookDoc.getSchedule().size();j++){
                  Cbox2.addItem(bookDoc.getSchedule().get(j));
              }
               break;
           }
       }
        }
    }//GEN-LAST:event_Cbox1ItemStateChanged

    private void setPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPassBtnActionPerformed
       String pass = JOptionPane.showInputDialog("Set new password:");
        System.out.println(pass);
        if(pass!=null){
            x.setPassword(pass);
            JOptionPane.showMessageDialog(this,"Password reset successfully"," ",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_setPassBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose(); 
        Login newPage = new Login(); 
        newPage.show();
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
            java.util.logging.Logger.getLogger(actionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new actionMenu().setVisible(true);
               
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookApBtn;
    private javax.swing.JComboBox<String> Cbox1;
    private javax.swing.JComboBox<String> Cbox2;
    private javax.swing.JButton ChkSchedBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton setPassBtn;
    private javax.swing.JTable table;
    private javax.swing.JButton viewCxlApBtn;
    private javax.swing.JButton viewPinfoBtn;
    private javax.swing.JLabel welcNote;
    // End of variables declaration//GEN-END:variables
}