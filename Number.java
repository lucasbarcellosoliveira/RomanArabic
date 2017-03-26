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
public interface Number {
    void setNumber(String n); //sets number if n is roman
    void setNumber(int n); //sets number if n is arabic
    String getNumber(); //returns number as a string
};
