/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pl.library.students;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jacek
 */
public class StudentAddView extends JFrame {

    private StudentAddController controller;
    private JFrame parentFrame;
    
    public StudentAddView(JFrame parentFrame) {
        initComponents();
        this.parentFrame = parentFrame;
        controller = new StudentAddController(this);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        super.setTitle("Add student");
        setStudentsAddViewComponents();
    }
    
    public void setStudentsAddViewComponents(){
        setjLabelBirthdate();
        setjLabelFirstName();
        setjLabelLastName();
        setjTextFieldFirstName();
        setjTextFieldLastName();
        setjButtonAdd();
        setjDateChooserBirthdate();
    }

    public void setjButtonAdd() {
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener((e) -> {
        clickButtonAdd();});
    }
    
    public void clickButtonAdd() {
        Student student = new Student();
        student.setFirstName(jTextFieldFirstName.getText());
        student.setLastName(jTextFieldLastName.getText());
        student.setBirthdate(formatData(jDateChooserBirthdate.getDate()));
        controller.addStudent(student);
    }
    
    private String formatData(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR) + "-" + formatMonth(calendar.get(Calendar.MONTH)) + 
                "-" + formatDay(calendar.get(Calendar.DAY_OF_MONTH));
    }
    
    private String formatMonth(int month){
        month++;
        if(month < 10) return "0"+month;
        return String.valueOf(month);
    }
    
    private String formatDay(int day){
        if(day < 10) return "0" + day;
        return String.valueOf(day);
    }

    public void setjLabelBirthdate() {
        jLabelBirthdate.setText("Birthdate:");
    }

    public void setjLabelFirstName() {
        jLabelFirstName.setText("First name:");
    }

    public void setjLabelLastName() {
        jLabelLastName.setText("Last name:");
    }

    public void setjTextFieldFirstName() {
        jTextFieldFirstName.setText("");
    }

    public void setjTextFieldLastName() {
        this.jTextFieldLastName.setText("");
    }

    public void setjDateChooserBirthdate() {
        jDateChooserBirthdate.getDateEditor().setEnabled(false);
    }
    
    
    
    @Override
    public void dispose() {
        controller.dispose();
        super.dispose();
    }

    public JFrame getParentFrame() {
        return parentFrame;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelBirthdate = new javax.swing.JLabel();
        jDateChooserBirthdate = new com.toedter.calendar.JDateChooser();
        jButtonAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelFirstName.setText("jLabel1");

        jTextFieldFirstName.setText("jTextField1");

        jLabelLastName.setText("jLabel1");

        jTextFieldLastName.setText("jTextField1");

        jLabelBirthdate.setText("jLabel1");

        jButtonAdd.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFirstName)
                            .addComponent(jLabelLastName)
                            .addComponent(jLabelBirthdate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBirthdate)
                    .addComponent(jDateChooserBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAdd)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private com.toedter.calendar.JDateChooser jDateChooserBirthdate;
    private javax.swing.JLabel jLabelBirthdate;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    // End of variables declaration//GEN-END:variables
}
