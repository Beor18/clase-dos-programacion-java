/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

//import javax.swing.DefaultComboBoxModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author vaio
 */
public class PrimeraPantalla extends javax.swing.JFrame {

    /**
     * Creates new form PrimeraPantalla
     */
    public PrimeraPantalla() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        radioTipoVasito = new javax.swing.JRadioButton();
        radioTipoMedio = new javax.swing.JRadioButton();
        radioTipoCucurucho = new javax.swing.JRadioButton();
        radioTipoKilo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        radioTipoCuarto = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        comboCantidadDeGustos = new javax.swing.JComboBox<>();
        checkBaniadoChocolate = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaGustosNecesarios = new javax.swing.JList<>();
        botonAgregar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaGustosComprar = new javax.swing.JList<>();
        botonQuitar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        confirmarCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Armá tu pedido!"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Helado"));

        buttonGroup1.add(radioTipoVasito);
        radioTipoVasito.setText("Vasito");
        radioTipoVasito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTipoVasitoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioTipoMedio);
        radioTipoMedio.setText("1/2 Kilo");
        radioTipoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTipoMedioActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioTipoCucurucho);
        radioTipoCucurucho.setText("Cucurucho");
        radioTipoCucurucho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTipoCucuruchoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioTipoKilo);
        radioTipoKilo.setText("1 Kilo");
        radioTipoKilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTipoKiloActionPerformed(evt);
            }
        });

        jLabel4.setText("Pote:");

        buttonGroup1.add(radioTipoCuarto);
        radioTipoCuarto.setText("1/4 Kilo");
        radioTipoCuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTipoCuartoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioTipoVasito)
                    .addComponent(radioTipoCucurucho)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioTipoMedio)
                            .addComponent(radioTipoCuarto)
                            .addComponent(radioTipoKilo))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioTipoVasito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioTipoCucurucho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioTipoCuarto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioTipoMedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioTipoKilo))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad de Gustos"));

        comboCantidadDeGustos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones un gusto" }));
        comboCantidadDeGustos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCantidadDeGustosActionPerformed(evt);
            }
        });

        checkBaniadoChocolate.setText("Bañado en Chocolate");
        checkBaniadoChocolate.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCantidadDeGustos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(checkBaniadoChocolate)
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboCantidadDeGustos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(checkBaniadoChocolate)
                .addGap(0, 57, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setToolTipText("");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Gustos Disponibles"));

        listaGustosNecesarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listaGustosNecesarios);

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(botonAgregar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAgregar)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Gustos Seleccionados")));

        listaGustosComprar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaGustosComprar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                listaGustosComprarAncestorRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(listaGustosComprar);

        botonQuitar.setText("Quitar");
        botonQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(botonQuitar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonQuitar)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        jLabel3.setText("SELECCIÓN DE GUSTOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        jLabel5.setText("Total a Pagar: ");

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        confirmarCompra.setText("Confirmar!");
        confirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addGap(18, 18, 18)
                .addComponent(confirmarCompra)
                .addGap(38, 38, 38))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelar)
                        .addComponent(confirmarCompra))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, Short.MAX_VALUE))
                .addGap(18, 26, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
          String ingredienteNecesario = listaGustosNecesarios.getSelectedValue();
        
        if (ingredienteNecesario == null){
            JOptionPane.showMessageDialog(this, "Primero seleccione un ingrediente para agregar", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            DefaultListModel<String>  modelNecesarios = (DefaultListModel<String>)listaGustosNecesarios.getModel();
            DefaultListModel<String>  modelComprar = (DefaultListModel<String>)listaGustosComprar.getModel();
            
            modelComprar.addElement(ingredienteNecesario);
            modelNecesarios.removeElement(ingredienteNecesario);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void radioTipoVasitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTipoVasitoActionPerformed
        disableBaniado();
        fillComboCantidadGustos(1);
    }//GEN-LAST:event_radioTipoVasitoActionPerformed

    private void radioTipoCucuruchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTipoCucuruchoActionPerformed
        enabledBaniado();
        fillComboCantidadGustos(1);
    }//GEN-LAST:event_radioTipoCucuruchoActionPerformed

    private void radioTipoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTipoMedioActionPerformed
        disableBaniado();
        fillComboCantidadGustos(2);
    }//GEN-LAST:event_radioTipoMedioActionPerformed

    private void radioTipoKiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTipoKiloActionPerformed
        disableBaniado();
        fillComboCantidadGustos(3);
    }//GEN-LAST:event_radioTipoKiloActionPerformed

    private void botonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarActionPerformed
        String ingredienteNecesario = listaGustosComprar.getSelectedValue();

        if (ingredienteNecesario == null){
                JOptionPane.showMessageDialog(this, "Primero seleccione un gusto para Quitar", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            DefaultListModel<String>  modelComprar = (DefaultListModel<String>)listaGustosComprar.getModel();
            DefaultListModel<String>  modelNecesarios = (DefaultListModel<String>)listaGustosNecesarios.getModel();

            modelNecesarios.addElement(ingredienteNecesario);
            modelComprar.removeElement(ingredienteNecesario);
        }
     
    }//GEN-LAST:event_botonQuitarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        
    }//GEN-LAST:event_cancelarActionPerformed

    private void comboCantidadDeGustosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCantidadDeGustosActionPerformed
             
        DefaultListModel<String> listModelNecesarios = new DefaultListModel<>();
        listaGustosNecesarios.setModel(listModelNecesarios);
        
        
        listModelNecesarios.addElement("Chocolate");
        listModelNecesarios.addElement("Frutilla");
        listModelNecesarios.addElement("Coco");
        
        DefaultListModel<String> listModelComprar = new DefaultListModel<>();
        listaGustosComprar.setModel(listModelComprar);
         
    }//GEN-LAST:event_comboCantidadDeGustosActionPerformed

    private void radioTipoCuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTipoCuartoActionPerformed

       fillComboCantidadGustos(1);
       
    }//GEN-LAST:event_radioTipoCuartoActionPerformed

    private void confirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarCompraActionPerformed
        DefaultListModel<String>  modelComprar = (DefaultListModel<String>)listaGustosComprar.getModel();
        DefaultListModel<String>  modelNecesarios = (DefaultListModel<String>)listaGustosNecesarios.getModel();
        
        if (modelComprar.isEmpty()){
            JOptionPane.showMessageDialog(this, "Disculpe pero debe seleccionar al menos un ingrediente a comprar para realizar el pedido", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (modelNecesarios.isEmpty()){
            JOptionPane.showMessageDialog(this, "Le enviaremos todos los ingredientes de la receta: " + modelComprar.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {        
            JOptionPane.showMessageDialog(this, "Usted compró helado con los gustos: " + modelComprar.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
        }    
    }//GEN-LAST:event_confirmarCompraActionPerformed

    private void listaGustosComprarAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listaGustosComprarAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_listaGustosComprarAncestorRemoved

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonQuitar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelar;
    private javax.swing.JCheckBox checkBaniadoChocolate;
    private javax.swing.JComboBox<String> comboCantidadDeGustos;
    private javax.swing.JButton confirmarCompra;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaGustosComprar;
    private javax.swing.JList<String> listaGustosNecesarios;
    private javax.swing.JRadioButton radioTipoCuarto;
    private javax.swing.JRadioButton radioTipoCucurucho;
    private javax.swing.JRadioButton radioTipoKilo;
    private javax.swing.JRadioButton radioTipoMedio;
    private javax.swing.JRadioButton radioTipoVasito;
    // End of variables declaration//GEN-END:variables

     /*private void initComboBox() {

        DefaultComboBoxModel modelo = new DefaultComboBoxModel<>();
        modelo.addElement("Cantidad de gustos sin definir");
        
        comboCantidadDeGustos.setModel(modelo);
    }*/

    private void disableBaniado() {
        checkBaniadoChocolate.setEnabled(false);
        checkBaniadoChocolate.setSelected(false);
    }

    private void enabledBaniado() {
        checkBaniadoChocolate.setEnabled(true);
    }

    private void fillComboCantidadGustos(int cantidad) {
        comboCantidadDeGustos.removeAllItems();
        for (int i = 0; i <= cantidad; i++) {
            comboCantidadDeGustos.addItem(cantidad + " gusto");
            
        }
       
    }
        
}
