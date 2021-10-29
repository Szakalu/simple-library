/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.students;

import java.sql.SQLException;
import java.util.ArrayList;
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
           MessageHandler.showWarningMessage(view, "Database problem", "Database error");
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
    
    public void dispose(){
        view.getParentFrame().setEnabled(true);
    }
}
