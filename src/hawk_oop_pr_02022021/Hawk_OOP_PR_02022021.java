/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hawk_oop_pr_02022021;

import domain.Hawk;

/**
 *
 * @author vipbi
 */
public class Hawk_OOP_PR_02022021 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 

        // TODO code application logic here
        Hawk hawk = new Hawk("Marlin");
        System.out.println(hawk);
        System.out.println("......");
        hawk.attacks();
        hawk.saved();
        hawk.speak();
        hawk.fly();
        hawk.search();
        hawk.hunt();
        hawk.eat();
        hawk.rest();
        hawk.toString();
        
    }
}
