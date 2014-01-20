package UserInterface;

import Model.BitMap;
import java.awt.image.BufferedImage;


public class SwingBitMap implements BitMap {
    private BufferedImage bufferedImage;
 
    public SwingBitMap(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }
 
    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }
}
