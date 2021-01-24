package it.unimol.sokoban.World;

import it.unimol.sokoban.Player.Actor;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**Classe che crea l'area dove posizionare le pedine
 * @author Iannuccillo Antonio
 * @version 1.0
 * **/
public class Area extends Actor {

    public Area(int x, int y) {
        super(x, y);

        initArea();
    }

    /** Metodo che crea l'area dove devono posizionarsi tutte le pedine **/
    private void initArea() {
        try{
            InputStream in = getClass().getResourceAsStream("/area.png");
            BufferedImage image = ImageIO.read(in);
            setImage(image);
        }catch (IOException e){

        }
    }
}
