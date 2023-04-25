/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstswitch;

import java.util.Scanner;

/**
 *
 * @author niska pillay
 */
public class FirstSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        --switch --reserved keyword and starts the switch logic
        --case--iterates through different options 
        --break--only allows 1 optionto be chosen 
        --default--handles invalid entries 
        */
        
        Scanner kb = new Scanner(System.in);//obj
        int year; // variable 
        
        System.out.println("Enter the year:");
        year = kb.nextInt();
        
        //calcs && testing 
        switch(year%12)
        {
            case 0 :System.out.println("Year of the monkey");break;
            case 1 :System.out.println("Year of the rooster");break;
            case 2 :System.out.println("Year of the dog");break;
            case 3 :System.out.println("Year of the pig");break;
            case 4 :System.out.println("Year of the rat");break;
            case 5 :System.out.println("Year of the ox");break;
            case 6 :System.out.println("Year of the tigar");break;
            case 7 :System.out.println("Year of the rabbit");break;
            case 8 :System.out.println("Year of the dragon");break;
            case 9 :System.out.println("Year of the snake");break;
            case 10 :System.out.println("Year of the horse");break;
            case 11 :System.out.println("Year of the sheep");break;
            default:System.out.println("Invaild year entered");break;       
        }
        
        
        
        
        
        
        
    }
    
}
