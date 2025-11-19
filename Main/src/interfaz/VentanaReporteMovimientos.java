package interfaz;
import dominio.*;
import grabarLeer.ArchivoGrabacion;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class VentanaReporteMovimientos extends javax.swing.JFrame implements Observer{

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaReporteMovimientos.class.getName());

    public VentanaReporteMovimientos(Sistema sistema) {
        modelo = sistema;
        initComponents();
        modelo.addObserver(this);
        cargarTabla(modelo.getListaMovimientos());
        cargarCombos();
    }

    public void cargarCombos() {
        comboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(modelo.getListaAreas().toArray()));
        comboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(modelo.getListaAreas().toArray()));
        comboEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(modelo.getListaEmpleados().toArray()));

    }

    public void cargarTabla(ArrayList<Movimiento> lista) {
        Collections.sort(lista);
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        modeloTabla.setRowCount(0);

        for (Movimiento mov : lista) {
            modeloTabla.addRow(new Object[]{
                mov.getMes(),
                mov.getAreaOrigen(),
                mov.getAreaDestino(),
                mov.getNombreEmpleado()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        spinnerMes = new javax.swing.JSpinner();
        comboOrigen = new javax.swing.JComboBox();
        comboDestino = new javax.swing.JComboBox();
        comboEmpleado = new javax.swing.JComboBox();
        filtrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        radioMes = new javax.swing.JRadioButton();
        radioOrigen = new javax.swing.JRadioButton();
        radioDestino = new javax.swing.JRadioButton();
        radioEmpleado = new javax.swing.JRadioButton();
        exportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de Movimientos");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mes", "Área Origen", "Área Destino", "Empleado"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Filtrar Por:");

        spinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        comboOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        filtrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        filtrar.setText("Filtrar");
        filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText(" Movimientos");

        radioMes.setText("Mes");

        radioOrigen.setText("Área origen");
        radioOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOrigenActionPerformed(evt);
            }
        });

        radioDestino.setText("Área Destino");

        radioEmpleado.setText("Empleado");

        exportar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportar.setText("Exportar");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioOrigen)
                                    .addComponent(radioMes)
                                    .addComponent(radioDestino)
                                    .addComponent(radioEmpleado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spinnerMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(comboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel6)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioMes)
                                .addGap(18, 18, 18)
                                .addComponent(radioOrigen)
                                .addGap(22, 22, 22)
                                .addComponent(radioDestino)
                                .addGap(18, 18, 18)
                                .addComponent(radioEmpleado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spinnerMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );

        setSize(new java.awt.Dimension(733, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarActionPerformed
        cargarDatosTabla();
    }//GEN-LAST:event_filtrarActionPerformed
    
    public void cargarDatosTabla(){
        int mes = 0;
        String aOrigen = "";
        String aDestino = "";
        String empleado = "";

        ArrayList<Movimiento> listaAux = new ArrayList<Movimiento>();
        for (Movimiento mov : modelo.getListaMovimientos()) {
            boolean cumpleTodo = true;

            if (radioMes.isSelected()) {
                mes = (int) spinnerMes.getValue();
                if (!(mov.getMes() == mes)) {
                    cumpleTodo = false;
                }
            }
            if (radioOrigen.isSelected()) {
                aOrigen = "" + ((Area) comboOrigen.getSelectedItem()).getNombre();
                if (!(mov.getAreaOrigen().equals(aOrigen))) {
                    cumpleTodo = false;
                }
            }
            if (radioDestino.isSelected()) {
                aDestino = "" + ((Area) comboDestino.getSelectedItem()).getNombre();
                if (!(mov.getAreaDestino().equals(aDestino))) {
                    cumpleTodo = false;
                }
            }
            if (radioEmpleado.isSelected()) {
                empleado = "" + ((Empleado) comboEmpleado.getSelectedItem()).getNombre();
                if (!(mov.getNombreEmpleado().equals(empleado))) {
                    cumpleTodo = false;
                }
            }

            if (cumpleTodo) {
                listaAux.add(mov);
            }
        }
        cargarTabla(listaAux);
    }
    
    private void radioOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOrigenActionPerformed

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        JFileChooser seleccionarArchivo = new JFileChooser();
        seleccionarArchivo.showOpenDialog(seleccionarArchivo);
        File archivo =seleccionarArchivo.getSelectedFile();
        exportarCSV(modelo,archivo);
    }//GEN-LAST:event_exportarActionPerformed

    public void exportarCSV(Sistema modelo, File archivo/*ya con .csv*/) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();

        ArchivoGrabacion csv = new ArchivoGrabacion(archivo.getAbsolutePath()+".csv");

        String encabezado = "";
        for (int i = 0; i < modeloTabla.getColumnCount(); i++) {
            encabezado += modeloTabla.getColumnName(i);
            if (!(i == modeloTabla.getColumnCount() - 1)) {
                encabezado += ",";
            }
        }
        csv.grabarLinea(encabezado);

        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String linea = "";
            for (int j = 0; j < modeloTabla.getColumnCount(); j++) {
                linea += modeloTabla.getValueAt(i,j);
                if (!(j == modeloTabla.getColumnCount() - 1)) {
                    linea += ",";
                }
            }
            csv.grabarLinea(linea);
        }
        csv.cerrar();
    }
    
    @Override
    public void update(Observable o, Object arg){
        cargarCombos();
        cargarDatosTabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboDestino;
    private javax.swing.JComboBox comboEmpleado;
    private javax.swing.JComboBox comboOrigen;
    private javax.swing.JButton exportar;
    private javax.swing.JButton filtrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioDestino;
    private javax.swing.JRadioButton radioEmpleado;
    private javax.swing.JRadioButton radioMes;
    private javax.swing.JRadioButton radioOrigen;
    private javax.swing.JSpinner spinnerMes;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
