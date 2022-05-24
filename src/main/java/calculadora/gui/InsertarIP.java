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

        jLabelDir = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        jTextFieldDir = new javax.swing.JTextField();
        jButtonAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de subneting");
        setResizable(false);

        jLabelDir.setText("Dirección IP:");

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jButtonAyuda.setText("Ayuda");
        jButtonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jButtonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDir)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDir)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDir)
                    .addComponent(jTextFieldDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalcular)
                    .addComponent(jButtonAyuda))
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAyudaActionPerformed
        JOptionPane.showMessageDialog(null, "La dirección IP debe tener la siguiente estructura: X.X.X.X/X", 
                "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonAyudaActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        String dir = jTextFieldDir.getText();
        InformacionIP ven;
        IP dirIP;
        
        if (!dir.equals("")){
            try {
                dirIP = new IP();

                if (!dir.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}/[0-9]{1,2}")){
                    JOptionPane.showMessageDialog(null, "La dirección IP debe tener la siguiente estructura: X.X.X.X/X", 
                            "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    dirIP.setIp(dir);
                    ven = new InformacionIP(dirIP);

                    this.setVisible(false);
                    ven.setVisible(true);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "La dirección IP no es válida ", "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Inserte una dirección IP", "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAyuda;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabelDir;
    private javax.swing.JTextField jTextFieldDir;
    // End of variables declaration//GEN-END:variables
}
