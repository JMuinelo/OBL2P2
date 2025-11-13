package interfaz;

import dominio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;

public class VentanaReporteEstado extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaReporteEstado.class.getName());

    public VentanaReporteEstado(Sistema sistema) {
        modelo = sistema;
        initComponents();
        this.cargarLista(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelArea = new javax.swing.JLabel();
        scrollPaneArea = new javax.swing.JScrollPane();
        panelArea = new javax.swing.JPanel();
        ScrollPaneBotones = new javax.swing.JScrollPane();
        panelBotones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelArea.setLayout(new java.awt.GridLayout(0, 1));
        scrollPaneArea.setViewportView(panelArea);

        panelBotones.setLayout(new java.awt.GridLayout());
        ScrollPaneBotones.setViewportView(panelBotones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(scrollPaneArea, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 263, Short.MAX_VALUE)
                        .addComponent(labelArea, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ScrollPaneBotones)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(labelArea, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPaneBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(scrollPaneArea, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(588, 395));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void cargarLista(Sistema modelo) {

        for (Area area : modelo.getListaAreas()) {
            JButton nuevo = new JButton(" ");
            nuevo.setMargin(new Insets(-5, -5, -5, -5));
            
            nuevo.setBackground(Color.GRAY);
            int porcentaje = (int) Math.floor((area.getPresupuestoAnual()-area.getPresupuestoRestante())/area.getPresupuestoAnual()*100);
            if(porcentaje>90){
                nuevo.setBackground(Color.RED);
            }else{
                if(porcentaje>=70){
                   nuevo.setBackground(Color.YELLOW);
                }
            }
            
            nuevo.setForeground(Color.WHITE);
            nuevo.setText(area.getNombre()); 
            
            nuevo.setMaximumSize(new Dimension(50,40));
            nuevo.setPreferredSize(new Dimension(50,40));
            
            nuevo.addActionListener(new AreaListener());
            panelArea.add(nuevo);
        }
    }

    private class AreaListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // este código se ejecutará al presionar el botón, obtengo cuál botón
            JButton cual = ((JButton) e.getSource());
            // código a completar según el botón presionado
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneBotones;
    private javax.swing.JLabel labelArea;
    private javax.swing.JPanel panelArea;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JScrollPane scrollPaneArea;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
