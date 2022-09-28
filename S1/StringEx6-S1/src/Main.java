//Scrivere un programma che data una stringa s controlla se
//il primo carattere di s è ripetuto nella stringa stampando la
//posizione in cui è ripetuto o -1.

public class Main {
    public static void main(String[] args) {
        String s =
                "parola";
//                "peppe";

        int pos = s.substring(1, s.length()).indexOf(s.charAt(0)) + 1;

        if(pos == 0)
            System.out.println("Posizione: -1");
        else
            System.out.println("Poszione: " + pos);
    }
}