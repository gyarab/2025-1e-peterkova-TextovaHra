package org.example;

import java.util.Scanner;

public class Odpovez {

    public int choice;
    public void Odpovez(Scanner scanner, int step){

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            if (choice == 1) {
                if(step == 1){
                    System.out.println(""); // odpověd na volbu 1 při kroku 1
                }
                else if(step == 2){

                }

            } else if (choice == 2) {
                if(step == 1){
                    System.out.println("");
                    System.out.println("Přečti si znovu text :)");
                }
                else if(step == 2){

                }

            } else {
                System.out.println("Neplatná volba, zkus to znovu.");
            }
        } else {
            System.out.println("Zadej číslo!");
            scanner.next();
        }
    }

}
