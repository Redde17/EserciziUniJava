//Scrivere un programma che data una stringa inserita a linea di
//comando restituisce il carattere centrale.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input: " + args[0]);

        char middleChar = args[0].charAt(args[0].length() / 2);

        System.out.println("Carattere centrale: " + middleChar);

    }
}