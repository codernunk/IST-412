/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atm;

/**
 *
 * @author Jesse
 */
public class LoginScreen extends javax.swing.JFrame {

    public final int PIN_LENGTH = 4;
    
    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
    }

    /**
     * Appends the specified digit to the PIN number string.
     * @param digit 
     */
    private void enterDigit(String digit)
    {
        if (jtfPin.getPassword().length < PIN_LENGTH)
        {
            //jtfPin.setText(jtfPin.getPassword().toString()+digit);  
            jtfPin.setText(jtfPin.getText()+digit);
        }
    }
    
    /**
     * Checks to see if the PIN exists.
     * @return 
     */
    private boolean validatePIN()
    {
        // Will implement later after we wire a database.
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitle = new javax.swing.JLabel();
        jlAction = new javax.swing.JLabel();
        jbtOne = new javax.swing.JButton();
        jbtTwo = new javax.swing.JButton();
        jbtThree = new javax.swing.JButton();
        jbtFour = new javax.swing.JButton();
        jbtFive = new javax.swing.JButton();
        jbtSix = new javax.swing.JButton();
        jbtSeven = new javax.swing.JButton();
        jbtEight = new javax.swing.JButton();
        jbtNine = new javax.swing.JButton();
        jbtClear = new javax.swing.JButton();
        jbtConfirm = new javax.swing.JButton();
        jbtZero = new javax.swing.JButton();
        jtfPin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(0, 102, 0));
        jlTitle.setText("ATM");

        jlAction.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlAction.setText("Please enter your PIN number:");

        jbtOne.setText("1");
        jbtOne.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtOne.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtOne.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOneActionPerformed(evt);
            }
        });

        jbtTwo.setText("2");
        jbtTwo.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtTwo.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtTwo.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTwoActionPerformed(evt);
            }
        });

        jbtThree.setText("3");
        jbtThree.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtThree.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtThree.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThreeActionPerformed(evt);
            }
        });

        jbtFour.setText("4");
        jbtFour.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtFour.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtFour.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFourActionPerformed(evt);
            }
        });

        jbtFive.setText("5");
        jbtFive.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtFive.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtFive.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFiveActionPerformed(evt);
            }
        });

        jbtSix.setText("6");
        jbtSix.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtSix.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtSix.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSixActionPerformed(evt);
            }
        });

        jbtSeven.setText("7");
        jbtSeven.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtSeven.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtSeven.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSevenActionPerformed(evt);
            }
        });

        jbtEight.setText("8");
        jbtEight.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtEight.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtEight.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEightActionPerformed(evt);
            }
        });

        jbtNine.setText("9");
        jbtNine.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtNine.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtNine.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNineActionPerformed(evt);
            }
        });

        jbtClear.setText("c");
        jbtClear.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtClear.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtClear.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClearActionPerformed(evt);
            }
        });

        jbtConfirm.setText("*");
        jbtConfirm.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtConfirm.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtConfirm.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConfirmActionPerformed(evt);
            }
        });

        jbtZero.setText("0");
        jbtZero.setMaximumSize(new java.awt.Dimension(50, 50));
        jbtZero.setMinimumSize(new java.awt.Dimension(50, 50));
        jbtZero.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtZeroActionPerformed(evt);
            }
        });

        jtfPin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlAction))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jlTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtZero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtFour, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtFive, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtSix, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtOne, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtThree, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtEight, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtNine, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtfPin))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAction)
                .addGap(18, 18, 18)
                .addComponent(jtfPin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtOne, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtThree, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtFour, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtFive, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSix, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtEight, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtNine, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtZero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmActionPerformed
        if (validatePIN())
        {
            this.dispose();
            new MainScreen().setVisible(true);
        }
    }//GEN-LAST:event_jbtConfirmActionPerformed

    private void jbtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtClearActionPerformed
        jtfPin.setText("");
    }//GEN-LAST:event_jbtClearActionPerformed

    private void jbtOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOneActionPerformed
        enterDigit("1");
    }//GEN-LAST:event_jbtOneActionPerformed

    private void jbtTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTwoActionPerformed
        enterDigit("2");
    }//GEN-LAST:event_jbtTwoActionPerformed

    private void jbtThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThreeActionPerformed
        enterDigit("3");
    }//GEN-LAST:event_jbtThreeActionPerformed

    private void jbtFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFourActionPerformed
        enterDigit("4");
    }//GEN-LAST:event_jbtFourActionPerformed

    private void jbtFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFiveActionPerformed
        enterDigit("5");
    }//GEN-LAST:event_jbtFiveActionPerformed

    private void jbtSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSixActionPerformed
        enterDigit("6");
    }//GEN-LAST:event_jbtSixActionPerformed

    private void jbtSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSevenActionPerformed
        enterDigit("7");
    }//GEN-LAST:event_jbtSevenActionPerformed

    private void jbtEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEightActionPerformed
        enterDigit("8");
    }//GEN-LAST:event_jbtEightActionPerformed

    private void jbtNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNineActionPerformed
        enterDigit("9");
    }//GEN-LAST:event_jbtNineActionPerformed

    private void jbtZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtZeroActionPerformed
        enterDigit("0");
    }//GEN-LAST:event_jbtZeroActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtClear;
    private javax.swing.JButton jbtConfirm;
    private javax.swing.JButton jbtEight;
    private javax.swing.JButton jbtFive;
    private javax.swing.JButton jbtFour;
    private javax.swing.JButton jbtNine;
    private javax.swing.JButton jbtOne;
    private javax.swing.JButton jbtSeven;
    private javax.swing.JButton jbtSix;
    private javax.swing.JButton jbtThree;
    private javax.swing.JButton jbtTwo;
    private javax.swing.JButton jbtZero;
    private javax.swing.JLabel jlAction;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPasswordField jtfPin;
    // End of variables declaration//GEN-END:variables
}