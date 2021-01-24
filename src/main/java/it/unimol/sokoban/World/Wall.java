package it.unimol.sokoban.World;

import it.unimol.sokoban.Player.Actor;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**Classe che crea un muro
 * @author Iannuccillo Antonio
 * @version 1.0
 * **/
public class Wall extends Actor {



    public Wall(int x, int y) {
        super(x, y);

        initWall();
    }
    /**Metodo che inizializza una muro settandone l'immagine
     * **/
    private void initWall() {
        try{
            InputStream in = getClass().getResourceAsStream("/wall.png");
            BufferedImage image = ImageIO.read(in);
            setImage(image);
        }catch (IOException e){

        }
    }
}
