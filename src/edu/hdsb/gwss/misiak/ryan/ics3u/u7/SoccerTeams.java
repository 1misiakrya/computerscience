/*
 * Name: SoccerTeams
 * Date: May 27, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program lists friends from a file.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

/**
 *
 * @author 1misiakrya
 */
public class SoccerTeams extends javax.swing.JFrame {

    private SoccerTeamsViewer child;

    public SoccerTeams() {
        initComponents();

        //Checking if the file has anything written.
        File file = new File("team.xml");

        if (file.length() == 0) {
            //Creating new root and document if it has nothing written.
            rootTeams = new Element(ELEMENT_TEAM);
            teamData = new Document(rootTeams);
        } else {
            try {
                //Getting the root and document if it has something written.
                Builder builder = new Builder();
                teamData = builder.build(file);
                rootTeams = teamData.getRootElement();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    SoccerTeams(SoccerTeamsViewer aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        teamLabel = new javax.swing.JLabel();
        teamField = new javax.swing.JTextField();
        addToTeamsButton = new javax.swing.JToggleButton();
        leagueLabel = new javax.swing.JLabel();
        leagueBox = new javax.swing.JComboBox();
        numberOfPlayersSpinner = new javax.swing.JSpinner();
        numberOfPlayersLabel = new javax.swing.JLabel();
        ticketCostLabel = new javax.swing.JLabel();
        ticketField = new javax.swing.JTextField();
        finishedButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titleLabel.setText("Soccer Teams");

        teamLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teamLabel.setText("Team:");

        addToTeamsButton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        addToTeamsButton.setText("Add To Teams");
        addToTeamsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToTeamsButtonActionPerformed(evt);
            }
        });

        leagueLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leagueLabel.setText("League:");

        leagueBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Premier League", "La Liga", "Bundesliga", "MLS", "Ligue 1", "Serie A" }));
        leagueBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leagueBoxActionPerformed(evt);
            }
        });

        numberOfPlayersLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numberOfPlayersLabel.setText("Number Of Players:");

        ticketCostLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ticketCostLabel.setText("Ticket Cost ($XX.XX)");

        finishedButton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        finishedButton.setText("Finished");
        finishedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ticketCostLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ticketField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numberOfPlayersLabel)
                                    .addComponent(teamLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(leagueLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(leagueBox, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numberOfPlayersSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(finishedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addToTeamsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titleLabel)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(teamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leagueLabel)
                    .addComponent(leagueBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfPlayersLabel)
                    .addComponent(numberOfPlayersSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketCostLabel)
                    .addComponent(ticketField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(addToTeamsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finishedButton)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToTeamsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToTeamsButtonActionPerformed

//        // Checking to see if the elements exist.
//        for (int i = 0; i < rootTeams.getChildElements().size(); i++) {
//            if (rootTeams.getChildElements().get(i).getFirstChildElement("team").getValue().equals("league")) {
//                fileFound = true;
//            }
//        }

        // Creating new elements if the file is not found.
        if (!fileFound) {

            //Creating the Elements.
            Element league = new Element(ELEMENT_LEAGUE);

            Element players = new Element(ELEMENT_PLAYERS);
            players.appendChild("" + numberOfPlayersSpinner.getValue());
            Element ticketCost = new Element(ELEMENT_TICKET_COST);
            ticketCost.appendChild(ticketField.getText());
            Element leagueName = new Element(ELEMENT_LEAGUE_NAME);
            leagueName.appendChild("" + leagueBox.getSelectedItem());
            Element teamName = new Element(ELEMENT_TEAM_NAME);
            teamName.appendChild(teamField.getText());

            //Appending the children to the main element.
            league.appendChild(leagueName);
            league.appendChild(teamName);
            league.appendChild(players);
            league.appendChild(ticketCost);
            rootTeams.appendChild(league);
        }

        //Writing the information to the window for the user to view.
        try {
            Serializer a = new Serializer(System.out);
            a.setIndent(4);
            a.setMaxLength(64);
            a.write(teamData);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        //Writing the information to the file.
        try {
            FileWriter output = new FileWriter("team.xml");
            BufferedWriter writer = new BufferedWriter(output);
            writer.write(rootTeams.toXML());
            writer.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_addToTeamsButtonActionPerformed

    private void leagueBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leagueBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leagueBoxActionPerformed

    private void finishedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishedButtonActionPerformed

        if (child == null) {
            this.child = new SoccerTeamsViewer(this);
        }
        this.child.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_finishedButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SoccerTeams.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoccerTeams.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoccerTeams.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoccerTeams.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoccerTeams().setVisible(true);
            }
        });
    }

    //Strings that are being used to name the elements.
    static final String ELEMENT_TEAM = "team";
    static final String ELEMENT_TEAM_NAME = "teamName";
    static final String ELEMENT_LEAGUE = "league";
    static final String ELEMENT_PLAYERS = "players";
    static final String ELEMENT_TICKET_COST = "ticketCost";
    static final String ELEMENT_LEAGUE_NAME = "leagueName";

    //Boolean that, if true, will prevent the file from being re-written.
    boolean fileFound = false;

    //Creating the root element and the document for the program.
    Element rootTeams;
    Document teamData;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addToTeamsButton;
    private javax.swing.JToggleButton finishedButton;
    private javax.swing.JComboBox leagueBox;
    private javax.swing.JLabel leagueLabel;
    private javax.swing.JLabel numberOfPlayersLabel;
    private javax.swing.JSpinner numberOfPlayersSpinner;
    private javax.swing.JTextField teamField;
    private javax.swing.JLabel teamLabel;
    private javax.swing.JLabel ticketCostLabel;
    private javax.swing.JTextField ticketField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
