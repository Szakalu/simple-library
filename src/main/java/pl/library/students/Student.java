/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.students;

/**
 *
 * @author Jacek
 */
public class Student {
    
    private int id;
    private String firstName;
    private String lastName;
    private String birthdate;

    public Student() {
    }
    
    public Student(int id, String firstName, String lastName, String birthdate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }
    
    public Object [] dataToArray(){
        return new Object [] {id, firstName, lastName, birthdate};
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + birthdate;
    }
    
    public String toStringFull() {
        return id + " " + firstName + " " + lastName + " " + birthdate;
    }
    
    
    
}
