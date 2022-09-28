public class Main {
    public static void main(String[] args) {
        String str = "parola";

        String newStr = str.substring(0,1).toUpperCase() + str.substring(1, str.length());

        System.out.println("Input: " + str);
        System.out.println("Output: " + newStr);
    }
}