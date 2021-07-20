/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dao.DAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Order;
import model.Product;
import tablemodels.OrderTableModel;

/**
 *
 * @author user
 */
public class UiOrder extends javax.swing.JFrame {

    /**
     * Creates new form UiOrder
     */
    OrderTableModel ordModel;
    DAO dao;
    List<Order> listOrder;
    
    public UiOrder() {
        List<Order> orders = null;
        
        dao = new DAO();
        orders = dao.getAllOrders();
        this.ordModel = new OrderTableModel(orders);
      //  jTableOrder.setModel(ordModel);
        
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrder = new javax.swing.JTable();
        jBtnGetProduct = new javax.swing.JButton();
        jLabelIDProduct = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonGetTime = new javax.swing.JButton();
        jbtnProducts = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldTime = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableOrder.setModel(ordModel);
        jScrollPane1.setViewportView(jTableOrder);

        jBtnGetProduct.setLabel("Изделие в заказе");
        jBtnGetProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGetProductActionPerformed(evt);
            }
        });

        jLabelIDProduct.setText("ID:");

        jLabelID.setText("-");

        jLabelName.setText("-");

        jLabelTime.setText("-");

        jLabel1.setText("Имя:");

        jLabel2.setText("Время:");

        jLabel3.setText("Заказы:");

        jButtonGetTime.setText("Расчитать время выполнения заказа");
        jButtonGetTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetTimeActionPerformed(evt);
            }
        });

        jbtnProducts.setText("Список изделий");
        jbtnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProductsActionPerformed(evt);
            }
        });

        jTextFieldID.setEditable(false);

        jTextFieldName.setEditable(false);

        jTextFieldTime.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabelIDProduct)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelName)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldName))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelTime)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldTime))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelID)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnGetProduct)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonGetTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnProducts)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGetProduct)
                    .addComponent(jButtonGetTime)
                    .addComponent(jbtnProducts))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDProduct)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelTime)
                    .addComponent(jTextFieldTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGetProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGetProductActionPerformed
       try{
        int indexRow = jTableOrder.getSelectedRow();
        OrderTableModel ordModel = (OrderTableModel) jTableOrder.getModel();
        int idProduct = Integer.parseInt(ordModel.getValueAt(indexRow, 0).toString());
        Product product = dao.getProductById(idProduct);
        jTextFieldID.setText(String.valueOf(product.getId()));
        jTextFieldName.setText(String.valueOf(product.getName()));
        jTextFieldTime.setText(String.valueOf(product.getTime()));
       } catch(NullPointerException ex){
           JOptionPane.showMessageDialog(null, "В начале нужно выделить заказ: " + ex, "Выделите заказ", 1);
       } catch(ArrayIndexOutOfBoundsException ex){
           JOptionPane.showMessageDialog(null, "В начале нужно выделить заказ: " + ex, "Выделите заказ", 1);
       }
        
    }//GEN-LAST:event_jBtnGetProductActionPerformed

    private void jbtnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProductsActionPerformed
         try {
              //  dispose();
                productFrame pf = new productFrame();
                pf.setVisible(true);
            } catch (Exception ex) {
                System.out.println("Error");
            }
    }//GEN-LAST:event_jbtnProductsActionPerformed

    private void jButtonGetTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGetTimeActionPerformed
        // TODO add your handling code here:
        try{
        int indexRow = jTableOrder.getSelectedRow();
         int idProduct = Integer.parseInt(ordModel.getValueAt(indexRow, 0).toString());
         int time = dao.timeFromDetail(idProduct) + dao.timeFromProduct(idProduct);
         String timeStr = "";
         if (time == 0) {timeStr = "Пока Неизвестно. ";}
         else {timeStr = String.valueOf(time);}
          JOptionPane.showMessageDialog(null, "Время для выполнения: " + time, "Время для заказа: ", 1);
        }  catch(ArrayIndexOutOfBoundsException ex){
           JOptionPane.showMessageDialog(null, "В начале нужно выделить заказ: " + ex, "Выделите заказ", 1);
       }
    }//GEN-LAST:event_jButtonGetTimeActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(UiOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UiOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UiOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UiOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UiOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGetProduct;
    private javax.swing.JButton jButtonGetTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIDProduct;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableOrder;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldTime;
    private javax.swing.JButton jbtnProducts;
    // End of variables declaration//GEN-END:variables
}
