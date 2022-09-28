//Scrivere un programma che stampi il carattere centrale di una stringa.

public class Main {
    public static void main(String[] args) {
        String str = "parola";

        char middleChar = str.charAt(str.length() / 2);

        System.out.println(middleChar);
    }
}
