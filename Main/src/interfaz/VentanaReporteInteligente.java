package interfaz;

import com.google.gson.Gson;
import dominio.*;
import grabarLeer.*;
import static interfaz.VentanaReporteInteligente.GeminiClient.llamarAGemini;
import java.util.ArrayList;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class VentanaReporteInteligente extends javax.swing.JFrame implements Observer {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaReporteInteligente.class.getName());

    public VentanaReporteInteligente(Sistema sistema) {
        modelo = sistema;
        initComponents();
        modelo.addObserver(this);
        cargarAreasOrigen();
        areaSelect = null;
    }

    public void cargarAreasOrigen() {
        listaAreaOrigen.setListData(modelo.getListaAreas().toArray());
    }

    public void cargarEmpleados() {
        if (areaSelect != null) {
            listaEmpleados.setListData(areaSelect.getListaEmpleado().toArray());
        }
    }

    public void cargarAreasDestino() {
        ArrayList<Area> listaAreaAux = new ArrayList();
        for (Area area : modelo.getListaAreas()) {
            if (!area.equals(areaSelect)) {
                listaAreaAux.add(area);
            }
        }
        listaAreaDestino.setListData(listaAreaAux.toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaAreaDestino = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaAreaOrigen = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEmpleados = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        boton = new javax.swing.JToggleButton();
        imagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte Inteligente");

        listaAreaDestino.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaAreaDestino);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Area Origen");

        listaAreaOrigen.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaAreaOrigen.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAreaOrigenValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaAreaOrigen);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Area Destino");

        jScrollPane3.setViewportView(listaEmpleados);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Empleados");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane4.setViewportView(textArea);

        boton.setText("Consultar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jLabel1.setText("Respuesta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(673, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaAreaOrigenValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAreaOrigenValueChanged
        Area areaElegida = (Area) listaAreaOrigen.getSelectedValue();
        if (areaElegida != null) {
            areaSelect = areaElegida;
        }
        System.out.println("areaSelect en metodo listaAreaOrigen:" + ((Area) listaAreaOrigen.getSelectedValue()));
        cargarAreasDestino();
        cargarEmpleados();
    }//GEN-LAST:event_listaAreaOrigenValueChanged

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed

        Empleado emp = (Empleado) listaEmpleados.getSelectedValue();
        Area areaOrSel = (Area) listaAreaOrigen.getSelectedValue();
        Area areaDeSel = (Area) listaAreaDestino.getSelectedValue();

        try {
            if (!(areaOrSel == null || areaDeSel == null)) {
                
                ArchivoLectura archivo = new ArchivoLectura("cvs/CV" + emp.getCedula() + ".txt");
                String cv = "";
                while (archivo.hayMasLineas()) {
                    cv += archivo.linea() + "\n";
                }
                archivo.cerrar();
                String prompt = "Actúa como un analista experto en Recursos Humanos y gestión de talento"
                        + "\nTu tarea es analizar la viabilidad de un movimiento interno de un empleado, basándote exclusivamente en la información proporcionada."
                        + "\nQuiero que generes un reporte CONCISO (enfasis en conciso) de ventajas y desventajas a partir de su curriculum y el area del que viene/ a la que es transferido"
                        + "\nConsiderar para el informe principalmente el curriculum para determinar si el empleado es apto para el area a la cual se lo quiere mover"
                        + "\n**Información del Empleado: "
                        + "\nCurrículum:" + cv
                        + "\n**Análisis del Movimiento:**"
                        + "\nÁrea de Origen: " + areaOrSel
                        + "\nÁrea de Destino: " + areaDeSel;

                String texto = "";

                imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/reloj.png")));

                SwingWorker<String, Void> worker = new SwingWorker<>() {//solo con swingworker se puede lograr que se vea la imagen en tiempo

                    @Override
                    protected String doInBackground() throws Exception {
                        return llamarAGemini(prompt);
                    }

                    @Override
                    protected void done() {
                        try {
                            String texto = get();
                            textArea.setText(texto);
                            imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/tick.png")));
                        } catch (Exception e) {
                            textArea.setText("No se pudo realizar la consulta");
                        }
                    }
                };
                worker.execute();
            }else{
                JOptionPane.showMessageDialog(this, "Seleccione todos los campos", "Error", 2);
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Seleccione todos los campos", "Error", 2);
        }
    }//GEN-LAST:event_botonActionPerformed

    public class GeminiClient {

        private static final String API_KEY = "TU_API_KEY";

        public static String llamarAGemini(String prompt) throws Exception {
            String url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent?key=" + System.getenv("ERP_API_KEY");
            String json = "{ \"contents\": [{ \"parts\": [{ \"text\": \"" + prompt + "\" }] }] }";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            GeminiResponse geminiRespuesta = gson.fromJson(response.body(), GeminiResponse.class);
            try {
                // Navegamos por la estructura:
                // respuesta -> lista de candidatos -> primer candidato -> contenido -> lista de partes -> primera parte -> texto
                String textoLimpio = geminiRespuesta.getCandidates().get(0).getContent().getParts().get(0).getText();
                return textoLimpio;
            } catch (Exception e) {
                // Si algo falla (ej. Google te da un error), devuelve el error
                // para que sepas qué pasó.
                return "Error al procesar la respuesta de la IA: " + e.getMessage() + "\nJSON Recibido: " + response.body();
            }
            //return response.body();
        }

        private static class GeminiPart {

            String text;

            public String getText() {
                return text;
            }
        }

        private static class GeminiContent {

            java.util.List<GeminiPart> parts;

            public java.util.List<GeminiPart> getParts() {
                return parts;
            }
        }

        private static class GeminiCandidate {

            GeminiContent content;

            public GeminiContent getContent() {
                return content;
            }
        }

        private static class GeminiResponse {

            java.util.List<GeminiCandidate> candidates;

            public java.util.List<GeminiCandidate> getCandidates() {
                return candidates;
            }
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        cargarAreasOrigen();
        System.out.println("AreasSelect_:" + areaSelect);
        cargarEmpleados();
        cargarAreasDestino();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton boton;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listaAreaDestino;
    private javax.swing.JList listaAreaOrigen;
    private javax.swing.JList listaEmpleados;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private Area areaSelect;
}
