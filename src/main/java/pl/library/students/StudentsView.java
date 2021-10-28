package pl.library.students;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Jacek
 */
public class StudentsView extends JFrame {

    private final StudentsController controller;
    private final JFrame parentFrame;
    
    public StudentsView(JFrame parentFrame) {
        initComponents();
        this.parentFrame = parentFrame;
        controller = new StudentsController(this);
    }
    
    public void setStudentsViewComponents(){
        setjButtonAdd();
        setjButtonSearch();
        setjLabelFirstName();
        setjLabelId();
        setjLabelLastName();
        setjTextFieldFirstName();
        setjTextFieldId();
        setjTextFieldLastName();
    }

    public void setjButtonAdd() {
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener((e) -> {
        clickButtonAdd();});
    }
    
    private void clickButtonAdd(){
        //TODO
    }
    
    private void setjButtonSearch() {
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener((e) -> {
            clickButtonSearch(jButtonSearch);});
    }
    
    private void clickButtonSearch(JButton jButtonSearch) {
        //TODO
    }

    private void setjLabelFirstName() {
        jLabelFirstName.setText("First name");
    }

    private void setjLabelId() {
        jLabelId.setText("Id");
    }

    private void setjLabelLastName() {
        jLabelLastName.setText("Last name");
    }

    public void setjTextFieldFirstName() {
        jTextFieldFirstName.setText("");
    }

    public void setjTextFieldId() {
        jTextFieldId.setText("");
    }

    public void setjTextFieldLastName() {
        jTextFieldLastName.setText("");
    }

    public JFrame getParentFrame() {
        return parentFrame;
    }

    public JButton getjButtonAdd() {
        return jButtonAdd;
    }

    public JButton getjButtonSearch() {
        return jButtonSearch;
    }

    public JLabel getjLabelFirstName() {
        return jLabelFirstName;
    }

    public JLabel getjLabelId() {
        return jLabelId;
    }

    public JLabel getjLabelLastName() {
        return jLabelLastName;
    }

    public JTextField getjTextFieldFirstName() {
        return jTextFieldFirstName;
    }

    public JTextField getjTextFieldId() {
        return jTextFieldId;
    }

    public JTextField getjTextFieldLastName() {
        return jTextFieldLastName;
    }

    @Override
    public void dispose() {
        controller.dispose();
        super.dispose(); 
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelSearch = new javax.swing.JPanel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jScrollPaneStudents = new javax.swing.JScrollPane();
        jPanelBottonBar = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelId.setText("jLabel1");

        jTextFieldId.setText("jTextField1");

        jTextFieldFirstName.setText("jTextField1");

        jLabelFirstName.setText("jLabel1");

        jTextFieldLastName.setText("jTextField1");

        jLabelLastName.setText("jLabel2");

        jButtonSearch.setText("jButton1");

        javax.swing.GroupLayout jPanelSearchLayout = new javax.swing.GroupLayout(jPanelSearch);
        jPanelSearch.setLayout(jPanelSearchLayout);
        jPanelSearchLayout.setHorizontalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId))
                .addGap(18, 18, 18)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFirstName))
                .addGap(18, 18, 18)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLastName)
                    .addGroup(jPanelSearchLayout.createSequentialGroup()
                        .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSearchLayout.setVerticalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jLabelFirstName)
                    .addComponent(jLabelLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBottonBarLayout = new javax.swing.GroupLayout(jPanelBottonBar);
        jPanelBottonBar.setLayout(jPanelBottonBarLayout);
        jPanelBottonBarLayout.setHorizontalGroup(
            jPanelBottonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );
        jPanelBottonBarLayout.setVerticalGroup(
            jPanelBottonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jButtonAdd.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPaneStudents)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBottonBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBottonBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JPanel jPanelBottonBar;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JScrollPane jScrollPaneStudents;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLastName;
    // End of variables declaration//GEN-END:variables
}
