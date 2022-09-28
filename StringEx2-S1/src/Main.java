//Scrivere un programma che data una stringa di almeno 2
//caratteri, ne costruisca un’altra dove il primo carattere è
//scambiato con l’ultimo, che viene poi stampata a video.
public class Main {
    public static void main(String[] args) {
        String str = "parola";
        String newStr;

        if(str.length() >= 2) {
            newStr = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
            System.out.println(newStr);
        }else
            System.out.println("Stringa troppo corta");
    }
}