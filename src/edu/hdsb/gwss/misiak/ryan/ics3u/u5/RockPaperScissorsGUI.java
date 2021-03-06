/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

/**
 *
 * @author RMisiak
 */
public class RockPaperScissorsGUI extends javax.swing.JFrame {

    /**
     * Creates new form RockPaperScissorsGUI
     */
    public RockPaperScissorsGUI() {
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

        rock = new javax.swing.JToggleButton();
        paper = new javax.swing.JToggleButton();
        scissors = new javax.swing.JToggleButton();
        winStatement = new javax.swing.JLabel();
        winsLossesTies = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rock.setText("Rock");
        rock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockActionPerformed(evt);
            }
        });

        paper.setText("Paper");
        paper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperActionPerformed(evt);
            }
        });

        scissors.setText("Scissors");
        scissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsActionPerformed(evt);
            }
        });

        winStatement.setText("jLabel1");

        winsLossesTies.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(winsLossesTies)
                            .addComponent(winStatement))
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rock)
                        .addGap(76, 76, 76)))
                .addComponent(paper)
                .addGap(121, 121, 121)
                .addComponent(scissors)
                .addContainerGap(411, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rock)
                    .addComponent(paper)
                    .addComponent(scissors))
                .addGap(76, 76, 76)
                .addComponent(winStatement)
                .addGap(33, 33, 33)
                .addComponent(winsLossesTies)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockActionPerformed

        String userInput = "Rock";
        String computerChoice = "";
        String gameEnds = "";
        int wins = 0;
        int losses = 0;
        int ties = 0;

        int computerChoiceGenerator = (int) (Math.random() * 3 + 1);
        if (computerChoiceGenerator == 1) {
            computerChoice = "Rock";
        } else if (computerChoiceGenerator == 2) {
            computerChoice = "Paper";
        } else if (computerChoiceGenerator == 3) {
            computerChoice = "Scissors";
        }
        if (computerChoice.equals(userInput)) {
            gameEnds = "It's a tie!";
            ties = ties + 1;
        } else if (computerChoice.equals("Paper")) {
            gameEnds = "You lose...";
            losses = losses + 1;
        } else if (computerChoice.equals("Scissors")) {
            gameEnds = "You win!";
            wins = wins + 1;
        }
        winStatement.setText("You threw " + userInput + " and the computer threw \n" + computerChoice + ". " + gameEnds);
        winsLossesTies.setText("Wins: " + wins + " Losses: " + losses + " Ties: " + ties);
    }//GEN-LAST:event_rockActionPerformed

    private void paperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperActionPerformed

        String userInput = "Paper";
        String computerChoice = "";
        String gameEnds = "";

        int computerChoiceGenerator = (int) (Math.random() * 3 + 1);
        if (computerChoiceGenerator == 1) {
            computerChoice = "Rock";
        } else if (computerChoiceGenerator == 2) {
            computerChoice = "Paper";
        } else if (computerChoiceGenerator == 3) {
            computerChoice = "Scissors";
        }
        if (computerChoice.equals(userInput)) {
            gameEnds = "It's a tie!";
        } else if (computerChoice.equals("Rock")) {
            gameEnds = "You win!";
        } else if (computerChoice.equals("Scissors")) {
            gameEnds = "You lose...";
        }
        winStatement.setText("You threw " + userInput + " and the computer threw " + computerChoice + ". " + gameEnds);
    }//GEN-LAST:event_paperActionPerformed

    private void scissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsActionPerformed

        String userInput = "Scissors";
        String computerChoice = "";
        String gameEnds = "";

        int computerChoiceGenerator = (int) (Math.random() * 3 + 1);
        if (computerChoiceGenerator == 1) {
            computerChoice = "Rock";
        } else if (computerChoiceGenerator == 2) {
            computerChoice = "Paper";
        } else if (computerChoiceGenerator == 3) {
            computerChoice = "Scissors";
        }
        if (computerChoice.equals(userInput)) {
            gameEnds = "It's a tie!!";
        } else if (computerChoice.equals("Paper")) {
            gameEnds = "You win!";
        } else if (computerChoice.equals("Rock")) {
            gameEnds = "You lose...";
        }
        winStatement.setText("You threw " + userInput + " and the computer threw " + computerChoice + ". " + gameEnds);

    }//GEN-LAST:event_scissorsActionPerformed

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
            java.util.logging.Logger.getLogger(RockPaperScissorsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissorsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissorsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissorsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RockPaperScissorsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton paper;
    private javax.swing.JToggleButton rock;
    private javax.swing.JToggleButton scissors;
    private javax.swing.JLabel winStatement;
    private javax.swing.JLabel winsLossesTies;
    // End of variables declaration//GEN-END:variables
}
