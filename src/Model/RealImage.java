package Model;

public class RealImage extends Image {
    
    private final BitMap bitmap;
    private final Dimension dimension;

    public RealImage(BitMap bitmap, Dimension dimension) {
        this.bitmap = bitmap;
        this.dimension = dimension;
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public BitMap getBitmap() {
        return bitmap;
    }

    @Override
    public Image getNext() {
        return null;
    }

    @Override
    public Image getPrev() {
        return null;
    }

    @Override
    public void setNext(Image image) {
    }

    @Override
    public void setPrev(Image image) {
    }
}