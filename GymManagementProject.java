/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gymmanagementproject;

/**
 *
 * @author Tanis
 */
public class GymManagementProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Singlton conn = Singlton.getInstance();
        LoginFrame obj =new LoginFrame();
        obj.setVisible(true);
    }
}
