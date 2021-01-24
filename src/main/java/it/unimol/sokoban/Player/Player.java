package it.unimol.sokoban.Player;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**Classe che crea e gestisce un sokoban
 * @author Iannuccillo Antonio
 * @version 1.0
 * **/
public class Player extends Actor {

    public Player(int x, int y) {
        super(x, y);

        initPlayer();
    }

    /**Metodo che inizializza il giocatore settandone l'immagine
     * **/
    private void initPlayer() {
        /** L'oggetto conterrà l'immagine del sokoban **/
        try{
            InputStream in = getClass().getResourceAsStream("/sokoban.png");
            BufferedImage image = ImageIO.read(in);
            setImage(image);
        }catch (IOException e){

        }
    }

    /** Metodo che setta i movimenti di una giocatore
     * @param x posizione del sokoban
     * @param y posizione dell sokoban**/
    public void move(int x, int y) {

        /*Lo spostamento del sokoban sarà dato dalla somma della x della classe attore
         * più la x del sokoban. Di quanti passi si muove */
        int dx = getX() + x;
        int dy = getY() + y;

        setX(dx);
        setY(dy);
    }
}
