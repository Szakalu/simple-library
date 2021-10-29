/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.students;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pl.library.database.DatabaseHandler;
import pl.library.message.MessageHandler;

/**
 *
 * @author Jacek
 */
public class StudentsController {
    
    private final StudentsView view;

    protected StudentsController(StudentsView view) {
        this.view = view;
    }
    
    public void getStudents(String id, String firstName, String lastName){
       ArrayList<Student> students = new ArrayList<>();
       try{
           if(id.length() < 1){
                students = DatabaseHandler.getStudents(firstName, lastName);
           }
           else{
               if(isNumber(id)){
                    students = DatabaseHandler.getStudents(Integer.parseInt(id), firstName, lastName);
               }
               else{
                   MessageHandler.showWarningMessage(view, "Id must be a number", "Id error");
                   return;
               }
               
           }
       }catch(SQLException ex){
           MessageHandler.showStandardDatabaseErrorMessage(view);
           return;
       }
       
       if(students.size() < 1){
           MessageHandler.showInfoMessage(view, "No students to display", "");
           return;
       }
       removeRowsFromeTableView();
       displayStudentsOnView(students);
    }
    
    private boolean isNumber(String id){
        try{
            Integer.parseInt(id);
        }catch(NumberFormatException ex){
            return false;
        }
        return true;
    }
    private void removeRowsFromeTableView(){
        view.getDefaultTableModel().setRowCount(0);
    }
    
    private void displayStudentsOnView(ArrayList<Student> students){
        students.forEach(s -> {
            view.getDefaultTableModel().addRow(s.dataToArray());
        });
    }
    
    public void addStudent(){
        view.setEnabled(false);
        new StudentAddView(view).setVisible(true);
    }
    
    public void removeStudent(Student student, int row){
        int optionPaneResponse = MessageHandler.createYesNoOptionPane(view, 
                "Are you sure you want to delete student " + student.toString(), "Removing student");
        if (optionPaneResponse == JOptionPane.YES_OPTION) {
            int databaseResponse =  removeStudentFromDatabase(student);
            if(databaseResponse != 1) return;
            removeStudentFromTable(row);
        }
    }
    
    private int removeStudentFromDatabase(Student student){
        int response = DatabaseHandler.removeStudent(student.getId(), student.getFirstName(), student.getLastName());
        if(response == -1) MessageHandler.showWarningMessage(view, "Student does not exist in the database", "");
        else if(response == -2 ) MessageHandler.showStandardDatabaseErrorMessage(view);
        return response;
    }
    
    private void removeStudentFromTable(int row){
        view.getDefaultTableModel().removeRow(row);
    }
    
    public void chooseStudent(Student student){
        view.getParentFrame().setStudent(student);
        view.getParentFrame().setjLabelStudent();
        MessageHandler.showInfoMessage(view, "Selected student " + student.toStringFull(), "");
    }
    
    public void dispose(){
        view.getParentFrame().setEnabled(true);
    }
}
