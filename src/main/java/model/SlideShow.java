package model;

import model.Interfaces.Image;
import model.Interfaces.SlideShowable;

import java.util.ArrayList;

public class SlideShow implements SlideShowable {
    ArrayList<Image> slideShow = new ArrayList<>();
    @Override
    public ArrayList<Image> addImageToSlideShow(Image image) {
        this.slideShow.add(image);
        return this.slideShow;
    }
    public ArrayList<Image> createSlideShow(){
        ArrayList<Image> slideShow = new ArrayList<>();
        return  slideShow;
    }
    public ArrayList<Image> getSlideShow(){
        return this.slideShow;

    }

    public void show(ArrayList<Image> slideShow) {
        slideShow.forEach(slideShows-> System.out.println(slideShows));



    }
}
