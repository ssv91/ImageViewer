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
    
     @Override
    public int getWidth() {
        return bufferedImage.getWidth();
    }

    @Override
    public int getHeight() {
        return bufferedImage.getHeight();
    }
}
