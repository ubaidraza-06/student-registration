/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student_registration_management_system;

/**
 *
 * @author n tech
 */
public class Student_Registration_Management_System {

    public static void main(String[] args) {
         // Launch the login screen as the starting point
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
}
