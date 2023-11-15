/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitaladministrationn;

/**
 *
 * @author suele
 */
public class HospitalAdministrationn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Patient p1 = new Patient ("Sam", "15/11/23", "O+");
        Patient p2 = new Patient ("Lexie", "27/11/21", "A-");
        
        System.out.println(p1.getPatientID());
        System.out.println(p2.getPatientID());
        
        System.out.println(Patient.getCurrentID());
       if  (DatabaseSetup.setupDB){
           System.out.println("Database and table created");
       }else{
           System.out.println("On no! There was a database creation problem...");
       }
        
    }
    
}
