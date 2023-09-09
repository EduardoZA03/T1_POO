package T1POO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class FrameListaPersona extends javax.swing.JFrame {

    private final List<Persona> personas = new ArrayList<>();
    public FrameListaPersona() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        tbnAgregar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNombre.setText("Nombre");

        jScrollPane1.setViewportView(Lista);

        tbnAgregar.setText("Agregar");
        tbnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnAgregarActionPerformed(evt);
            }
        });

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVer)
                    .addComponent(tbnAgregar))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(tbnAgregar)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVer)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    DefaultListModel modelo = new DefaultListModel();
    
    private void tbnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnAgregarActionPerformed
        String nombre = txtNombre.getText();
        Persona per = new Persona(nombre); 
        
        modelo.addElement(per.consola());
        personas.add(per);
        Lista.setModel(modelo);
    }//GEN-LAST:event_tbnAgregarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed

        int index = Lista.getSelectedIndex();
        Persona personaSelec = personas.get(index);
        
        FramePersona pantalla = new FramePersona
        (this,personaSelec);
        
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnVerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameListaPersona().setVisible(true);
            }
        });   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista;
    private javax.swing.JButton btnVer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tbnAgregar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
