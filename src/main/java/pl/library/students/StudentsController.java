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
       ArrayList<Student> students;
       try{
            students = DatabaseHandler.getStudents(Integer.parseInt(id), firstName, lastName);
       }catch(SQLException ex){
           MessageHandler.showWarningMessage(view, "Database problem", "Database error");
           ex.printStackTrace();
           return;
       }
       if(students.size() < 1){
           MessageHandler.showInfoMessage(view, "No students to display", "");
           return;
       }
       removeRowsFromeTableView();
       displayStudentsOnView(students);
    }
    
    public void removeRowsFromeTableView(){
        view.getDefaultTableModel().setRowCount(0);
    }
    
    public void displayStudentsOnView(ArrayList<Student> students){
        for(Student s: students){
            view.getDefaultTableModel().addRow(s.dataToArray());
        }
    }
    
    public void dispose(){
        view.getParentFrame().setEnabled(true);
    }
}
