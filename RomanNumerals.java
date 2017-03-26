/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumerals;

/**
 *
 * @author root
 */
public class RomanNumerals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //TESTING HERE
        Roman test=new Roman(47);
        System.out.println(test.getNumber());
        System.out.println("Even? "+test.isEven);
        System.out.println("Prime? "+test.isPrime);
        
        System.out.println(); //skip a line
        
        Arabic test2=new Arabic("XLVII");
        System.out.println(test2.getNumber());
        System.out.println("Even? "+test2.isEven);
        System.out.println("Prime? "+test2.isPrime);
    }
    
}
