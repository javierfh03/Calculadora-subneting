package calculadora.gui;

import calculadora.objects.CalculosIP;
import calculadora.objects.IP;
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
        espablecerIP(direccion);
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
        jBuscar = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jAnterior = new javax.swing.JButton();
        jSiguiente = new javax.swing.JButton();
        jLabelClase = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jDirRed = new javax.swing.JTextField();
        jDirBrod = new javax.swing.JTextField();
        jCantHost = new javax.swing.JTextField();
        jHostMin = new javax.swing.JTextField();
        jHostMax = new javax.swing.JTextField();
        jPosicion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de subneting");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Lato Heavy", 0, 22)); // NOI18N
        jLabelTitulo.setText("Información de la IP: " + this.direccion);

        jLabelDirRed.setText("Dirección de red:");

        jLabelDirBrod.setText("Dirección de broadcast:");

        jLabelCantHost.setText("Cantidad de host válidos:");

        jLabelHostMin.setText("Host mínimo:");

        jLabelHostMax.setText("Host máximo:");

        jLabelPosicion.setText("Posición de la IP:");

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
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

        jLabelClase.setText("Clase de la dirección:");

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(direccion.getClase() + "");

        jDirRed.setEditable(false);
        jDirRed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDirRed.setText(dirRed);

        jDirBrod.setEditable(false);
        jDirBrod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDirBrod.setText(dirBro);

        jCantHost.setEditable(false);
        jCantHost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jCantHost.setText(cantHost + "");

        jHostMin.setEditable(false);
        jHostMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jHostMin.setText(hostMin);

        jHostMax.setEditable(false);
        jHostMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jHostMax.setText(hostMax);

        jPosicion.setEditable(false);
        jPosicion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPosicion.setText(pos);

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
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDirBrod)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDirBrod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelHostMin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jHostMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelClase)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDirRed)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDirRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelCantHost)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCantHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSiguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelHostMax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jHostMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPosicion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClase)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDirRed)
                            .addComponent(jDirRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDirBrod)
                            .addComponent(jDirBrod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCantHost)
                            .addComponent(jCantHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHostMin)
                            .addComponent(jHostMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHostMax)
                            .addComponent(jHostMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPosicion)
                            .addComponent(jPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
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

    /**
     * Este método busca en una subred una dirección especificandole en número de host.
     * 
     * @param evt El ActionEvent.
     */
    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        int posicion;
        CalculosIP cal = new CalculosIP(direccion);
        
        try {
            posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posición"));
            
            espablecerIP(cal.buscarIp(posicion));
            actualizarDatos();
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Pon un número", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Posición inválida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    /**
     * Este método guarda en un archivo la información de la dirección IP.
     * 
     * @param evt El ActionEvent.
     */
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
            JOptionPane.showMessageDialog(null, "No se seleccionó un archivo para guardar", "Advertencia", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    /**
     * Este método muestra la anterior dirección IP de la que se muestra.
     * 
     * @param evt El ActionEvent.
     */
    private void jAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnteriorActionPerformed
        CalculosIP cal = new CalculosIP(direccion);
        
        try {
            espablecerIP(cal.buscarIp(direccion.getPosicionIp() - 1));
            actualizarDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede obtener la anterior IP", "Advertencia", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jAnteriorActionPerformed

    /**
     * Este método muestra la siguiente dirección IP de la que se muestra.
     * 
     * @param evt El ActionEvent.
     */
    private void jSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSiguienteActionPerformed
        CalculosIP cal = new CalculosIP(direccion);

        try {
            espablecerIP(cal.buscarIp(direccion.getPosicionIp() + 1));
            actualizarDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede obtener la siguiente IP", "Advertencia", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jSiguienteActionPerformed

    /**
     * Este método establece los atributos de la ventana en base a una dirección IP.
     * 
     * @param direccion La dirección IP que se quiere establecer.
     */
    private void espablecerIP(IP direccion){
        this.direccion = direccion;
        CalculosIP cal = new CalculosIP(direccion);
        
        try {
            cantHost = cal.cantidadDeHost();
            dirRed = direccion.sacarDireccionDeSubred().toString();
            dirBro = direccion.sacarDireccionDeBroadcast().toString();
            hostMin = cal.buscarIp(1).toString();
            hostMax = cal.buscarIp(cantHost).toString();
            pos = direccion.getPosicionIp() + "";
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la consulta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Este método actualiza los datos de la ventana.
     */
    private void actualizarDatos(){
        jLabelTitulo.setText("Información de la IP: " + this.direccion);
        jDirRed.setText(dirRed);
        jDirBrod.setText(dirBro);
        jCantHost.setText(cantHost + "");
        jHostMin.setText(hostMin);
        jHostMax.setText(hostMax);
        jPosicion.setText(pos);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAnterior;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JTextField jCantHost;
    private javax.swing.JTextField jDirBrod;
    private javax.swing.JTextField jDirRed;
    private javax.swing.JButton jGuardar;
    private javax.swing.JTextField jHostMax;
    private javax.swing.JTextField jHostMin;
    private javax.swing.JLabel jLabelCantHost;
    private javax.swing.JLabel jLabelClase;
    private javax.swing.JLabel jLabelDirBrod;
    private javax.swing.JLabel jLabelDirRed;
    private javax.swing.JLabel jLabelHostMax;
    private javax.swing.JLabel jLabelHostMin;
    private javax.swing.JLabel jLabelPosicion;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jPosicion;
    private javax.swing.JButton jSiguiente;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
