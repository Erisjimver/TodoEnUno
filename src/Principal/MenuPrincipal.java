package Principal;

import java.util.ArrayList;

/**
 *
 * @author Anonimo
 */
public class MenuPrincipal extends javax.swing.JPanel {

    public MenuPrincipal() {
        initComponents();
    }

//metodos//
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane = new javax.swing.JTabbedPane();
        PanelListas = new javax.swing.JPanel();

        javax.swing.GroupLayout PanelListasLayout = new javax.swing.GroupLayout(PanelListas);
        PanelListas.setLayout(PanelListasLayout);
        PanelListasLayout.setHorizontalGroup(
            PanelListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        PanelListasLayout.setVerticalGroup(
            PanelListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        TabbedPane.addTab("Listas", PanelListas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelListas;
    private javax.swing.JTabbedPane TabbedPane;
    // End of variables declaration//GEN-END:variables
}
