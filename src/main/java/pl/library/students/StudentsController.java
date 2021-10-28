/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.students;

/**
 *
 * @author Jacek
 */
public class StudentsController {
    
    private final StudentsView view;

    protected StudentsController(StudentsView view) {
        this.view = view;
    }
    
    public void dispose(){
        view.getParentFrame().setEnabled(true);
    }
}
