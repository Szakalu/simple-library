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
import pl.library.database.DatabaseHandler;
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
        
        int responseCode = DatabaseHandler.addStudent(student.getFirstName(), student.getLastName(), student.getBirthdate());
        if(responseCode > 0){
            MessageHandler.showInfoMessage(view, "New student " + student.toString() + " added to database", "Student added");
            view.dispose();
        }
        else if(responseCode == -1){
            MessageHandler.showWarningMessage(view, "Somthing goes wrong", "Adding student error");
        }
        else if(responseCode == -2){
            MessageHandler.showWarningMessage(view, "Database problem", "Database error");
        }
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
        if(!validateStudentBirthdateMin(calendar)){
            MessageHandler.showWarningMessage(view, "Pick correct birthdate", "Birthdate error");
            return false;
        }
        else if(!validateStudentBirthdateMax(calendar)){
            MessageHandler.showWarningMessage(view, "Pick correct birthdate", "Birthdate error");
            return false;
        }
        
        return true;
    }
    
    private boolean validateStudentBirthdateMin(Calendar birthdate){
        return birthdate.get(Calendar.YEAR) >= 1900;
    }
    
    private boolean validateStudentBirthdateMax(Calendar calendar){
        int birthdateYear = calendar.get(Calendar.YEAR);
        int birthdateMonth = calendar.get(Calendar.MONTH);
        int birthdateDay = calendar.get(Calendar.DAY_OF_MONTH);
        
        calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR) + " " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.DAY_OF_MONTH) + " " + 
                birthdateYear + " " + birthdateMonth + " " + birthdateDay);
        if(calendar.get(Calendar.YEAR) < birthdateYear) return false;
        else if(calendar.get(Calendar.YEAR) <= birthdateYear && calendar.get(Calendar.MONTH) < birthdateMonth) return false;
        else if(calendar.get(Calendar.YEAR) <= birthdateYear && calendar.get(Calendar.MONTH) <= birthdateMonth 
                && calendar.get(Calendar.DAY_OF_MONTH) < birthdateDay) return false;
        return true;
    }
}
