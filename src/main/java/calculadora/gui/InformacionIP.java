package calculadora.gui;

import calculadora.objects.CalculosIP;
import calculadora.objects.IP;
import java.awt.Color;
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

        jPanel1 = new javax.swing.JPanel();
        jButtonVolver = new javax.swing.JButton();
        jHostMax = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jPosicion = new javax.swing.JTextField();
        jGuardar = new javax.swing.JButton();
        jAnterior = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jSiguiente = new javax.swing.JButton();
        jLabelDirRed = new javax.swing.JLabel();
        jLabelClase = new javax.swing.JLabel();
        jLabelDirBrod = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabelCantHost = new javax.swing.JLabel();
        jDirRed = new javax.swing.JTextField();
        jLabelHostMin = new javax.swing.JLabel();
        jDirBrod = new javax.swing.JTextField();
        jLabelHostMax = new javax.swing.JLabel();
        jCantHost = new javax.swing.JTextField();
        jLabelPosicion = new javax.swing.JLabel();
        jHostMin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de subneting");
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButtonVolver.setBackground(new java.awt.Color(51, 51, 51));
        jButtonVolver.setForeground(new java.awt.Color(204, 204, 204));
        jButtonVolver.setText("Volver");
        jButtonVolver.setBorderPainted(false);
        jButtonVolver.setFocusPainted(false);
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jHostMax.setEditable(false);
        jHostMax.setBackground(new java.awt.Color(153, 153, 153));
        jHostMax.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jHostMax.setForeground(new java.awt.Color(69, 69, 69));
        jHostMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jHostMax.setText(hostMax);
        jHostMax.setBorder(null);

        jBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        jBuscar.setBorderPainted(false);
        jBuscar.setFocusPainted(false);
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jPosicion.setEditable(false);
        jPosicion.setBackground(new java.awt.Color(153, 153, 153));
        jPosicion.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPosicion.setForeground(new java.awt.Color(69, 69, 69));
        jPosicion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPosicion.setText(pos);
        jPosicion.setBorder(null);

        jGuardar.setBackground(new java.awt.Color(51, 51, 51));
        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardar.png"))); // NOI18N
        jGuardar.setBorderPainted(false);
        jGuardar.setFocusPainted(false);
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jAnterior.setBackground(new java.awt.Color(51, 51, 51));
        jAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anterior.png"))); // NOI18N
        jAnterior.setBorderPainted(false);
        jAnterior.setFocusPainted(false);
        jAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnteriorActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Lato Heavy", 0, 22)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTitulo.setText("Información de la IP: " + this.direccion);

        jSiguiente.setBackground(new java.awt.Color(51, 51, 51));
        jSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siguiente.png"))); // NOI18N
        jSiguiente.setBorderPainted(false);
        jSiguiente.setFocusPainted(false);
        jSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSiguienteActionPerformed(evt);
            }
        });

        jLabelDirRed.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelDirRed.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDirRed.setText("Dirección de red:");

        jLabelClase.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelClase.setForeground(new java.awt.Color(51, 51, 51));
        jLabelClase.setText("Clase de la dirección:");

        jLabelDirBrod.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelDirBrod.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDirBrod.setText("Dirección de broadcast:");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(69, 69, 69));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(direccion.getClase() + "");
        jTextField1.setBorder(null);

        jLabelCantHost.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelCantHost.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCantHost.setText("Cantidad de host válidos:");

        jDirRed.setEditable(false);
        jDirRed.setBackground(new java.awt.Color(153, 153, 153));
        jDirRed.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jDirRed.setForeground(new java.awt.Color(69, 69, 69));
        jDirRed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDirRed.setText(dirRed);
        jDirRed.setBorder(null);

        jLabelHostMin.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelHostMin.setForeground(new java.awt.Color(51, 51, 51));
        jLabelHostMin.setText("Host mínimo:");

        jDirBrod.setEditable(false);
        jDirBrod.setBackground(new java.awt.Color(153, 153, 153));
        jDirBrod.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jDirBrod.setForeground(new java.awt.Color(69, 69, 69));
        jDirBrod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDirBrod.setText(dirBro);
        jDirBrod.setBorder(null);

        jLabelHostMax.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelHostMax.setForeground(new java.awt.Color(51, 51, 51));
        jLabelHostMax.setText("Host máximo:");

        jCantHost.setEditable(false);
        jCantHost.setBackground(new java.awt.Color(153, 153, 153));
        jCantHost.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jCantHost.setForeground(new java.awt.Color(69, 69, 69));
        jCantHost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jCantHost.setText(cantHost + "");
        jCantHost.setBorder(null);

        jLabelPosicion.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelPosicion.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPosicion.setText("Posición de la IP:");

        jHostMin.setEditable(false);
        jHostMin.setBackground(new java.awt.Color(153, 153, 153));
        jHostMin.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jHostMin.setForeground(new java.awt.Color(69, 69, 69));
        jHostMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jHostMin.setText(hostMin);
        jHostMin.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDirBrod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDirBrod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelHostMin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jHostMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelClase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDirRed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDirRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCantHost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCantHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelHostMax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jHostMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPosicion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSiguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClase)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDirRed)
                            .addComponent(jDirRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDirBrod)
                            .addComponent(jDirBrod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCantHost)
                            .addComponent(jCantHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHostMin)
                            .addComponent(jHostMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHostMax)
                            .addComponent(jHostMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPosicion)
                            .addComponent(jPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButtonVolver)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPosicion;
    private javax.swing.JButton jSiguiente;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
