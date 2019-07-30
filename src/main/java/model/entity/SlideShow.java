package model.entity;

import java.util.List;
import static java.util.Comparator.comparing;

public class SlideShow {
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
