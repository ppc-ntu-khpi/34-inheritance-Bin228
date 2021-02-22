/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author vipbi
 */
public class Hawk extends Predator {
    
    private String kind;

    public Hawk(String name, int weight, String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }
    
    public Hawk() {
        this("Frodo",6,"just a hawk");
    }
    
    public Hawk(String name) {
        this(name,6,"just a hawk");
    }
    
    public void rest() {
        System.out.println("Hawk is rest");
    }
    
    public void fly() {
        System.out.println("Hawk is fly");
    }
    
    @Override
    public void hunt() {
        System.out.println("Hawk hunting for a snake");
    }

    @Override
    public void speak() {
        System.out.println("Karr!");
    }
    
    @Override
    public void saved() {
        System.out.println("Hawk run away from hunters");
    }
    
    @Override
    public void eat() {
        System.out.println("Hawk eats meat");
    }
    
    @Override
    public void search() {
        System.out.println("Hawk is search");
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\nThis is hawk!";
    }
    
}
