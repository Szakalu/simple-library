package pl.library.students;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pl.library.message.MessageHandler;

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
    private DefaultTableModel model;
    
    public StudentsView(JFrame parentFrame) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.parentFrame = parentFrame;
        controller = new StudentsController(this);
        setStudentsViewComponents();
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
        setjTableStudents();
        setjButtonRemove();
        setjButtonChoose();
    }

    public void setjButtonAdd() {
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener((e) -> {
        clickButtonAdd();});
    }
    
    private void clickButtonAdd(){
        controller.addStudent();
    }
    
    private void setjButtonSearch() {
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener((e) -> {
            clickButtonSearch();});
    }
    
    private void clickButtonSearch() {
        controller.getStudents(jTextFieldId.getText(), jTextFieldFirstName.getText(), jTextFieldLastName.getText());
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
    
    public void setjTableStudents(){
        model = new DefaultTableModel(0,0);
        String [] header = new String [] {"Id", "First name", "Last name", "Birthdate"};
        model.setColumnIdentifiers(header);
        jTableStudents.setModel(model);
        jTableStudents.setDefaultEditor(Object.class, null);
        
    }

    public void setjButtonChoose() {
        jButtonChoose.setText("Choose");
        jButtonChoose.addActionListener((e) -> {
        clickButtonChoose();});
    }
    
    public void clickButtonChoose() {
        //TODO
        int row = jTableStudents.getSelectedRow();
        System.out.println("Choosing " + jTableStudents.getValueAt(row, 0) + " " + jTableStudents.getValueAt(row, 1) + 
                " " + jTableStudents.getValueAt(row, 2) + " " + jTableStudents.getValueAt(row, 3));
    } 

    public void setjButtonRemove() {
        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener((e) -> {
        clickButtonRemove();});
    }
    
    public void clickButtonRemove() {
        int row = jTableStudents.getSelectedRow();
        if(row == -1){
            MessageHandler.showWarningMessage(this, "Select student", "Select error");
            return;
        }
        controller.removeStudent(new Student((int) jTableStudents.getValueAt(row, 0), jTableStudents.getValueAt(row, 1).toString(), jTableStudents.getValueAt(row, 2).toString(),
        jTableStudents.getValueAt(row, 3).toString()), row);
        
    }
    
    public DefaultTableModel getDefaultTableModel(){
        return model;
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
        jTableStudents = new javax.swing.JTable();
        jPanelBottonBar = new javax.swing.JPanel();
        jButtonRemove = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonChoose = new javax.swing.JButton();

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
                    .addGroup(jPanelSearchLayout.createSequentialGroup()
                        .addComponent(jLabelLastName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelSearchLayout.createSequentialGroup()
                        .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                .addContainerGap())
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

        jTableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneStudents.setViewportView(jTableStudents);

        jButtonRemove.setText("jButton1");

        javax.swing.GroupLayout jPanelBottonBarLayout = new javax.swing.GroupLayout(jPanelBottonBar);
        jPanelBottonBar.setLayout(jPanelBottonBarLayout);
        jPanelBottonBarLayout.setHorizontalGroup(
            jPanelBottonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottonBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBottonBarLayout.setVerticalGroup(
            jPanelBottonBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottonBarLayout.createSequentialGroup()
                .addComponent(jButtonRemove)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jButtonAdd.setText("jButton1");

        jButtonChoose.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPaneStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBottonBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
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
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonChoose)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonChoose;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JPanel jPanelBottonBar;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JScrollPane jScrollPaneStudents;
    private javax.swing.JTable jTableStudents;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLastName;
    // End of variables declaration//GEN-END:variables
}
