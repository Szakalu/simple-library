/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pl.library.categories;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import pl.library.students.Student;
import pl.library.user.User;
/**
 *
 * @author Jacek
 */
public class CategoriesView extends JFrame {

    private final User user;
    private final CategoriesController controller;
    private Student student;
    
    public CategoriesView(User user) {
        initComponents();
        this.controller = new CategoriesController(this);
        this.user = user;
        super.setTitle("Categories");
        setCategoriesViewComponents();
    }

    private void setCategoriesViewComponents(){
        setJButtonLogout();
        setJLabelUser();
        setjLabelStudent();
        setJButtonBooks();
        setJButtonStudents();
        setJButtonBorrows();
    }
    
    private void setJButtonLogout(){
        jButtonLogout.setText("Logout");
        jButtonLogout.addActionListener((e) -> {clickButtonLogout();});
    }
    
    private void clickButtonLogout(){
        controller.logout();
    }
    
    private void setJLabelUser(){
        jLabelUser.setText("User: Id: " + user.getId() + " Name: " + user.getUsername());
    }
    
    private void setJButtonBooks(){
        jButtonBooks.setText("Books");
        jButtonBooks.addActionListener((e) -> {clickButtonBooks();});
    }
    
    private void clickButtonBooks(){
        //TODO
    }
    
    private void setJButtonStudents(){
        jButtonStudents.setText("Students");
        jButtonStudents.addActionListener((e) -> {
        clickButtonStudents();});
    }
    
    private void clickButtonStudents(){
        controller.students();
    }
    
    private void setJButtonBorrows(){
        jButtonBorrows.setText("Borrows");
        jButtonBorrows.addActionListener((e) -> {
        clickButtonBorrows();});
    }
    
    private void clickButtonBorrows(){
        //TODO
    }

    public void setjLabelStudent() {
        if(student == null) jLabelStudent.setText("Chosen student: NoN");
        else jLabelStudent.setText("Chosen student: " + student.toStringFull());
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public JButton getjButtonBooks() {
        return jButtonBooks;
    }

    public JButton getjButtonBorrows() {
        return jButtonBorrows;
    }

    public JButton getjButtonLogout() {
        return jButtonLogout;
    }

    public JButton getjButtonStudents() {
        return jButtonStudents;
    }

    public JLabel getjLabelUser() {
        return jLabelUser;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLogout = new javax.swing.JButton();
        jButtonBorrows = new javax.swing.JButton();
        jButtonStudents = new javax.swing.JButton();
        jLabelUser = new javax.swing.JLabel();
        jButtonBooks = new javax.swing.JButton();
        jLabelStudent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonLogout.setText("jButton1");

        jButtonBorrows.setText("jButton1");

        jButtonStudents.setText("jButton1");

        jLabelUser.setText("jLabel1");

        jButtonBooks.setText("jButton1");

        jLabelStudent.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 136, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jButtonBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBorrows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(164, 164, 164))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelStudent)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogout)
                    .addComponent(jLabelUser))
                .addGap(29, 29, 29)
                .addComponent(jButtonStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBorrows, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jLabelStudent)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBooks;
    private javax.swing.JButton jButtonBorrows;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonStudents;
    private javax.swing.JLabel jLabelStudent;
    private javax.swing.JLabel jLabelUser;
    // End of variables declaration//GEN-END:variables
}
