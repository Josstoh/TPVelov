package velov;

import dao.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jess
 */
public class LaFenetre extends javax.swing.JFrame {

<<<<<<< HEAD
    private int nouveauNumero;
    private int clicBtnCreer=1;
=======
    private MonModele modele;
>>>>>>> 5b2994a3e2220baef728ccdb3371abbb416c8770
    
    public LaFenetre() {
        initComponents();
         modele = (MonModele)tabStation.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabStation = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbNumeroStation = new javax.swing.JLabel();
        txtNumeroStation = new javax.swing.JTextField();
        lbNomStation = new javax.swing.JLabel();
        txtNomStation = new javax.swing.JTextField();
        lbNumArrond = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListeArrondissement = new javax.swing.JList();
        lbLocalisation = new javax.swing.JLabel();
        txtLocalisation = new javax.swing.JTextField();
        btCreer = new javax.swing.JButton();
        btSupprimer = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuFichierConnexionBase = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuFichierQuitter = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuApropos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestion des stations");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                quitterFenetre(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/velov/banniere.jpg"))); // NOI18N

        tabStation.setModel(new MonModele());
        jScrollPane1.setViewportView(tabStation);

        lbNumeroStation.setText("Numéro de station :");

        txtNumeroStation.setEditable(false);

        lbNomStation.setText("Nom station :");

        lbNumArrond.setText("Numéro arrondissement :");

        ListeArrondissement.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListeArrondissement);

        lbLocalisation.setText("Localisation :");

        btCreer.setText("Créer");
        btCreer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreerActionPerformed(evt);
            }
        });

        btSupprimer.setText("Supprimer");
        btSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNumeroStation)
                            .addComponent(lbNomStation)
                            .addComponent(lbNumArrond)
                            .addComponent(lbLocalisation))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroStation)
                            .addComponent(txtNomStation)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(txtLocalisation)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btCreer)
                        .addGap(60, 60, 60)
                        .addComponent(btSupprimer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumeroStation)
                    .addComponent(txtNumeroStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomStation)
                    .addComponent(txtNomStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNumArrond)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocalisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLocalisation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCreer)
                    .addComponent(btSupprimer))
                .addContainerGap())
        );

        jMenu1.setText("Fichier");

        menuFichierConnexionBase.setText("Connexion à la base");
        menuFichierConnexionBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFichierConnexionBaseActionPerformed(evt);
            }
        });
        jMenu1.add(menuFichierConnexionBase);
        jMenu1.add(jSeparator1);

        menuFichierQuitter.setText("Quitter");
        menuFichierQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFichierQuitterActionPerformed(evt);
            }
        });
        jMenu1.add(menuFichierQuitter);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("?");

        menuApropos.setText("A propos");
        menuApropos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAproposActionPerformed(evt);
            }
        });
        jMenu2.add(menuApropos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitter() {
        int reponse = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment quitter?", "Attention", JOptionPane.YES_NO_OPTION);   //this = fenêtre de dialogue
        if (reponse == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    private void menuFichierConnexionBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFichierConnexionBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuFichierConnexionBaseActionPerformed

    private void menuFichierQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFichierQuitterActionPerformed
        quitter();
    }//GEN-LAST:event_menuFichierQuitterActionPerformed

    private void menuAproposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAproposActionPerformed
        Apropos aPropos = new Apropos(this,true);
        aPropos.setVisible(true);
    }//GEN-LAST:event_menuAproposActionPerformed

    private void quitterFenetre(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_quitterFenetre
        quitter();
    }//GEN-LAST:event_quitterFenetre

    private void btSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupprimerActionPerformed
<<<<<<< HEAD
        // TODO add your handling code here:
    }//GEN-LAST:event_btSupprimerActionPerformed

    private void btCreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreerActionPerformed
        switch (clicBtnCreer)
        {   
            case 1 :
                nouveauNumero = Integer.valueOf(DAOStation.getNumeroDerniereStation())+1;
                txtNumeroStation.setText(String.valueOf(nouveauNumero));
                clicBtnCreer++;
                btCreer.setText("OK");
                break;
            
            case 2 :
                if(txtNomStation.getText().isEmpty() || txtLocalisation.getText().isEmpty() || ListeArrondissement.isSelectionEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Veuillez remplir toutes les informations", "Attention", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    int bool = JOptionPane.showConfirmDialog(this, "Ajouter cette station?", "Confirmation de la création", JOptionPane.YES_NO_OPTION);
                    if(bool == 0)
                    {
                        DAOStation.inserer(txtNumeroStation.getText(), txtNomStation.getText(), Integer.valueOf(ListeArrondissement.getSelectedValue().toString()), txtLocalisation.getText());
                        txtNumeroStation.setText(null);
                        txtNomStation.setText(null);
                        txtLocalisation.setText(null);
                        ListeArrondissement.setSelectedIndex(0);
                        btCreer.setText("Créer");
                        
                    }
                }
                    clicBtnCreer=1;
                    break;
        }            
    }//GEN-LAST:event_btCreerActionPerformed

=======
        if(tabStation.getSelectedRow()== -1)
            JOptionPane.showMessageDialog(null, "Aucune ligne sélectionnée !", "ERREUR lors de la SUPPRESSION", JOptionPane.ERROR_MESSAGE);
        else
        {
            modele.supprimer(tabStation.getSelectedRow());
            modele.actualiser();
            modele.actualiser();
        }
    }//GEN-LAST:event_btSupprimerActionPerformed

>>>>>>> 5b2994a3e2220baef728ccdb3371abbb416c8770
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListeArrondissement;
    private javax.swing.JButton btCreer;
    private javax.swing.JButton btSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbLocalisation;
    private javax.swing.JLabel lbNomStation;
    private javax.swing.JLabel lbNumArrond;
    private javax.swing.JLabel lbNumeroStation;
    private javax.swing.JMenuItem menuApropos;
    private javax.swing.JMenuItem menuFichierConnexionBase;
    private javax.swing.JMenuItem menuFichierQuitter;
    private javax.swing.JTable tabStation;
    private javax.swing.JTextField txtLocalisation;
    private javax.swing.JTextField txtNomStation;
    private javax.swing.JTextField txtNumeroStation;
    // End of variables declaration//GEN-END:variables
}
