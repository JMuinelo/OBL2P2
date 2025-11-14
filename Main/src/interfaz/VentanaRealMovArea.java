package interfaz;

import dominio.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;

public class VentanaRealMovArea extends javax.swing.JFrame implements Observer{

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaRealMovArea.class.getName());

    /**
     * Creates new form VentanaRealMovArea
     */
    public VentanaRealMovArea(Sistema sistema) {
        modelo = sistema;
        initComponents();
        listaArea.setListData(modelo.getListaAreas().toArray());

        listaArea.setSelectionModel(new DefaultListSelectionModel() {
            @Override
            public void clearSelection() {
            }
        });

        //con este metodo hacemos que no se deseleccione el item de la lista al clickear en otro lado
        listaAreaDestino.setSelectionModel(new DefaultListSelectionModel() {
            @Override
            public void clearSelection() {

            }
        });
        listaEmpleados.setSelectionModel(new DefaultListSelectionModel() {
            @Override
            public void clearSelection() {

            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jSlider1 = new javax.swing.JSlider();
        jSpinner2 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaArea = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEmpleados = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaAreaDestino = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        spinnerMes = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar un Movimiento");

        listaArea.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaArea.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAreaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaArea);

        listaEmpleados.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaEmpleados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaEmpleadosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaEmpleados);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Realizar un Movimiento");

        jLabel2.setText("Seleccionar Área ");

        jLabel3.setText("Seleccionar Empleado");

        listaAreaDestino.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listaAreaDestino);

        jLabel4.setText("Asignar al  Área ");

        boton.setText("Mover");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        spinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabel5.setText("Mes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(spinnerMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel3))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(spinnerMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        setSize(new java.awt.Dimension(526, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaAreaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAreaValueChanged
        Area areaSelec = (Area) listaArea.getSelectedValue();
        ArrayList<Area> listaAux = new ArrayList<>();
        for (Area area : modelo.getListaAreas()) {
            if (!(area.getNombre().equals(areaSelec.getNombre()))) {
                listaAux.add(area);
            }
        }
        listaAreaDestino.setListData(listaAux.toArray());
        listaEmpleados.setListData(areaSelec.getListaEmpleado().toArray());
    }//GEN-LAST:event_listaAreaValueChanged

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed

        int mes = (int) spinnerMes.getValue();
        Empleado empleado = (Empleado) listaEmpleados.getSelectedValue();
        Area areaAct = (Area) listaArea.getSelectedValue();
        Area areaDestino = (Area) listaAreaDestino.getSelectedValue();
         //13 para tener en cuenta el salario del mes actual

        if (empleado == null || areaAct == null || areaDestino == null) {
            JOptionPane.showMessageDialog(this, "Seleccione todos los campos", "Alerta", 2);
        } else {

            int diferencia = (13 - mes) * empleado.getSalario();
            if (diferencia <= areaDestino.getPresupuestoRestante()) {
                areaDestino.setPresupuestoRestante(areaDestino.getPresupuestoRestante() - diferencia);
                areaAct.setPresupuestoRestante(areaAct.getPresupuestoRestante() + diferencia);
                areaAct.getListaEmpleado().remove(empleado);
                areaDestino.getListaEmpleado().add(empleado);
                empleado.setArea(areaDestino);
                JOptionPane.showMessageDialog(this, "Movimiento realizado con éxito", "Aviso", 1);
                Movimiento movimiento = new Movimiento(mes,areaAct.getNombre(),areaDestino.getNombre(),empleado.getNombre());
                modelo.getListaMovimientos().add(movimiento);

                Area areaSelec = (Area) listaArea.getSelectedValue();
                ArrayList<Area> listaAux = new ArrayList<>();
                ////
                for (Area area : modelo.getListaAreas()) {
                    if (!(area.getNombre().equals(areaSelec.getNombre()))) {
                        listaAux.add(area);
                    }
                }
////
                listaArea.setListData(modelo.getListaAreas().toArray());
                listaAreaDestino.setListData(listaAux.toArray());
                listaEmpleados.setListData(areaSelec.getListaEmpleado().toArray());

                listaArea.clearSelection();
                //listaEmpleados.clearSelection();

            } else {
                JOptionPane.showMessageDialog(this, "El Área " + areaDestino.getNombre() + " no tiene presupuesto suficiente ", "Alerta", 2);
            }
        }


    }//GEN-LAST:event_botonActionPerformed

    private void listaEmpleadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaEmpleadosValueChanged
    }//GEN-LAST:event_listaEmpleadosValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JList listaArea;
    private javax.swing.JList listaAreaDestino;
    private javax.swing.JList listaEmpleados;
    private javax.swing.JSpinner spinnerMes;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;

    @Override
    public void update(Observable o, Object arg) {
        Area areaSelec = (Area) listaArea.getSelectedValue();
        listaEmpleados.setListData(areaSelec.getListaEmpleado().toArray());
        listaArea.setListData(modelo.getListaAreas().toArray());
        
        listaArea.clearSelection();
        listaArea.setSelectedValue(areaSelec,true);
        
        
    }
}
