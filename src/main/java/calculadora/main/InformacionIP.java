package calculadora.main;

import calculadora.lib.CalculosIP;
import calculadora.objects.IP;
import javax.swing.JOptionPane;

/**
 * Esta ventana muestra la infromación de la ip.
 * 
 * @author javier
 */
public class InformacionIP extends javax.swing.JFrame {
    private IP direccion;
    private int cantHost;
    private String dirRed, dirBro, hostMin, hostMax, pos;
    
    /**
     * Construye la ventana en la que se muestra la información.
     * 
     * @param direccion La dirección IP de la que se quiere sacar la información.
     */
    public InformacionIP(IP direccion) {
        this.direccion = direccion;
        
        try {
            cantHost = CalculosIP.cantidadDeHost(this.direccion);
            dirRed = direccion.getMascara() > 31 ? "No hay dirección de red" : direccion.sacarDireccionDeSubred().toString();
            dirBro = direccion.getMascara() > 31 ? "No hay dirección de broadcast" : direccion.sacarDireccionDeBroadcast().toString();
            hostMin = direccion.getMascara() > 30 ? "No hay host mínimo" : CalculosIP.buscarIp(1, direccion).toString();
            hostMax = direccion.getMascara() > 30 ? "No hay host máximo" : CalculosIP.buscarIp(cantHost, direccion).toString();
            pos = direccion.posicionIp() < 0 ? "Posición no válida" : direccion.posicionIp() + "";
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la consulta", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelDirRed = new javax.swing.JLabel();
        jLabelDirBrod = new javax.swing.JLabel();
        jLabelCantHost = new javax.swing.JLabel();
        jLabelHostMin = new javax.swing.JLabel();
        jLabelHostMax = new javax.swing.JLabel();
        jLabelPosicion = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de subneting");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Lato Heavy", 0, 22)); // NOI18N
        jLabelTitulo.setText("Información de la IP: " + this.direccion);

        jLabelDirRed.setText("Dirección de red: " + dirRed);

        jLabelDirBrod.setText("Dirección de broadcast: " + dirBro);

        jLabelCantHost.setText("Cantidad de host válidos: " + cantHost);

        jLabelHostMin.setText("Host mínimo: " + hostMin);

        jLabelHostMax.setText("Host máximo: " + hostMax);

        jLabelPosicion.setText("Posición de la IP: " + pos);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDirRed)
                                    .addComponent(jLabelDirBrod)
                                    .addComponent(jLabelCantHost)
                                    .addComponent(jLabelHostMin)
                                    .addComponent(jLabelHostMax)
                                    .addComponent(jLabelPosicion))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVolver)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDirRed)
                .addGap(18, 18, 18)
                .addComponent(jLabelDirBrod)
                .addGap(18, 18, 18)
                .addComponent(jLabelCantHost)
                .addGap(18, 18, 18)
                .addComponent(jLabelHostMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelHostMax)
                .addGap(18, 18, 18)
                .addComponent(jLabelPosicion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButton1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        InsertarIP i = new InsertarIP();
        
        this.setVisible(false);
        i.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BuscarIP i = new BuscarIP(this, true, direccion);
        
        i.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelCantHost;
    private javax.swing.JLabel jLabelDirBrod;
    private javax.swing.JLabel jLabelDirRed;
    private javax.swing.JLabel jLabelHostMax;
    private javax.swing.JLabel jLabelHostMin;
    private javax.swing.JLabel jLabelPosicion;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
