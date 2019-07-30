package model.entity;

import model.Interfaces.Image;
import model.Interfaces.SlideShowable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class SlideShow implements SlideShowable {
    List<Image> slideShow = new ArrayList<>();

    public List<Image> getSlideShow() {
        return this.slideShow;

    }

    public List<AbstractImage> sortImagesBySize(List<AbstractImage> slideShow) {
        slideShow.sort((o1, o2) -> (int) (o1.getSize() - o2.getSize()));
        return slideShow;
    }

    public List<AbstractImage> sortImagesByTag(List<AbstractImage> slideshow) {
        slideshow.sort(comparing(AbstractImage::getTag));
        return slideshow;

    }

    public List<AbstractImage> sortImagesByDateOfChanges(List<AbstractImage> slideshow) {
        slideshow.sort(comparing(AbstractImage::getDateOfChanges));
        return slideshow;
    }

}
