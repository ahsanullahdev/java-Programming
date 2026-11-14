/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author Ahsan Ullah
 */
public class Time {
    private int min;
    private int hrs;
    private int sec;
    public void setMint(int m)
    {
        min=m;
    }
    public void setHrs(int m)
    {
        hrs=m;
    }
    public void setSec(int m)
    {
        sec=m;
    }
    @Override
    public String toString()
    {
        return "Hrs : "+hrs+" Min : "+min+" Sec : "+sec+"\n";
    }
    
}
