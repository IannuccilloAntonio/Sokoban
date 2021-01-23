package it.unimol.sokoban.Player;

import javax.swing.*;
import java.awt.*;

/**Classe che crea e gestisce una pedina
 * @author Iannuccillo Antonio
 * @version 1.0
 * **/
public class Baggage extends Actor {


    public Baggage(int x, int y) {
        super(x, y);

        initBaggage();
    }
    /**Metodo che inizializza una pedina settandone l'immagine
     * **/
    private void initBaggage() {
        ImageIcon iicon = new ImageIcon("src/main/java/resources/baggage.png");
        Image image = iicon.getImage();
        setImage(image);
    }

    /** Metodo che setta i movimenti di una pedina
     * @param x posizione della pedina
     * @param y posizione della pedina**/
    public void move(int x, int y) {

        int dx = getX() + x;
        int dy = getY() + y;

        setX(dx);
        setY(dy);
    }
}
