/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.message;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageHandler {
    
    public static void showWarningMessage(JFrame parent, String messageText, String messageTitle){
        JOptionPane.showMessageDialog(parent, messageText, messageTitle, JOptionPane.WARNING_MESSAGE);
    }
    
    public static void showInfoMessage(JFrame parent, String messageText, String messageTitle){
        JOptionPane.showMessageDialog(parent, messageText, messageTitle, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showStandardDatabaseErrorMessage(JFrame parent){
        MessageHandler.showWarningMessage(parent, "Database problem", "Database Error");
    }
    
    public static int createYesNoOptionPane(JFrame parent, String messageText, String messageTitle){
        return JOptionPane.showConfirmDialog(parent, messageText, messageTitle, JOptionPane.YES_NO_OPTION);
    }
}
