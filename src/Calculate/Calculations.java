/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculate;

/**
 *
 * @author Trenton Thompson
 */
public class Calculations {
    
    public static double calculateBudget(double rent, double utilities, double groceries, double fuel, double entertainment,
            double carPayment, double carInsurance, double misc, double phone, double cable, double internet, double creditcard,
            double dining, double savings, double investments, double supplies, double clothing, double personal){
       
       
     double budget = (rent + utilities + groceries + fuel + entertainment + carPayment + carInsurance + misc + phone + cable + internet + creditcard + dining + savings + investments + supplies + clothing + personal);
     return budget;
    }
    
    
}

