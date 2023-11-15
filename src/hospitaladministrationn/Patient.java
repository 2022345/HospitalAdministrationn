/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladministrationn;

/**
 *
 * @author suele
 */
public class Patient {
    
      /*
    Name
    Date of Birth
    Blood Type
    ID
    */
    
   private String name;
   private String birthDate;
   private String bloodType;
   private int patientID;
   
   //Static means its a class variable
   // It's shared by ALL the objects of this class
   
   private static int currentID = 1;

    public Patient(String name, String birthDate, String bllodType) {
        this.name = name;
        this.birthDate = birthDate;
        this.bloodType = bloodType;
        this.patientID = currentID;
        
        System.out.println(name + "has birthday on" + birthDate);
        currentID++;
    }
        
        public static int getCurrentID(){
            return currentID;
        }
    

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}

    

