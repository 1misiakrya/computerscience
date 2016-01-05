/*
 * Name: QuizResults
 * Date: June 10, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program is the results portion of the quiz program.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.summative;

/**
 *
 * @author muirwa
 */
public class QuizResults extends javax.swing.JFrame {

    /**
     * Creates new form QuizResults
     */
    public QuizResults(int score) {
        initComponents();
        int maxScore = 10;
        maxScoreLabel.setText("" + maxScore);
        userScoreLabel.setText("" + score);
        if (score == 10) {
            messageLabel.setText("Perfect Score! Nice Work!");
        } else if (score >= 8) {
            messageLabel.setText("So Close to Perfect! Great Job!");
        } else if (score >= 7) {
            messageLabel.setText("You Can Do Better! Study Some More and Try Again!");
        } else if (score >= 5) {
            messageLabel.setText("You Are Close to Failing... Study More!!!");
        } else {
            messageLabel.setText("Fail - Need to Study a Lot More...");
        }
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
        userScoreTitleLabel = new javax.swing.JLabel();
        thankYouLabel = new javax.swing.JLabel();
        userScoreLabel = new javax.swing.JLabel();
        maxScoreLabel = new javax.swing.JLabel();
        slashLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        titleLabel.setText("Ryan's Quiz Results");

        userScoreTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userScoreTitleLabel.setText("Your Score:");

        thankYouLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N

        userScoreLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userScoreLabel.setText("0");

        maxScoreLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maxScoreLabel.setText("10");

        slashLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        slashLabel.setText("/");

        messageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(thankYouLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userScoreTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userScoreLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(slashLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxScoreLabel)))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userScoreTitleLabel)
                            .addComponent(userScoreLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(slashLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(maxScoreLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(messageLabel)
                .addGap(45, 45, 45)
                .addComponent(thankYouLabel)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizResults(2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel maxScoreLabel;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel slashLabel;
    private javax.swing.JLabel thankYouLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userScoreLabel;
    private javax.swing.JLabel userScoreTitleLabel;
    // End of variables declaration//GEN-END:variables
}