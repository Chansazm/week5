/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MscGroupProject;

import GUI.HRApp;

/**
 *
 * @author husseinzahran
 */
public class Main {

    public static EmployeeList employeeList;

    /**
     *
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employeeList = new EmployeeList();
        new HRApp().setVisible(true);
    }
    
}
