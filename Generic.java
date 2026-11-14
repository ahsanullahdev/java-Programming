/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic;

/**
 *
 * @author Ahsan Ullah
 */
public class Generic {

    /**
     *  Generic Class Practice
     */
    public static void main(String[] args) {
        Box<String> obj = new Box();
        obj.set("Ahsan Ullah");
        System.out.printf("%s\n",obj.get());
        Box<Integer> obj1 = new Box();
        obj1.set(12);
        System.out.printf("%d\n",obj1.get());
        Box<Double> ref = new Box();
        Time t=new Time();
        t.setHrs(12);
        t.setMint(55);
        t.setSec(45);
        System.out.printf("%s",t);
        Box<Time> h2 = new Box<Time>();
        h2.set(t);
        System.out.printf("%s",h2.get());
Pair<Integer,String> a = new Pair<>(123,"Ahsan Ullah");
        System.out.printf("%d %s\n",a.getKey(),a.getValue());
        Pair<String,String> b = new Pair<>("sp25","Ahsan Ullah");
        System.out.printf("%s %s\n",b.getKey(),b.getValue());

         
    }
    
}
