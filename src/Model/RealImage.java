package Model;

public class RealImage extends Image {
    
    private final BitMap bitmap;
    private Image prevImage;
    private Image nextImage;

    public RealImage(BitMap bitmap) {
        this.bitmap = bitmap;
    }

    @Override
    public BitMap getBitmap() {
        return bitmap;
    }

    @Override
    public Image getNext() {
        return nextImage;
    }

    @Override
    public Image getPrev() {
        return prevImage;
    }

    @Override
    public void setNext(Image image) {
        nextImage = image;
    }

    @Override
    public void setPrev(Image image) {
        prevImage = image;
    }
}