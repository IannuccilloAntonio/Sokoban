package it.unimol.sokoban.Player;

import it.unimol.sokoban.Player.Actor;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

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
        try{
        InputStream in = getClass().getResourceAsStream("/baggage.png");
        BufferedImage image = ImageIO.read(in);
        setImage(image);
        }catch (IOException e){

        }
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
