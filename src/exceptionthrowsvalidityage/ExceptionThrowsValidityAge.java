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
public class ExceptionThrowsValidityAge {

    /**
     * @param args the command line arguments
     */
    static void checkAge(int age)throws InvalidAgeException{
        System.out.println("Checking Age Validaty: ("+age+")");
        if(age<0||age>150)
            throw new InvalidAgeException(age);
        System.out.println("Age: "+age+" is a valid age");
    }
    public static void main(String[] args) throws InvalidAgeException{
        // TODO code application logic here
        try{
            checkAge(25);
            checkAge(-5);
        }
        catch(InvalidAgeException e){
            System.out.println("Caught: "+e);
        }
    }
    
}
