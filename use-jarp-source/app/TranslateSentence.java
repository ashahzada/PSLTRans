/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import edu.stanford.nlp.trees.Tree;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.OutputStream;
import java.io.PrintStream;
import static app.Nlp4.getDependencies;

/**
 *
 * @author Rehman
 */
public class TranslateSentence extends javax.swing.JFrame {

    /**
     * Creates new form PrintTree
     */
    public TranslateSentence() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        if(!Preferences.preferencesInitialized){
            Preferences.setUserPreferences();
        }
        if(MyUtils.verbs.size()==0){
            MyUtils.initializeVerbsHashtable();
            System.out.println("Verb entries ="+MyUtils.verbs.size());
        }
        if(MyUtils.rules.size()==0){
            MyUtils.readRulesFile();
            System.out.println(MyUtils.rules.size()+" rules found.");
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txpTree1 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txpRules = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txpTree2 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txpTranslatedSentence = new javax.swing.JTextPane();
        btnTranslate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Translate Sentence");

        jPanel1.setBackground(new java.awt.Color(182, 207, 164));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 580));

        txpTree1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(txpTree1);

        txpRules.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane5.setViewportView(txpRules);

        txpTree2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(txpTree2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("English Tree:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Grammar Rules Applied During Translation:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("PSL Tree:");

        txpTranslatedSentence.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(txpTranslatedSentence);

        btnTranslate.setBackground(new java.awt.Color(201, 201, 121));
        btnTranslate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTranslate.setText("Translate");
        btnTranslate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranslateActionPerformed(evt);
            }
        });

        txa1.setColumns(20);
        txa1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txa1.setRows(5);
        jScrollPane1.setViewportView(txa1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Input Sentence:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTranslate, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnTranslate)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(475, 475, 475))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTranslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranslateActionPerformed
        // TODO add your handling code here:
        // make all writes to the System.err stream silent (done to remove stanford log output)
        PrintStream err = System.err;
        System.setErr(new PrintStream(new OutputStream() {
            public void write(int b) {
            }
        }));

        String str = txa1.getText();
        Nlp4 parser = new Nlp4(); 
        Tree tree = parser.parse(str);
        String treeOutput=tree.toString();
        System.out.println("Stanford Tree output:\n"+treeOutput+"\n");
        
        //treeOutput=removeUnwantedWords(treeOutput);
        //System.out.println("After Removal:\n"+treeOutput+"\n");
        String str2 = str.replace("?", ""); // remove question mark if any (dependency tool correction)
        String dep= getDependencies(str2);
        System.out.println(dep);
        
        MyTree tree3= MyUtils.constructAnnotatedTree(treeOutput,dep);
        tree3.printTree();
        
        MyList list = MyUtils.constructAnnotatedList(treeOutput, dep);
        
        MyUtils.printTense(str, tree3);
        //tree3.printTreeDiagramToFile(str);
        MyUtils.renameTree(str, tree3);
        
        String diagram = tree3.getTreeDiagram();
        MyUtils.grammarRules = "";
        MyUtils.prepareGrammarRuleString = true;
        int type = MyUtils.getSentenceStructureType(list);
        if(type==1){
            MyUtils.constructPSLTree(tree3);
            String output = tree3.toString();
            if(str.contains("?")){
                output+="?";
            }else{
                output+=".";
            }
            String tree2Diagram = tree3.getTreeDiagram();
            txpTree2.setText(tree2Diagram);
            txpTranslatedSentence.setText(output);
        }else{
            MyTree treeForCompound = MyUtils.constructAnnotatedTree(treeOutput, dep);
            String output = MyUtils.translate(str, treeForCompound, list);
            txpTree2.setText(MyUtils.pslTreeComplex);
            txpTranslatedSentence.setText(output);
        }
        txpTree1.setText(diagram);
        txpRules.setText(MyUtils.grammarRules);
        MyUtils.prepareGrammarRuleString = false;
        
        // set error to normal again
        System.setErr(err); 
    }//GEN-LAST:event_btnTranslateActionPerformed

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
            java.util.logging.Logger.getLogger(TranslateSentence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TranslateSentence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TranslateSentence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TranslateSentence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TranslateSentence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTranslate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txa1;
    private javax.swing.JTextPane txpRules;
    private javax.swing.JTextPane txpTranslatedSentence;
    private javax.swing.JTextPane txpTree1;
    private javax.swing.JTextPane txpTree2;
    // End of variables declaration//GEN-END:variables
}
