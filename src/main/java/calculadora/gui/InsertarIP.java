package calculadora.gui;
import calculadora.objects.IP;
import javax.swing.DefaultComboBoxModel;
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
        rellenarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelDir = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jPrimerOcteto = new javax.swing.JComboBox<>();
        jCuartoOcteto = new javax.swing.JComboBox<>();
        jSegundoOcteto = new javax.swing.JComboBox<>();
        jTercerOcteto = new javax.swing.JComboBox<>();
        jMascara = new javax.swing.JComboBox<>();

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
        setMaximumSize(new java.awt.Dimension(511, 160));
        setMinimumSize(new java.awt.Dimension(511, 160));
        setResizable(false);

        jLabelDir.setText("Dirección IP:");

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPrimerOcteto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSegundoOcteto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTercerOcteto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCuartoOcteto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jMascara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDir)
                    .addComponent(jPrimerOcteto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCuartoOcteto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSegundoOcteto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTercerOcteto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMascara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalcular)
                    .addComponent(jSalir))
                .addGap(28, 28, 28))
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
        Integer primerOcteto, segundoOcteto, tercerOcteto, cuartoOcteto, mascara;
        
        primerOcteto = (Integer) jPrimerOcteto.getSelectedItem();
        segundoOcteto = (Integer) jSegundoOcteto.getSelectedItem();
        tercerOcteto = (Integer) jTercerOcteto.getSelectedItem();
        cuartoOcteto = (Integer) jCuartoOcteto.getSelectedItem();
        mascara = (Integer) jMascara.getSelectedItem();
        
        try {
            dirIP = new IP(primerOcteto, segundoOcteto, tercerOcteto, cuartoOcteto, mascara);
            ven = new InformacionIP(dirIP);
                
            this.setVisible(false);
            ven.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "La dirección IP no es válida ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void rellenarComboBox(){
        DefaultComboBoxModel modeloPrimerOcteto = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloSegundoOcteto = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloTercerOcteto = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloCuartoOcteto = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloMascara = new DefaultComboBoxModel();
        
        
        for (int i = 0; i < 256; i++) {
            modeloPrimerOcteto.addElement(i);
            modeloSegundoOcteto.addElement(i);
            modeloTercerOcteto.addElement(i);
            modeloCuartoOcteto.addElement(i);
            
            
            if (i < 33 && i > 0){
                modeloMascara.addElement(i);
            }
        }
        
        jPrimerOcteto.setModel(modeloPrimerOcteto);
        jSegundoOcteto.setModel(modeloSegundoOcteto);
        jTercerOcteto.setModel(modeloTercerOcteto);
        jCuartoOcteto.setModel(modeloCuartoOcteto);
        jMascara.setModel(modeloMascara);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JComboBox<String> jCuartoOcteto;
    private javax.swing.JLabel jLabelDir;
    private javax.swing.JComboBox<String> jMascara;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jPrimerOcteto;
    private javax.swing.JButton jSalir;
    private javax.swing.JComboBox<String> jSegundoOcteto;
    private javax.swing.JComboBox<String> jTercerOcteto;
    // End of variables declaration//GEN-END:variables
}
