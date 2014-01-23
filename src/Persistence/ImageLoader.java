package Persistence;

import Model.BitMap;
import Model.Image;
import Model.RealImage;
import UserInterface.SwingBitMap;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader {
    private final String fileName;

   ImageLoader(String fileName) {
        this.fileName = fileName;
    }
    public Image load() throws IOException{
            System.out.println(fileName);
            return new RealImage(loadBitmap());
    }

    private BitMap loadBitmap() throws IOException{
        return new SwingBitMap(loadBufferedImage());
    }

    private BufferedImage loadBufferedImage() throws IOException {
        return ImageIO.read(new File(fileName));
    }
}
