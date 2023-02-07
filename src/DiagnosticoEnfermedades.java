
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diana
 */
public class DiagnosticoEnfermedades extends javax.swing.JFrame {

    /**
     * Creates new form DiagnosticoEnfermedades
     */
    public DiagnosticoEnfermedades() {
        initComponents();
        setTitle("Sistema de diagnostico de enfermedades");
        setResizable(false);
        this.setLocationRelativeTo(null);
        texto.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel6.setText("Intolerancia a la Lactosa, Cancer en el estomago, Cancer de Colon  ");

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        jLabel1.setText("Diagnostico de Enfermedades");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel2.setText("Instrucciones:");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel3.setText("Para iniciar el Test debe de iniciar en el sistema,");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel4.setText(" dado click en Iniciar y responder a las serie de ");

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel5.setText("preguntas que se le presentan. ");

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)))
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = 0, b = 0, c = 0;
        a = JOptionPane.showConfirmDialog(rootPane, "¿Presenta hichazon,distension abdominal ?", null, YES_NO_OPTION);

        if (a == 0) {
            lactosa();
        } else if (a == 1) {
            b = JOptionPane.showConfirmDialog(rootPane, "¿Presenta dificultad al tragar ?", null, YES_NO_OPTION);

        }

        if (b == 0) {
            estomago();
        } else if (b == 1) {
            c = JOptionPane.showConfirmDialog(rootPane, "¿Presenta estrechamiento de las haces ?", null, YES_NO_OPTION);

        }
        if (c == 0) {
            colon();
        } else if (c == 1) {
            JOptionPane.showMessageDialog(rootPane, "Usted no presenta ninguno de estos sintomas", null, YES_NO_OPTION);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DiagnosticoEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiagnosticoEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiagnosticoEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnosticoEnfermedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiagnosticoEnfermedades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables

    private void lactosa() {

        int i, j, k, l, m, n;
        i = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta diarrea?", null, YES_NO_OPTION);
        j = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta gases?", null, YES_NO_OPTION);
        k = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta nauseas?", null, YES_NO_OPTION);
        l = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta dolor de abdomen?", null, YES_NO_OPTION);
        m = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta ruidos estomacales?", null, YES_NO_OPTION);
        n = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta vomitos?", null, YES_NO_OPTION);

        if ((i == 0) && (j == 0) && (k == 0) && (l == 0) && (m == 0) && (n == 0)) {

            String dg = "---------------------------------------------------\n"
                    + " Sistema Experto de Diagnostico de enfermedades \n"
                    + " Ingenieria en Sistemas                         \n"
                    + "---------------------------------------------------\n"
                    + " Diagnostico de enfermedades                      \n"
                    + " Usted Presente Intolerancia a la Lactosa \n"
                    + "debe asegurarse de consumir suficiente calcio todos \n"
                    + "los días. La vitamina D ayuda al cuerpo a absorber"
                    + " y usar el calcio. \n"
                    + "Las personas deben asegurarse de comer alimentos que contengan \n"
                    + "vitamina D, como huevos, hígado y ciertos tipos de pescado, \n"
                    + "como salmón.                                        \n"
                    + " Debe presentarse con su medico de confianza\n"
                    + "----------------------------------------------------";

            texto.setText(dg);
        } else {
            lactosa();
        }

    }

    private void estomago() {
        int o, p, q, r, s, t, u, v, w, x;
        o = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta Nausea con Vomitos?", null, YES_NO_OPTION);
        p = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta Acides estomacal frecuentemente?", null, YES_NO_OPTION);
        q = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta dificultad al tragar?", null, YES_NO_OPTION);
        r = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta perdida de peso?", null, YES_NO_OPTION);
        s = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta perdida de apetito ?", null, YES_NO_OPTION);
        t = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta hichazon constante?", null, YES_NO_OPTION);
        u = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta heces con sangre?", null, YES_NO_OPTION);
        v = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta ojos o piel amarillos?", null, YES_NO_OPTION);
        w = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta fatiga excesiva?", null, YES_NO_OPTION);
        x = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta Dolor de estomago?", null, YES_NO_OPTION);

        if ((o == 0) && (p == 0) && (q == 0) && (r == 0) && (s == 0) && (t == 0) && (u == 0) && (v == 0)
                && (w == 0) && (x == 0)) {

            String dg = "---------------------------------------------------\n"
                    + " Sistema Experto de Diagnostico de enfermedades \n"
                    + "Ingenieria en Sistemas                           \n"
                    + "---------------------------------------------------\n"
                    + "Diagnostico de enfermedades                      \n"
                    + "Usted Presenta Cancer de Estomago                  \n"
                    + "Una alimentación rica en frutas y verduras frescas\n"
                    + " probablemente también reduce el riesgo de cáncer \n"
                    + "de estómago. Las frutas cítricas (naranjas, limones \n"
                    + "y toronjas) pueden ser especialmente beneficiosas, \n"
                    + "aunque la toronja y el jugo de toronja pueden cambiar\n "
                    + "los niveles sanguíneos de ciertos medicamentos que esté \n"
                    + "tomando \n"
                    + "Debe presentarse con su medico de confianza        \n"
                    + "----------------------------------------------------";

            texto.setText(dg);
        } else {
            estomago();
        }

    }

    private void colon() {

        int d, e, f, g, h, y, z;
        d = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta Diarrea?", null, YES_NO_OPTION);
        e = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta estrechamiento de las heces?", null, YES_NO_OPTION);
        f = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta sensasiones de ir al sanitario y no son aliviadas luego de evacuar?", null, YES_NO_OPTION);
        g = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta heces obscuras o con sangrado?", null, YES_NO_OPTION);
        h = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta calambres o dolor abdominal?", null, YES_NO_OPTION);
        y = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta debilidad o fatiga?", null, YES_NO_OPTION);
        z = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta perdida de peso?", null, YES_NO_OPTION);

        if ((d == 0) && (e == 0) && (f == 0) && (g == 0) && (h == 0) && (y == 0) && (z == 0)) {

            String dg = "---------------------------------------------------\n"
                    + " Sistema Experto de Diagnostico de enfermedades \n"
                    + " Ingenieria en Sistemas                         \n"
                    + "---------------------------------------------------\n"
                    + "Diagnostico de enfermedades                      \n"
                    + "Usted Presenta Cancer de Colon\n"
                    + "Una alimentación baja en grasas animales y rica \n"
                    + "en frutas, verduras y granos integrales puede \n"
                    + "reducir el riesgo de cáncer colorrectal \n"
                    + "Debe presentarse con su medico de confianza\n"
                    
                    + "----------------------------------------------------";

            texto.setText(dg);
        } else {
            colon();
        }

    }
}
