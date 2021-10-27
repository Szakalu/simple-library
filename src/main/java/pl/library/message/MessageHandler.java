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
}
