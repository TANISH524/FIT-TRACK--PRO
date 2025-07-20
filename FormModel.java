/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gymmanagementproject;

/**
 *
 * @author Tanis
 */
public class FormModel {

    private int id;
    private String Name;
    private String Age;
    private String Number;
    private String Address;
    private String StartDate;
    private String EndDate;
    private String Payment;
    

    public FormModel(int id, String Name, String Age, String Number, String Address,String StartDate,String EndDate,String Payment) {
        this.id =id;
        this.Name = Name;
        this.Age= Age;
        this.Number = Number;
        this.Address = Address;
         this.StartDate = StartDate;
          this.EndDate = EndDate;
           this.Payment = Payment;
        
    }
    int getId(){
        return id;
    }

    String getName() {
        return Name;
    }

    String getAge() {
        return Age;
    }

    String getNumber() {
        return Number;
    }

    String getAddress() {
        return Address;
    }
String getStartDate() {
        return StartDate;
    }
String getEndDate() {
        return EndDate;
    }
String getPayment() {
        return Payment;
    }


}
