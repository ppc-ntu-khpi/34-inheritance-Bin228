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


/** 
 *
 * Hawk
 *
 * @param name  the name
 * @param weight  the weight
 * @param kind  the kind
 * @return public
 */
    public Hawk(String name, int weight, String kind) { 

        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }
    

/** 
 *
 * Hawk
 *
 * @return public
 */
    public Hawk() { 

        this("Frodo",6,"just a hawk");
    }
    

/** 
 *
 * Hawk
 *
 * @param name  the name
 * @return public
 */
    public Hawk(String name) { 

        this(name,6,"just a hawk");
    }
    

/** 
 *
 * Rest
 *
 */
    public void rest() { 

        System.out.println("Hawk is rest");
    }
    

/** 
 *
 * Fly
 *
 */
    public void fly() { 

        System.out.println("Hawk is fly");
    }
    
    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Hawk hunting for a snake");
    }

    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Karr!");
    }
    
    @Override

/** 
 *
 * Saved
 *
 */
    public void saved() { 

        System.out.println("Hawk run away from hunters");
    }
    
    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Hawk eats meat");
    }
    
    @Override

/** 
 *
 * Search
 *
 */
    public void search() { 

        System.out.println("Hawk is search");
    }
    
    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString()+"\nKind:\t"+this.kind+"\nThis is hawk!";
    }
    
}
