/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author Ahsan Ullah
 */
public class Box <T extends Number>{
    private T item;
    public void set(T ref)
    {
        item=ref;
    }
    public T get()
    {
        return item;
    }
    
    
}
