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


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        name="generic animal";
        weight=10;
    }
    

/** 
 *
 * Saved
 *
 */
    public void saved() { 

        System.out.println("Animal run away from hunters");
    }
    

/** 
 *
 * Attacks
 *
 */
    public void attacks() { 

        System.out.println("The animal attacks the enemy");
    }
    

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Animal eating");
    }
    

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Animal speaking");
    }
    
    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "Animal:" + "\nName:\t" + name + "\nWeight:\t" + weight+"kg";
    }
    
}
