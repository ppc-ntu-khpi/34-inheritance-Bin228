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
public class Animal {
    
    protected String name;
    protected int weight;

    public Animal() {
        name="generic animal";
        weight=10;
    }
    
    public void saved() {
        System.out.println("Animal run away from hunters");
    }
    
    public void attacks() {
        System.out.println("The animal attacks the enemy");
    }
    
    public void eat() {
        System.out.println("Animal eating");
    }
    
    public void speak() {
        System.out.println("Animal speaking");
    }
    
    @Override
    public String toString() {
        return "Animal:" + "\nName:\t" + name + "\nWeight:\t" + weight+"kg";
    }
    
}
