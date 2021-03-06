/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Song;
import controller.ControllerDanhMuc;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import model.ModelDanhMuc;

/**
 *
 * @author LINNGUYEN
 */
public class demo extends javax.swing.JFrame {
    private ControllerDanhMuc controller;
    private ModelDanhMuc model;
    /**
     * Creates new form NewJFrame
     */
    public demo() {
        initComponents();
        this.setTitle("Bài hát yêu thích-Vinaenter");
        this.setResizable(false);
        setSize();
        controller=new ControllerDanhMuc(tbMain);
        controller.loadTable();
        
    }
    public void setSize(){
        tfIDSong.setPreferredSize(new Dimension(WIDTH,26));
        tfID.setPreferredSize(new Dimension(WIDTH,26));
        tfAuthor.setPreferredSize(new Dimension(WIDTH,26));
        tfTacGia.setPreferredSize(new Dimension(WIDTH,26));
        tfTen.setPreferredSize(new Dimension(WIDTH,26));
        tfName.setPreferredSize(new Dimension(WIDTH,26));
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMain = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfTen = new javax.swing.JTextField();
        tfTacGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbLuotNghe = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbXepHang = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfIDSong = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfAuthor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbRank = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        btTimKiem = new javax.swing.JButton();
        btTatCa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 204, 109), 8)));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 175));
        jPanel1.setRequestFocusEnabled(false);

        tbMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbMainMousePressed(evt);
            }
        });
        tbMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbMainKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbMainKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbMain);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(959, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 1, 1, 1));
        jPanel3.setPreferredSize(new java.awt.Dimension(959, 260));
        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 153, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("ID bài hát:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Tên bài hát:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Tác giả:");

        tfID.setEnabled(false);
        tfID.setPreferredSize(new java.awt.Dimension(6, 25));

        tfTen.setPreferredSize(new java.awt.Dimension(6, 25));

        tfTacGia.setPreferredSize(new java.awt.Dimension(323, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Lượt nghe:");

        lbLuotNghe.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbLuotNghe.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Xếp hạng:");

        cbXepHang.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cbXepHang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 sao", "2 sao", "3 sao", "4 sao", "5 sao" }));
        cbXepHang.setPreferredSize(new java.awt.Dimension(69, 25));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });
        jPanel6.add(btThem);

        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });
        jPanel6.add(btSua);

        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        jPanel6.add(btXoa);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(lbLuotNghe)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(cbXepHang, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(12, 12, 12)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbLuotNghe)
                    .addComponent(jLabel7)
                    .addComponent(cbXepHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 153, 0))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("ID bài hát:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Tên bài hát:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Tác giả:");
        jLabel10.setToolTipText("");

        tfIDSong.setPreferredSize(new java.awt.Dimension(59, 25));

        tfName.setPreferredSize(new java.awt.Dimension(59, 25));

        tfAuthor.setPreferredSize(new java.awt.Dimension(59, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Xếp hạng:");

        cbRank.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cbRank.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 sao", "2 sao", "3 sao", "4 sao", "5 sao" }));
        cbRank.setPreferredSize(new java.awt.Dimension(56, 25));

        jPanel7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));

        btTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btTimKiem.setText("Tìm kiếm");
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });
        jPanel7.add(btTimKiem);

        btTatCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/author.png"))); // NOI18N
        btTatCa.setText("Tất cả");
        btTatCa.setPreferredSize(new java.awt.Dimension(109, 41));
        btTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTatCaActionPerformed(evt);
            }
        });
        jPanel7.add(btTatCa);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(tfIDSong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(cbRank, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfIDSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel3.add(jPanel5);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        int id=0;
        String tenBaiHat=tfTen.getText();
        String tenTacGia=tfTacGia.getText();
        int luotNghe=0;
        String xepHang=(String)cbXepHang.getSelectedItem();
        Song song=new Song(id, tenBaiHat, tenTacGia, luotNghe, xepHang);
        if(controller.addItem(song)>0){
            resetForm();
            JOptionPane.showMessageDialog(rootPane,"Thêm thành công","",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane,"Thêm thất bại","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int row=tbMain.getSelectedRow();
        if(row>=0){
            int id=Integer.parseInt(tfID.getText());
            String tenBaiHat=tfTen.getText();
            String tacGia=tfTacGia.getText();
            int luotNghe=Integer.parseInt(lbLuotNghe.getText());
            String xepHang=(String)cbXepHang.getSelectedItem();
            Song song=new Song(id, tenBaiHat, tacGia, luotNghe, xepHang);
            if(controller.editItem(song, row)>0){
                 JOptionPane.showMessageDialog(rootPane,"Sửa thành công","",JOptionPane.INFORMATION_MESSAGE);
            }else{
                 JOptionPane.showMessageDialog(rootPane,"Sửa thất bại","",JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"Chọn hàng để sửa","",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btSuaActionPerformed

    private void tbMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMainMousePressed
        setForm();
    }//GEN-LAST:event_tbMainMousePressed

    private void tbMainKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbMainKeyPressed
        setForm();
    }//GEN-LAST:event_tbMainKeyPressed

    private void tbMainKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbMainKeyReleased
        setForm();
    }//GEN-LAST:event_tbMainKeyReleased

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int row=tbMain.getSelectedRow();
        if(row>=0){
            int id=Integer.parseInt(tfID.getText());
            if(controller.delItem(id, row)>0){
              resetForm();
             JOptionPane.showMessageDialog(rootPane,"Xóa  thành công","",JOptionPane.INFORMATION_MESSAGE);   
            }else{
              JOptionPane.showMessageDialog(rootPane,"Xóa thất bại","",JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
             JOptionPane.showMessageDialog(rootPane,"Chọn hàng để xóa","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        String id = null;
        String tenBaiHat = null;
        String tacGia = null;
        String xepHang= (String)cbRank.getSelectedItem();
        if(!tfIDSong.getText().isEmpty()){
            id = tfIDSong.getText();
        }
        if(!tfName.getText().isEmpty()){
            tenBaiHat = tfName.getText();
        }
        if(!tfAuthor.getText().isEmpty()){
            tacGia = tfAuthor.getText();
        }
        System.out.println(tenBaiHat);
        System.out.println(tacGia);
        System.out.println(xepHang);
        if(controller.searchItem(id,tenBaiHat,tacGia,xepHang)>0){
            JOptionPane.showMessageDialog(rootPane," Có "+controller.searchItem(id, tenBaiHat, tacGia, xepHang)+" tìm thấy","",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane," Không tìm thấy kết quả","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btTimKiemActionPerformed

    private void btTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTatCaActionPerformed
        controller=new ControllerDanhMuc(tbMain);
        controller.loadTable();
    }//GEN-LAST:event_btTatCaActionPerformed

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
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSua;
    private javax.swing.JButton btTatCa;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox cbRank;
    private javax.swing.JComboBox cbXepHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLuotNghe;
    private javax.swing.JTable tbMain;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfIDSong;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTacGia;
    private javax.swing.JTextField tfTen;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        tfTen.setText("");
        tfTacGia.setText("");
        cbXepHang.setSelectedIndex(0);
        tfID.setText("");
        lbLuotNghe.setText("0");
    }

    private void setForm() {
        int row=tbMain.getSelectedRow();
        int id=(Integer)controller.getValueAt(row, 0);
        String tenBaiHat=(String)controller.getValueAt(row, 1);
        String tacGia=(String)controller.getValueAt(row, 2);
        int luotNghe =(Integer)controller.getValueAt(row, 3);
        String xepHang=(String)controller.getValueAt(row, 4);
        
        tfID.setText(id+"");
        tfTen.setText(tenBaiHat);
        tfTacGia.setText(tacGia);
        lbLuotNghe.setText(luotNghe+"");
        cbXepHang.setSelectedItem(xepHang);
        
    }
}
