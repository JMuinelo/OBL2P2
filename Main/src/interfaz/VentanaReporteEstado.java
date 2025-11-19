package interfaz;

import dominio.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class VentanaReporteEstado extends javax.swing.JFrame implements Observer {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaReporteEstado.class.getName());

    public VentanaReporteEstado(Sistema sistema) {
        modelo = sistema;
        initComponents();
        modelo.addObserver(this);
        nombreAreaSelect = "";
        cargarAreas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelArea = new javax.swing.JLabel();
        scrollPaneArea = new javax.swing.JScrollPane();
        panelContenedor = new javax.swing.JPanel();
        panelArea = new javax.swing.JPanel();
        ScrollPaneBotones = new javax.swing.JScrollPane();
        panelContenedorDeBotones = new javax.swing.JPanel();
        panelDeBotones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelArea.setLayout(new java.awt.GridLayout(0, 1, 0, 10));
        panelContenedor.add(panelArea);

        scrollPaneArea.setViewportView(panelContenedor);

        panelContenedorDeBotones.setMaximumSize(null);
        panelContenedorDeBotones.setMinimumSize(null);
        panelContenedorDeBotones.setPreferredSize(null);

        panelDeBotones.setMaximumSize(null);
        panelDeBotones.setMinimumSize(null);
        panelDeBotones.setPreferredSize(null);
        panelDeBotones.setLayout(new java.awt.GridLayout(0, 3));
        panelContenedorDeBotones.add(panelDeBotones);

        ScrollPaneBotones.setViewportView(panelContenedorDeBotones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(scrollPaneArea, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelArea, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(ScrollPaneBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelArea, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPaneArea, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(ScrollPaneBotones))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(588, 395));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void cargarAreas() {
        panelArea.removeAll();
        for (Area area : modelo.getListaAreas()) {
            JButton nuevo = new JButton(" ");
            nuevo.setMargin(new Insets(-5, -5, -5, -5));

            nuevo.setBackground(Color.GRAY);
            int porcentaje = (int) Math.floor(((float) area.getPresupuestoAnual() - (float) area.getPresupuestoRestante()) / (float) area.getPresupuestoAnual() * 100);

            if (porcentaje > 90) {
                nuevo.setBackground(Color.RED);
            } else {
                if (porcentaje >= 70) {
                    nuevo.setBackground(Color.YELLOW);
                }
            }

            nuevo.setForeground(Color.WHITE);
            nuevo.setText(area.getNombre());
            //Estetica de los botones
            nuevo.setMaximumSize(new Dimension(90, 40));
            nuevo.setPreferredSize(new Dimension(90, 40));
            nuevo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));

            nuevo.addActionListener(new AreaListener());
            panelArea.add(nuevo);
        }
    }


    private class AreaListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            panelDeBotones.removeAll();
            JButton cual = ((JButton) e.getSource());
            nombreAreaSelect = cual.getText();
            cargarEmpleadosArea();
        }
    }
    
    public void cargarEmpleadosArea(){
        // este código se ejecutará al presionar el botón, obtengo cuál botón
        panelDeBotones.removeAll();

            if(nombreAreaSelect != ""){
                int porcentaje = 0;

                Area areaSelec = null;
                for (Area area : modelo.getListaAreas()) {
                    if (area.getNombre().equals(nombreAreaSelect)) {
                        areaSelec = area;
                        porcentaje = (int) Math.floor(((float) area.getPresupuestoAnual() - (float) area.getPresupuestoRestante()) / (float) area.getPresupuestoAnual() * 100);
                    }
                }

                labelArea.setText(nombreAreaSelect + " " + porcentaje + "%");
                Collections.sort(areaSelec.getListaEmpleado());

                for (Empleado emp : areaSelec.getListaEmpleado()) {
                    JButton nuevo = new JButton(" ");
                    nuevo.setMargin(new Insets(-5, -5, -5, -5));

                    //para determinar color del boton
                    int min = Integer.MAX_VALUE;
                    int max = 0;

                    for (Empleado emp2 : areaSelec.getListaEmpleado()) {
                        if (emp2.getSalario() < min) {
                            min = emp2.getSalario();
                        }
                        if (emp2.getSalario() > max) {
                            max = emp2.getSalario();
                        }
                    }
                    Color colorBoton;
                    if (max != min) {
                        float proporcion = ((float)emp.getSalario() - (float)min) / ((float)max - (float)min);
                        int rgbAzul = (int) (255 * proporcion);
                        colorBoton = new Color(0, 0, rgbAzul);
                    } else {
                        colorBoton = new Color(0, 0, 255);
                    }

                    nuevo.setBackground(colorBoton);

                    nuevo.setForeground(Color.WHITE);
                    nuevo.setText(emp.getNombre());
                    //Estetica de los botones
                    nuevo.setMaximumSize(new Dimension(110, 60));
                    nuevo.setPreferredSize(new Dimension(110, 60));
                    nuevo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));

                    nuevo.addActionListener(new EmpleadoListener());
                    panelDeBotones.add(nuevo);
                }
            }
            
    }

    private class EmpleadoListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton cual = ((JButton) e.getSource());
            Empleado empleado=null;
            String nombre = cual.getText();
            for(Empleado emp: modelo.getListaEmpleados()){
                if(emp.getNombre().equals(nombre)){
                    empleado = emp;
                }
            }
            JOptionPane.showMessageDialog(null,
                   "Nombre: " +empleado.getNombre()+ "\n" +
                   "Cedula: " +empleado.getCedula()+ "\n" +
                   "Celular: " +empleado.getCedula()+ "\n" +
                   "Manager: " +empleado.getManager()+ "\n" +
                   "Salario: " +empleado.getSalario()+ "\n" ,"Información",1);
        }
    }
    
    @Override
    public void update(Observable o, Object arg) {
        cargarAreas();
        cargarEmpleadosArea();
        panelArea.revalidate();
        panelArea.repaint();
        panelDeBotones.revalidate();
        panelDeBotones.repaint();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneBotones;
    private javax.swing.JLabel labelArea;
    private javax.swing.JPanel panelArea;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelContenedorDeBotones;
    private javax.swing.JPanel panelDeBotones;
    private javax.swing.JScrollPane scrollPaneArea;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private String nombreAreaSelect;
}
