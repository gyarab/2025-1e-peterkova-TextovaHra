package org.example;

import java.util.Scanner;

public class Konec {

    public static void spatnyKonec(Scanner scanner) {

        scanner.close();
        System.out.println("");
        System.out.println("ŠPATNÝ KONEC");
    }

    public static void dobryKonec(Scanner scanner) {

        scanner.close();
        System.out.println("");
        System.out.println("DOBRÝ KONEC");
    }
}