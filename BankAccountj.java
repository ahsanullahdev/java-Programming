/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccountj;

/**
 *
 * @author Ahsan Ullah
 */
public class BankAccountj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank obj = new Bank("Ahsan Ullah", 7800.0);
        obj.calculate();
        Bank obj2 = new Bank("Abdullah", 7800.0);
        Bank.scholarShipRate = 15.0;
        obj2.calculate();
    }
    
}
