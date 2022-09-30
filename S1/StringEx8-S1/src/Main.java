public class Main {
    public static void main(String[] args) {
        StringBuilder strb = new StringBuilder();
        strb.append("Hello World!");

        for (int i = 0; i < strb.length(); i++) {
            if(strb.charAt(i) == 'e')
                strb.setCharAt(i, 'o');
            else if (strb.charAt(i) == 'o')
                strb.setCharAt(i, 'e');
        }

        System.out.println(strb);
    }
}