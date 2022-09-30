//Scrivere un programma che istanzi un oggetto Rectangle e ne
//stampi le caratteristiche.

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rct = new Rectangle();
        Rectangle[] rctSide = new Rectangle[3];

        final int WIDTH = 10,
                  HEIGHT = 20;

        int newX = 5,
            newY = 5;

        rct.setBounds(0,0, WIDTH, HEIGHT);
        System.out.println("Bounds del rettangolo di base: " + rct.getBounds());

        rct.setLocation((int)rct.getX() + newX, (int)rct.getY() + newY);
        System.out.println("Bounds del rettangolo di base spostato: " + rct.getBounds() + "\n");

        //creazione e posizionamento dei rettangoli adiacenti al primo di posizione (5, 5)
        //tutti i rettangoli hanno la stessa dimensione del rettangolo rct
        System.out.println("Rettangoli adiacenti: ");
        for (int i = 0; i < 3; i++) {
            rctSide[i] = new Rectangle();

            int offset = (i + 1) * (int)rct.getWidth();
            rctSide[i].setBounds(offset + newX, newY, (int)rct.getWidth(), (int)rct.getHeight());
            System.out.println("\t" + rctSide[i].getBounds());
        }

        //Stampa dati e calcolo area e perimetro del rettangolo formato
        Rectangle finalRct = new Rectangle();
        finalRct.setBounds(
                (int)rct.getX(),
                (int)rct.getY(),
                getTotalWidth(rct, rctSide),
                (int)rct.getHeight()
        );

        System.out.println("\nBounds del rettangolo formato: " + finalRct.getBounds()
                         + "\nPerimetro: " + (finalRct.getWidth() * 2 + finalRct.getHeight() * 2)
                         + "\nArea: " + finalRct.getWidth() * finalRct.getHeight()
        );
    }

    static int getTotalWidth(Rectangle rct, Rectangle[] rctSide){
        int finalWidth = (int)rct.getWidth();
        for (var rctS: rctSide)
            finalWidth += rctS.getWidth();
        return finalWidth;
    }
}


//(5,5)
//(15,5)
//(25,5)
//(35,5)