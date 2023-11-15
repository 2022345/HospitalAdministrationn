/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitaladministrationn;

import java.sql.SQLException;



/**
 *
 * @author suele
 */
public class HospitalAdministrationn {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // TODO code application logic here
        
     
        
        Patient p1 = new Patient ("Sam", "2023-11-15", "O+");
        Patient p2 = new Patient ("Lexie", "2021-11-27", "A-");
        
        System.out.println(p1.getPatientID());
        System.out.println(p2.getPatientID());
        
        System.out.println(Patient.getCurrentID());
        
       if  (DatabaseSetup.setupDB()){
           System.out.println("Database and table created");
       }else{
           System.out.println("On no! There was a database creation problem...");
       }
       
       DatabaseWriter dbw = new DatabaseWriter();
       if (dbw.addPatient (p1)){
           System.out.println("p1 added");
       }
        
    }
}
    

