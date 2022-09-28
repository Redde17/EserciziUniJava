//Scrivere un programma che date tre stringhe inserite a linea di
//comando visualizza la concatenazione delle loro iniziali.

public class Main {
    public static void main(String[] args) {
        String newStr = "";

        for (String str: args) {
            System.out.println("str: " + str);
            newStr = newStr.concat(str.substring(0, 1));
        }

        System.out.println("\nOutput: " + newStr);
    }
}