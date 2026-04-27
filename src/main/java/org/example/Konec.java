package org.example;

import java.util.Scanner;

public class Konec {

    public static void spatnyKonec(Scanner scanner) {

        scanner.close();
        System.out.println("");
        System.out.println("ŠPATNÝ KONEC");
        System.out.println("");
        System.out.println("Děkuji za dohrání, třeba se ti příště povede lépe");

    }

    public static void dobryKonec(Scanner scanner) {

        scanner.close();
        System.out.println("");
        System.out.println("DOBRÝ KONEC");
        System.out.println("");
        System.out.println("Děkuji za dohrání a gratuluji k výhře :D");
    }
}