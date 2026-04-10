package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

//       first I need to set up my scanner
        Scanner scnr = new Scanner(System.in);

        //Now that I've made my scanner let me declare some variables
        String sandwichSize = "";
        int userAge = 0;
        double sandwichPrice = 0;
        double discount = 0;
        double total = 0;


//        Now that I've gone ahead and made these, let me go ahead and ask the user for the values
        System.out.println("What size sandwich do you want? (Press Enter to confirm): ");
        try {
            sandwichSize = scnr.nextLine();

        } catch (InputMismatchException e){
            System.out.println("Excuse me? Can you not waste my time, there's a long line.");
//            Ending the program because the user is being a loser
            System.exit(1);
        }

//        Here I ask for user's age
        System.out.println("How old are you? (Press Enter to confirm): ");
        try{
            userAge = scnr.nextInt();

        } catch (InputMismatchException e){
            System.out.println("Leave or I'm calling the cops.");
//            Once again ending the program, get it together user!
            System.exit(1);
        }

//        Just so I can get it out of the way I'll establish the discount here


        if (userAge >= 18 && userAge < 65){
            discount = 0;
        } else if (userAge <18) {
            discount = .10;
        } else {
            discount = .20;
        }

//        Here I will run a conditional for the sandwichPrice
        if(sandwichSize.equalsIgnoreCase("Regular")){
            sandwichPrice = 5.45;
        } else if (sandwichSize.equalsIgnoreCase("Large")) {
            sandwichPrice = 8.95;
        } else {
            System.out.println("Uhhh that wasn't an option dude");
            return;
        }

//        By now I SHOULD (If i've got a compliant customer) have all the information I need for the calculation, so i'll do that here
        total = sandwichPrice - (sandwichPrice * discount);

        System.out.printf("Thank you for waiting! Here's your sandwich! That'll be $%.2f !", total);


    }
}
