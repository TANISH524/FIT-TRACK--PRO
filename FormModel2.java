package com.mycompany.gymmanagementproject;

public class FormModel2 {

    private int Id;
    private int MemberId;
    private String memberName;
    private String Date;    // Store as String or java.sql.Date depending on how you use it
    private String Status;

    // Constructor (you can overload this as needed)
    public FormModel2( int Id,int MemberId, String memberName, String Date, String Status) {
        this.Id=Id;
        this.MemberId = MemberId;
        this.memberName = memberName;
        this.Date = Date;
        this.Status = Status;
    }

    
    // Getters
    public int getID(){
        return Id;
    }

    public int getMemberId() {
        return MemberId;
    }

    public String getMemberName() {
        return memberName;
    }
    public String getDate() {
        return Date;
    }

    public String getStatus() {
        return Status;
    }

    
}
