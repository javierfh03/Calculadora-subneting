package calculadora.gui;

import calculadora.objects.CalculosIP;
import calculadora.objects.IP;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
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
        CalculosIP cal = new CalculosIP(direccion);
        
        try {
            cantHost = cal.cantidadDeHost();
            dirRed = direccion.getMascara() > 31 ? "No hay dirección de red" : direccion.sacarDireccionDeSubred().toString();
            dirBro = direccion.getMascara() > 31 ? "No hay dirección de broadcast" : direccion.sacarDireccionDeBroadcast().toString();
            hostMin = direccion.getMascara() > 30 ? "No hay host mínimo" : cal.buscarIp(1).toString();
            hostMax = direccion.getMascara() > 30 ? "No hay host máximo" : cal.buscarIp(cantHost).toString();
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
        jGuardar = new javax.swing.JButton();
        jAnterior = new javax.swing.JButton();
        jSiguiente = new javax.swing.JButton();
        jClase = new javax.swing.JLabel();

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardar.png"))); // NOI18N
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anterior.png"))); // NOI18N
        jAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnteriorActionPerformed(evt);
            }
        });

        jSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siguiente.png"))); // NOI18N
        jSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSiguienteActionPerformed(evt);
            }
        });

        jClase.setText("Clase de la dirección: " + direccion.getClase());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jClase)
                                    .addComponent(jLabelDirRed)
                                    .addComponent(jLabelDirBrod)
                                    .addComponent(jLabelHostMin)
                                    .addComponent(jLabelCantHost))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSiguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelHostMax)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPosicion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jClase)
                        .addGap(18, 18, 18)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jButtonVolver)
                        .addGap(17, 17, 17))))
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
        int posicion;
        CalculosIP cal = new CalculosIP(direccion);
        
        try {
            posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posición"));
            
            if (posicion < 1 || posicion > cal.cantidadDeHost()){
                JOptionPane.showMessageDialog(null, "Posición inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "La ip de la posición " + posicion + " es " + cal.buscarIp(posicion), "Busqueda", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Pon un número", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        JFileChooser fc = new JFileChooser();
        BufferedWriter bw;
        
        fc.setDialogTitle("Guardar datos");
        fc.showSaveDialog(jGuardar);
        
        try {
            bw = new BufferedWriter(new FileWriter(fc.getSelectedFile()));
            
            bw.write(direccion.info());
            bw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la información", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "No se seleccionó un archivo para guardar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAnteriorActionPerformed

    private void jSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAnterior;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jClase;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabelCantHost;
    private javax.swing.JLabel jLabelDirBrod;
    private javax.swing.JLabel jLabelDirRed;
    private javax.swing.JLabel jLabelHostMax;
    private javax.swing.JLabel jLabelHostMin;
    private javax.swing.JLabel jLabelPosicion;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JButton jSiguiente;
    // End of variables declaration//GEN-END:variables
}
