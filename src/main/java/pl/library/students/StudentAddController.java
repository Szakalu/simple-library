/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.students;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import pl.library.message.MessageHandler;

/**
 *
 * @author Jacek
 */
public class StudentAddController {
    
    private StudentAddView view;

    public StudentAddController(StudentAddView view) {
        this.view = view;
    }
    
    public void dispose(){
        view.getParentFrame().setEnabled(true);
    }
    
    public void addStudent(Student student){
        if(!validateStudentData(student)) return;
        
        
    }
    
    private boolean validateStudentData(Student student){
        if(!validateStudentName(student.getFirstName(), "First name")) return false;
        else if(!validateStudentName(student.getLastName(), "Last name")) return false;
        else if(!validateStudentBirthdate(student.getBirthdate())) return false;
        
        return true;
    }
    
    private boolean validateStudentName(String name, String nameType){
        if(name.length() < 1){
            MessageHandler.showWarningMessage(view, nameType + " is to short", nameType + " error");
            return false;
        }
        for(int i = 0; i < name.length(); i++){
            if(!Character.isLetter(name.charAt(i)) && name.charAt(i) != ' '){
                MessageHandler.showWarningMessage(view, nameType + " must contains only letters and spaces", nameType + " error");
                return false;
            }
        }
        return true;
    }
    
    private boolean validateStudentBirthdate(String birthdate){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        Date date;
        try{
            date = format.parse(birthdate);
            calendar.setTime(date);
        }catch(ParseException ex){
            
        }
        if(calendar.get(Calendar.YEAR) < 1900){
            MessageHandler.showWarningMessage(view, "Pick correct birthdate", "Birthdate error");
            return false;
        }
        return true;
    }
    
}
