/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author fer
 */
public class NewJDialog extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public NewJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        fER_ConectorBD1 = new bean_11_consultaSQL.FER_ConectorBD();
        fER_ConsultaSQLCLIENTE = new bean_11_consultaSQL.FER_ConsultaSQL();
        fER_ConsultaSQLMUNICIPIO = new bean_11_consultaSQL.FER_ConsultaSQL();
        fER_ConsultaSQLPROVINCIA = new bean_11_consultaSQL.FER_ConsultaSQL();
        jScrollPane1 = new javax.swing.JScrollPane();
        fER_DBGRID1 = new bean_11_consultaSQL.FER_DBGRID();
        jScrollPane2 = new javax.swing.JScrollPane();
        fER_DBGRID2 = new bean_11_consultaSQL.FER_DBGRID();
        jScrollPane3 = new javax.swing.JScrollPane();
        fER_DBGRID3 = new bean_11_consultaSQL.FER_DBGRID();
        fER_NumeroFilas1 = new bean_11_consultaSQL.FER_NumeroFilas();
        fER_NumeroColumnas1 = new bean_11_consultaSQL.FER_NumeroColumnas();
        fER_NumeroFilas2 = new bean_11_consultaSQL.FER_NumeroFilas();
        fER_NumeroColumnas2 = new bean_11_consultaSQL.FER_NumeroColumnas();
        fER_NumeroFilas3 = new bean_11_consultaSQL.FER_NumeroFilas();
        fER_NumeroColumnas3 = new bean_11_consultaSQL.FER_NumeroColumnas();
        jScrollPane4 = new javax.swing.JScrollPane();
        jAreaEscucha1 = new bean_11_consultaSQL.JAreaEscucha();

        fER_ConsultaSQLCLIENTE.setAA_FER_ConectorBD(fER_ConectorBD1);
        fER_ConsultaSQLCLIENTE.setConsultaSELECT("Select * from Cliente");

        fER_ConsultaSQLMUNICIPIO.setAA_FER_ConectorBD(fER_ConectorBD1);
        fER_ConsultaSQLMUNICIPIO.setConsultaSELECT("SELECT * FROM MUNICIPIO");

        fER_ConsultaSQLPROVINCIA.setAA_FER_ConectorBD(fER_ConectorBD1);
        fER_ConsultaSQLPROVINCIA.setConsultaSELECT("Select * from provincia");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fER_DBGRID1.setAA_FER_ConsultaSQL(fER_ConsultaSQLCLIENTE);
        jScrollPane1.setViewportView(fER_DBGRID1);

        fER_DBGRID2.setAA_FER_ConsultaSQL(fER_ConsultaSQLMUNICIPIO);
        jScrollPane2.setViewportView(fER_DBGRID2);

        fER_DBGRID3.setAA_FER_ConsultaSQL(fER_ConsultaSQLPROVINCIA);
        jScrollPane3.setViewportView(fER_DBGRID3);

        fER_NumeroFilas1.setAA_ConsultaSQL(fER_ConsultaSQLCLIENTE);

        fER_NumeroColumnas1.setAA_ConsultaSQL(fER_ConsultaSQLCLIENTE);

        fER_NumeroFilas2.setAA_ConsultaSQL(fER_ConsultaSQLMUNICIPIO);

        fER_NumeroColumnas2.setAA_ConsultaSQL(fER_ConsultaSQLMUNICIPIO);

        fER_NumeroFilas3.setAA_ConsultaSQL(fER_ConsultaSQLPROVINCIA);

        fER_NumeroColumnas3.setAA_ConsultaSQL(fER_ConsultaSQLPROVINCIA);

        jAreaEscucha1.setColumns(20);
        jAreaEscucha1.setRows(5);
        jScrollPane4.setViewportView(jAreaEscucha1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(fER_NumeroFilas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(fER_NumeroColumnas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(fER_NumeroFilas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(fER_NumeroColumnas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(fER_NumeroFilas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(fER_NumeroColumnas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fER_NumeroFilas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fER_NumeroColumnas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fER_NumeroFilas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fER_NumeroColumnas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fER_NumeroFilas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fER_NumeroColumnas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(215, 215, 215))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialog dialog = new NewJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private bean_11_consultaSQL.FER_ConectorBD fER_ConectorBD1;
    private bean_11_consultaSQL.FER_ConsultaSQL fER_ConsultaSQLCLIENTE;
    private bean_11_consultaSQL.FER_ConsultaSQL fER_ConsultaSQLMUNICIPIO;
    private bean_11_consultaSQL.FER_ConsultaSQL fER_ConsultaSQLPROVINCIA;
    private bean_11_consultaSQL.FER_DBGRID fER_DBGRID1;
    private bean_11_consultaSQL.FER_DBGRID fER_DBGRID2;
    private bean_11_consultaSQL.FER_DBGRID fER_DBGRID3;
    private bean_11_consultaSQL.FER_NumeroColumnas fER_NumeroColumnas1;
    private bean_11_consultaSQL.FER_NumeroColumnas fER_NumeroColumnas2;
    private bean_11_consultaSQL.FER_NumeroColumnas fER_NumeroColumnas3;
    private bean_11_consultaSQL.FER_NumeroFilas fER_NumeroFilas1;
    private bean_11_consultaSQL.FER_NumeroFilas fER_NumeroFilas2;
    private bean_11_consultaSQL.FER_NumeroFilas fER_NumeroFilas3;
    private bean_11_consultaSQL.JAreaEscucha jAreaEscucha1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
