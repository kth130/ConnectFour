/*

 */
package is.hi.c4.utlit;

import javax.swing.JPanel;

/**
 * Viðmótsklasi fyrir ConnectFour leik
 * @author Kristjan Þorarinsson, kth130@hi.is 
 * HBV201G 
 * Háskóli Íslands
 * 
 * @version 1
 */
public class T4 extends javax.swing.JFrame {

    private final JPanel[] dalkar; // fylki fyrir dálkana
    private DalkurPanel nuverandiPanel; 
    
    /**
     * Smiður fyrir T4
     */
    public T4() {
        initComponents();
        dalkar = new JPanel[]{jD1,jD2,jD3,jD4};
        for (int i =0; i < dalkar.length; i++){
            dalkar[i].setName(String.valueOf(i));
        }
        
    }
    /**
     * Skilar einum dálki af DalkurPanel
     * @param i
     * @return DalkurPanel
     */
    public DalkurPanel skilaDalk(int i){
        return  (DalkurPanel)dalkar[i];
    }
    /**
     * Stillir nuverandiPanel
     * @param panel 
     */
    public void setDalkur(DalkurPanel panel){
        nuverandiPanel = panel;
    }
    /**
     * Skilar núverandi dálki
     * @return nuverandiDalkur
     */
    public DalkurPanel getDalkur(){
        return nuverandiPanel;
    }
    
    /**
     * Sendur skilaboðsglugga um að leik sé lokið, og þá einnig hver vann
     */
    public void setSkilabod(String s){
        jSkilabod.setText(s);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new LausPedPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jD4 = new DalkurPanel()
        ;
        jD3 = new DalkurPanel()
        ;
        jD1 = new DalkurPanel()
        ;
        jD2 = new DalkurPanel()

        ;
        jNyrLeikur = new javax.swing.JButton();
        jSkilabod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect4");
        setResizable(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        jD4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jD4.setMinimumSize(new java.awt.Dimension(56, 186));
        jD4.setName(""); // NOI18N

        javax.swing.GroupLayout jD4Layout = new javax.swing.GroupLayout(jD4);
        jD4.setLayout(jD4Layout);
        jD4Layout.setHorizontalGroup(
            jD4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jD4Layout.setVerticalGroup(
            jD4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jD3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jD3.setMinimumSize(new java.awt.Dimension(56, 186));
        jD3.setName(""); // NOI18N

        javax.swing.GroupLayout jD3Layout = new javax.swing.GroupLayout(jD3);
        jD3.setLayout(jD3Layout);
        jD3Layout.setHorizontalGroup(
            jD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jD3Layout.setVerticalGroup(
            jD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jD1.setMinimumSize(new java.awt.Dimension(56, 186));
        jD1.setName(""); // NOI18N

        javax.swing.GroupLayout jD1Layout = new javax.swing.GroupLayout(jD1);
        jD1.setLayout(jD1Layout);
        jD1Layout.setHorizontalGroup(
            jD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jD1Layout.setVerticalGroup(
            jD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jD2.setMinimumSize(new java.awt.Dimension(56, 186));
        jD2.setName(""); // NOI18N

        javax.swing.GroupLayout jD2Layout = new javax.swing.GroupLayout(jD2);
        jD2.setLayout(jD2Layout);
        jD2Layout.setHorizontalGroup(
            jD2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jD2Layout.setVerticalGroup(
            jD2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jD4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jD3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jD1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jD2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jD2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jD4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jD1, jD2, jD3, jD4});

        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jD2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jD3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jD1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jD4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jD1, jD2, jD3, jD4});

        jD4.getAccessibleContext().setAccessibleName("");
        jD3.getAccessibleContext().setAccessibleName("");
        jD1.getAccessibleContext().setAccessibleName("");
        jD2.getAccessibleContext().setAccessibleName("");

        jNyrLeikur.setText("Nýr Leikur");
        jNyrLeikur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNyrLeikurActionPerformed(evt);
            }
        });

        jSkilabod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jSkilabod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSkilabod.setText("Hefjið leik");
        jSkilabod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jNyrLeikur)))
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addComponent(jSkilabod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSkilabod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNyrLeikur)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Bregst við þegar ýtt er á nýr leikur takkann
     * @param evt 
     */
    private void jNyrLeikurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNyrLeikurActionPerformed
      ((LausPedPanel)jPanel1).nyrLeikur();
      for(int i = 0;i < dalkar.length;i++){
          ((DalkurPanel)dalkar[i]).nyrLeikur();
      }
    }//GEN-LAST:event_jNyrLeikurActionPerformed

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
            java.util.logging.Logger.getLogger(T4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jD1;
    private javax.swing.JPanel jD2;
    private javax.swing.JPanel jD3;
    private javax.swing.JPanel jD4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton jNyrLeikur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jSkilabod;
    // End of variables declaration//GEN-END:variables
}
