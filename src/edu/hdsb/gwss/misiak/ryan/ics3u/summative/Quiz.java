/*
 * Name: Quiz
 * Date: June 10, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program is the quiz portion of the quiz program.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.summative;

import edu.hdsb.gwss.misiak.ryan.ics3u.u6.ArrayHelper;
import java.io.File;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author muirwa
 */
public class Quiz extends javax.swing.JFrame {

    File file = new File("Questions For Summative.xml");
    int x = 0;
    Builder builder = new Builder();
    Document questionsDocument;
    Element questionsRoot;
    Elements questions;
    int maxScore = 0;
    int userScore = 0;
    int[] questionNumbers = new int[10];

    /**
     * Creates new form Quiz
     */
    public Quiz() {
        initComponents();
        questionNumberLabel.setText("" + (x + 1));
        int random;

        try {
            questionsDocument = builder.build(file);
            questionsRoot = questionsDocument.getRootElement();
            questions = questionsRoot.getChildElements();

            for (int i = 0; i < questionNumbers.length; i++) {
                questionNumbers[i] = 20;
            }

            //Attaching strings to the string array.
            for (int i = 0; i < questionNumbers.length; i++) {
                do {
                    random = (int) (Math.random() * 11);
                } while (ArrayHelper.linearSearch(questionNumbers, random) != -1);
                questionNumbers[i] = random;
            }

            questionArea.setText(questions.get(questionNumbers[x]).getFirstChildElement("question").getValue());
            aField.setText(questions.get(questionNumbers[x]).getFirstChildElement("answer1").getValue());
            bField.setText(questions.get(questionNumbers[x]).getFirstChildElement("answer2").getValue());
            cField.setText(questions.get(questionNumbers[x]).getFirstChildElement("answer3").getValue());
            dField.setText(questions.get(questionNumbers[x]).getFirstChildElement("answer4").getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }

        nextQuestionButton.setEnabled(false);
        toResultsButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        toResultsButton = new javax.swing.JButton();
        questionTitleLabel = new javax.swing.JLabel();
        aLabel = new javax.swing.JLabel();
        bLabel = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        dLabel = new javax.swing.JLabel();
        aField = new javax.swing.JTextField();
        bField = new javax.swing.JTextField();
        cField = new javax.swing.JTextField();
        dField = new javax.swing.JTextField();
        userAnswerLabel = new javax.swing.JLabel();
        answerButton = new javax.swing.JToggleButton();
        questionNumberTitleLabel = new javax.swing.JLabel();
        questionNumberLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionArea = new javax.swing.JTextArea();
        correctAnswerLabel = new javax.swing.JLabel();
        correctAnswerField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        aRadioButton = new javax.swing.JRadioButton();
        bRadioButton = new javax.swing.JRadioButton();
        cRadioButton = new javax.swing.JRadioButton();
        dRadioButton = new javax.swing.JRadioButton();
        nextQuestionButton = new javax.swing.JToggleButton();
        userScoreLabel = new javax.swing.JLabel();
        userScoreTitleLabel = new javax.swing.JLabel();
        slashLabel = new javax.swing.JLabel();
        maxScoreLabel = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        titleLabel.setText("Ryan's Quiz Questions");

        toResultsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toResultsButton.setText("...to Results Page");
        toResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayQuizResults(evt);
            }
        });

        questionTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionTitleLabel.setText("Question:");

        aLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aLabel.setText("Answer 1:");

        bLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bLabel.setText("Answer 2:");

        cLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cLabel.setText("Answer 3:");

        dLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dLabel.setText("Answer 4:");

        aField.setEditable(false);

        bField.setEditable(false);

        cField.setEditable(false);

        dField.setEditable(false);

        userAnswerLabel.setText("Your Answer: ");

        answerButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        answerButton.setText("Submit Answer");
        answerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonActionPerformed(evt);
            }
        });

        questionNumberTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionNumberTitleLabel.setText("Question #");

        questionNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        questionArea.setEditable(false);
        questionArea.setColumns(20);
        questionArea.setRows(5);
        jScrollPane1.setViewportView(questionArea);

        correctAnswerLabel.setText("Correct Answer: ");

        correctAnswerField.setEditable(false);

        messageLabel.setText("**message**");

        buttonGroup1.add(aRadioButton);
        aRadioButton.setText("answer1");

        buttonGroup1.add(bRadioButton);
        bRadioButton.setText("answer2");

        buttonGroup1.add(cRadioButton);
        cRadioButton.setText("answer3");

        buttonGroup1.add(dRadioButton);
        dRadioButton.setText("answer4");

        nextQuestionButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nextQuestionButton.setText("Next Question");
        nextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionButtonActionPerformed(evt);
            }
        });

        userScoreLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userScoreLabel.setText("0");

        userScoreTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userScoreTitleLabel.setText("Your Score:");

        slashLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        slashLabel.setText("/");

        maxScoreLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maxScoreLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(titleLabel)
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(correctAnswerField)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(correctAnswerLabel)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(messageLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(toResultsButton)
                                    .addComponent(nextQuestionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(questionNumberTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(questionNumberLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aLabel)
                                    .addComponent(bLabel)
                                    .addComponent(cLabel)
                                    .addComponent(dLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dField, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                                    .addComponent(cField)
                                    .addComponent(bField)
                                    .addComponent(aField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(questionTitleLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userAnswerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(dRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(answerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cRadioButton)
                                    .addComponent(bRadioButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(aRadioButton)
                                        .addGap(99, 99, 99)
                                        .addComponent(userScoreTitleLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(userScoreLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(slashLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(maxScoreLabel)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionNumberTitleLabel)
                    .addComponent(questionNumberLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionTitleLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLabel)
                    .addComponent(bField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cLabel)
                    .addComponent(cField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dLabel)
                    .addComponent(dField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userAnswerLabel)
                    .addComponent(aRadioButton)
                    .addComponent(userScoreLabel)
                    .addComponent(userScoreTitleLabel)
                    .addComponent(slashLabel)
                    .addComponent(maxScoreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dRadioButton)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(answerButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(correctAnswerLabel))
                            .addComponent(messageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toResultsButton)
                            .addComponent(correctAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nextQuestionButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayQuizResults(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayQuizResults

        new QuizResults(userScore).setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_displayQuizResults

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButtonActionPerformed

        nextQuestionButton.setEnabled(true);
        if ((aRadioButton.isSelected()) && (questions.get(questionNumbers[x]).getFirstChildElement("correctAnswer").getValue().equals("answer1"))) {
            messageLabel.setText("Correct!");
            userScore = userScore + 1;
        } else if ((bRadioButton.isSelected()) && (questions.get(questionNumbers[x]).getFirstChildElement("correctAnswer").getValue().equals("answer2"))) {
            messageLabel.setText("Correct!");
            userScore = userScore + 1;
        } else if ((cRadioButton.isSelected()) && (questions.get(questionNumbers[x]).getFirstChildElement("correctAnswer").getValue().equals("answer3"))) {
            messageLabel.setText("Correct!");
            userScore = userScore + 1;
        } else if ((dRadioButton.isSelected()) && (questions.get(questionNumbers[x]).getFirstChildElement("correctAnswer").getValue().equals("answer4"))) {
            messageLabel.setText("Correct!");
            userScore = userScore + 1;
        } else {
            messageLabel.setText("Sorry!");
        }

        maxScore = maxScore + 1;

        userScoreLabel.setText("" + userScore);
        maxScoreLabel.setText("" + maxScore);

        correctAnswerField.setText(questions.get(x).getFirstChildElement("correctAnswer").getValue());


    }//GEN-LAST:event_answerButtonActionPerformed

    private void nextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionButtonActionPerformed

        x = x + 1;

        //Allows the user to see their end results.
        if (maxScore == 10) {
            toResultsButton.setEnabled(true);
            nextQuestionButton.setEnabled(false);
            answerButton.setEnabled(false);
        } else {

            questionArea.setText(questions.get(questionNumbers[x]).getFirstChildElement("question").getValue());
            aField.setText(questions.get(questionNumbers[x]).getFirstChildElement("answer1").getValue());
            bField.setText(questions.get(questionNumbers[x]).getFirstChildElement("answer2").getValue());
            cField.setText(questions.get(questionNumbers[x]).getFirstChildElement("answer3").getValue());
            dField.setText(questions.get(questionNumbers[x]).getFirstChildElement("answer4").getValue());

            questionNumberLabel.setText("" + (x + 1));

            answerButton.setEnabled(true);

            correctAnswerField.setText(" ");
        }
    }//GEN-LAST:event_nextQuestionButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aField;
    private javax.swing.JLabel aLabel;
    private javax.swing.JRadioButton aRadioButton;
    private javax.swing.JToggleButton answerButton;
    private javax.swing.JTextField bField;
    private javax.swing.JLabel bLabel;
    private javax.swing.JRadioButton bRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cField;
    private javax.swing.JLabel cLabel;
    private javax.swing.JRadioButton cRadioButton;
    private javax.swing.JTextField correctAnswerField;
    private javax.swing.JLabel correctAnswerLabel;
    private javax.swing.JTextField dField;
    private javax.swing.JLabel dLabel;
    private javax.swing.JRadioButton dRadioButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel maxScoreLabel;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JToggleButton nextQuestionButton;
    private javax.swing.JTextArea questionArea;
    private javax.swing.JLabel questionNumberLabel;
    private javax.swing.JLabel questionNumberTitleLabel;
    private javax.swing.JLabel questionTitleLabel;
    private javax.swing.JLabel slashLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton toResultsButton;
    private javax.swing.JLabel userAnswerLabel;
    private javax.swing.JLabel userScoreLabel;
    private javax.swing.JLabel userScoreTitleLabel;
    // End of variables declaration//GEN-END:variables
}
