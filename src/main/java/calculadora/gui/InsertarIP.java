package calculadora.gui;
import calculadora.objects.IP;
import javax.swing.JOptionPane;

/**
 * En este formulario se inserta la dirección IP que se quiere sacar
 * su información.
 * 
 * @author javier
 */
public class InsertarIP extends javax.swing.JFrame {
    
    public InsertarIP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jLabelDir = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jIP = new javax.swing.JTextField();
        jSeparator = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de subneting");
        setMinimumSize(new java.awt.Dimension(511, 160));
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(153, 153, 153));
        jPanel.setForeground(new java.awt.Color(153, 153, 153));

        jLabelDir.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabelDir.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDir.setText("Dirección IP:");

        jButtonCalcular.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCalcular.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButtonCalcular.setForeground(new java.awt.Color(204, 204, 204));
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.setBorderPainted(false);
        jButtonCalcular.setFocusPainted(false);
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jSalir.setBackground(new java.awt.Color(51, 51, 51));
        jSalir.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jSalir.setForeground(new java.awt.Color(204, 204, 204));
        jSalir.setText("Salir");
        jSalir.setBorderPainted(false);
        jSalir.setFocusPainted(false);
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jIP.setBackground(new java.awt.Color(153, 153, 153));
        jIP.setFont(new java.awt.Font("sansserif", 0, 19)); // NOI18N
        jIP.setForeground(new java.awt.Color(102, 102, 103));
        jIP.setBorder(null);
        jIP.setCaretColor(new java.awt.Color(102, 102, 102));
        jIP.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        jIP.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        jIP.setSelectionColor(new java.awt.Color(204, 204, 204));

        jSeparator.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDir)
                    .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jIP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalcular)
                    .addComponent(jSalir))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSalirActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        InformacionIP ven;
        IP dirIP;
        
        try {
            dirIP = new IP();
            dirIP.setIp(jIP.getText());
            ven = new InformacionIP(dirIP);
                
            this.setVisible(false);
            ven.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "La dirección IP no es válida ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JTextField jIP;
    private javax.swing.JLabel jLabelDir;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSalir;
    private javax.swing.JSeparator jSeparator;
    // End of variables declaration//GEN-END:variables
}
