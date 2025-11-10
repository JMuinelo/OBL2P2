package interfaz;
import dominio.*;
import java.util.*;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;

public class VentanaModificacionManager extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaModificacionManager.class.getName());

    
    public VentanaModificacionManager(Sistema sistema) {
        modelo = sistema;
        initComponents();
        listaManagers.setListData(modelo.getListaManagers().toArray());
        listaManagers.setSelectionModel(new DefaultListSelectionModel(){
            @Override
            public void clearSelection(){
                
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaManagers = new javax.swing.JList();
        labelCedula = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelAntiguedad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Modificar un Manager");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Teléfono");

        jLabel5.setText("Antigüedad:");

        boton.setText("Modificar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        listaManagers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaManagers.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                listaManagersPropertyChange(evt);
            }
        });
        listaManagers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaManagersValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaManagers);

        jLabel11.setText("Cédula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(labelCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(13, 13, 13)
                                        .addComponent(campoTelefono)))
                                .addGap(0, 5, Short.MAX_VALUE)))
                        .addContainerGap(124, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(labelAntiguedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(labelCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(labelAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(581, 336));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        String nuevaDesc = campoTelefono.getText();
        try{
            Manager manager = (Manager)listaManagers.getSelectedValue();
            String celular = (String) campoTelefono.getText();
            if(modelo.esUnNumero(celular)){
                manager.setCelular(celular);
                JOptionPane.showMessageDialog(this, "Se ha modificado correctamente el manager: "+manager.getNombre(), "Aviso", 1);
            }
            else{
                JOptionPane.showMessageDialog(this,"Error: El campo telefónico sólo puede contener números","Error",2);
            }
        }catch( NullPointerException e){
            JOptionPane.showMessageDialog(this,"Error: Seleccione un Manager para cambiar su teléfono","Error",2);
        }

    }//GEN-LAST:event_botonActionPerformed

    private void listaManagersPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_listaManagersPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_listaManagersPropertyChange

    private void listaManagersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaManagersValueChanged
        Manager manager = (Manager)listaManagers.getSelectedValue();
        if(manager != null){
            labelNombre.setText(manager.getNombre());
            labelAntiguedad.setText(manager.getAntiguedad()+"");
            labelCedula.setText(manager.getCedula());
            campoTelefono.setText(manager.getCelular());
            listaManagers.setListData(modelo.getListaManagers().toArray());
        }
    }//GEN-LAST:event_listaManagersValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAntiguedad;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JList listaManagers;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
