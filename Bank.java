/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccountj;

import java.util.jar.Attributes.Name;

/**
 *
 * @author Ahsan Ullah
 */
public class Bank {
    private String name;
    private double semfee;
    public static double scholarShipRate = 20.0;
    
    public Bank(String name, double fee)
    {
        this.name = name;
        this.semfee = fee;
    }
    
     
    public void calculate()
    {
        double scholarship = (semfee + scholarShipRate)/100;
        System.out.println("Name : "+ name+ "Semfee :"+semfee +"Schorlarship : "+ scholarship);
    }
    
}
