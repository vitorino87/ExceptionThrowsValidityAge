/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionthrowsvalidityage;

/**
 *
 * @author tiago.lucas
 */
public class InvalidAgeException extends Exception{
    private final int age;
    InvalidAgeException(int a){
        age = a;
    }
    @Override
    public String toString(){
        return "Age: " +age+" is not a valid age";
    }
}
