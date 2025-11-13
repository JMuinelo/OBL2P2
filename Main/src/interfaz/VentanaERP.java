package interfaz;
import dominio.*;

public class VentanaERP extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaERP.class.getName());

    public VentanaERP(Sistema sistema) {
        modelo = sistema;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuAreas = new javax.swing.JMenu();
        areaAlta = new javax.swing.JMenuItem();
        areaBaja = new javax.swing.JMenuItem();
        areaRealizarMov = new javax.swing.JMenuItem();
        areaModifcacion = new javax.swing.JMenuItem();
        menuManagers = new javax.swing.JMenu();
        managerAlta = new javax.swing.JMenuItem();
        managerBaja = new javax.swing.JMenuItem();
        managerModificacion = new javax.swing.JMenuItem();
        menuEmpleados = new javax.swing.JMenu();
        empleadoAlta = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        reporteInteligente = new javax.swing.JMenuItem();
        reporteEstadoAreas = new javax.swing.JMenuItem();
        reporteMovimientos = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ERP Empresarial");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ERP4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuAreas.setText("Áreas");

        areaAlta.setText("Alta");
        areaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaAltaActionPerformed(evt);
            }
        });
        menuAreas.add(areaAlta);

        areaBaja.setText("Baja");
        areaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaBajaActionPerformed(evt);
            }
        });
        menuAreas.add(areaBaja);

        areaRealizarMov.setText("Realizar Movimiento");
        areaRealizarMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaRealizarMovActionPerformed(evt);
            }
        });
        menuAreas.add(areaRealizarMov);

        areaModifcacion.setText("Modificación");
        areaModifcacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaModifcacionActionPerformed(evt);
            }
        });
        menuAreas.add(areaModifcacion);

        jMenuBar2.add(menuAreas);

        menuManagers.setText("Managers");

        managerAlta.setText("Alta");
        managerAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerAltaActionPerformed(evt);
            }
        });
        menuManagers.add(managerAlta);

        managerBaja.setText("Baja");
        managerBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerBajaActionPerformed(evt);
            }
        });
        menuManagers.add(managerBaja);

        managerModificacion.setText("Modificación");
        managerModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerModificacionActionPerformed(evt);
            }
        });
        menuManagers.add(managerModificacion);

        jMenuBar2.add(menuManagers);

        menuEmpleados.setText("Empleados");

        empleadoAlta.setText("Alta");
        empleadoAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoAltaActionPerformed(evt);
            }
        });
        menuEmpleados.add(empleadoAlta);

        jMenuBar2.add(menuEmpleados);

        menuReportes.setText("Reportes");

        reporteInteligente.setText("Reporte Inteligente");
        reporteInteligente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteInteligenteActionPerformed(evt);
            }
        });
        menuReportes.add(reporteInteligente);

        reporteEstadoAreas.setText("Reporte de Estado de Áreas");
        reporteEstadoAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteEstadoAreasActionPerformed(evt);
            }
        });
        menuReportes.add(reporteEstadoAreas);

        reporteMovimientos.setText("Reporte de Movimientos");
        menuReportes.add(reporteMovimientos);

        jMenuBar2.add(menuReportes);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(414, 335));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void areaRealizarMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaRealizarMovActionPerformed
        VentanaRealMovArea vAlta = new VentanaRealMovArea(modelo);
        vAlta.setVisible(true);
    }//GEN-LAST:event_areaRealizarMovActionPerformed

    private void empleadoAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoAltaActionPerformed
        VentanaAltaEmpleado vent = new VentanaAltaEmpleado(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_empleadoAltaActionPerformed

    private void reporteInteligenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteInteligenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reporteInteligenteActionPerformed

    private void areaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaAltaActionPerformed
        VentanaAltaArea vAlta = new VentanaAltaArea(modelo);
        vAlta.setVisible(true);
    }//GEN-LAST:event_areaAltaActionPerformed

    private void areaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaBajaActionPerformed
        VentanaBajaArea vBajaArea = new VentanaBajaArea(modelo);
        vBajaArea.setVisible(true);
    }//GEN-LAST:event_areaBajaActionPerformed

    private void areaModifcacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaModifcacionActionPerformed
        VentanaModificacionArea vAltaArea = new VentanaModificacionArea(modelo);
        vAltaArea.setVisible(true);
    }//GEN-LAST:event_areaModifcacionActionPerformed

    private void managerAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerAltaActionPerformed
        VentanaAltaManager vAltaManager = new VentanaAltaManager(modelo);
        vAltaManager.setVisible(true);
    }//GEN-LAST:event_managerAltaActionPerformed

    private void managerBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerBajaActionPerformed
        VentanaBajaManager vBajaManager = new VentanaBajaManager(modelo);
        vBajaManager.setVisible(true);
    }//GEN-LAST:event_managerBajaActionPerformed

    private void managerModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerModificacionActionPerformed
        VentanaModificacionManager vModificacionManager = new VentanaModificacionManager(modelo);
        vModificacionManager.setVisible(true);
    }//GEN-LAST:event_managerModificacionActionPerformed

    private void reporteEstadoAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteEstadoAreasActionPerformed
        VentanaReporteEstado vent = new VentanaReporteEstado(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_reporteEstadoAreasActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem areaAlta;
    private javax.swing.JMenuItem areaBaja;
    private javax.swing.JMenuItem areaModifcacion;
    private javax.swing.JMenuItem areaRealizarMov;
    private javax.swing.JMenuItem empleadoAlta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem managerAlta;
    private javax.swing.JMenuItem managerBaja;
    private javax.swing.JMenuItem managerModificacion;
    private javax.swing.JMenu menuAreas;
    private javax.swing.JMenu menuEmpleados;
    private javax.swing.JMenu menuManagers;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenuItem reporteEstadoAreas;
    private javax.swing.JMenuItem reporteInteligente;
    private javax.swing.JMenuItem reporteMovimientos;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
