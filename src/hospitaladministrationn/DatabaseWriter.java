/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladministrationn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author suele
 */
public class DatabaseWriter extends Database{
    
     public boolean addPatient(Patient patient){
          try(
                
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement ();
            ){
              
              String sql = String.format("INSERT INTO " + TABLE_NAME + " VALUES ("
                      +"'%s', '%s', '%s', %d);",
      patient.getName(), patient.getBirthDate(), patient.getBloodType(), patient.getPatientID());
              
              stmt.execute(sql);
              return true;
          }catch (Exception e){
              e.printStackTrace();
              return false;
     }
     }
    public boolean addAllPatients(List<Patient> patientList){
        return true;
        
    }
    
}
