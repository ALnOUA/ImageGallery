package model.Interfaces;

import java.util.ArrayList;

public interface SlideShowable {
    ArrayList<Image> addImageToSlideShow(Image image);
    void show(ArrayList<Image> slideShow);


}
