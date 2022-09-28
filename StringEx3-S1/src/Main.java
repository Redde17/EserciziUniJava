//Scrivere un programma che data una stringa di almeno 2 caratteri,
//divida la stringa in due parti della stessa dimensione e poi le inverta

public class Main {
    public static void main(String[] args) {
        String str = "parola";

        int middle = str.length() / 2;
        if(str.length() >= 2) {
            String newStr = str.substring(middle, str.length()) + str.substring(0, middle);
            System.out.println(newStr);
        }else
            System.out.println("Stringa troppo corta");

    }
}