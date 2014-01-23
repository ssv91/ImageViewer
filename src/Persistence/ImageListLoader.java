package Persistence;

import Model.Image;
import java.util.List;
import java.io.File;
import java.util.ArrayList;

public class ImageListLoader {
     private final String url;

    public ImageListLoader(String url) {
        this.url = url;
    }

   
    public List<Image> load() {
        return linkImages(loadImages());
    }

    private List<Image> loadImages() {
        List<Image> list = new ArrayList<>();
        for (Object file : new File(url).list()) {
            list.add(new ProxyImage(new ImageLoader(url + "/" + file)));
        }
        return list;
    }

    private List<Image> linkImages(List<Image> images) {
        for (int i = 0; i < images.size(); i++) {
            Image image = images.get(i);
            image.setNext(images.get((i+1) % images.size()));
            image.setPrev(images.get((i+images.size()-1) % images.size()));
        }
        return images;
    }
}
