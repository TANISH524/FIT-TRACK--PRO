/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymmanagementproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Tanis
 */
public class Singlton {
     Connection connection = null;
    
    private static Singlton singletonClass = null;
    
    private Singlton(){
        //jdbc:mysql://localhost:3306/gymmangement?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
        
      try{
          //final_gym_management
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_gym_management","root","");
      System.out.println("Database Connectec!");
      if(connection!=null){
          
          String Members = "CREATE TABLE IF NOT EXISTS Members(id INT AUTO_INCREMENT, Name varchar(225), Age varchar(225), Number varchar(225), Address varchar(225), StartDate varchar(225),EndDate varchar(225),Payment varchar(225),PRIMARY KEY(id))";
         PreparedStatement ps = connection.prepareStatement(Members);
         ps.execute();
          
      }
     String Attendancesheet = "CREATE TABLE IF NOT EXISTS Attendancesheet(id INT AUTO_INCREMENT, MemberId INT,memberName VARCHAR(30), Date VARCHAR(255), Status VARCHAR(50), PRIMARY KEY(id), FOREIGN KEY(MemberId) REFERENCES Members(id) ON DELETE CASCADE ON UPDATE CASCADE)";


                        
    PreparedStatement ps2 = connection.prepareStatement(Attendancesheet);
    ps2.execute();
      }catch(SQLException exception){
          System.out.println("SQLException :"+exception);
      }
    
    }
    
    public static Singlton getInstance(){
    if(singletonClass == null){
        singletonClass = new Singlton();
    }
    return singletonClass;
        
    }
}
