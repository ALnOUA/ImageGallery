package model;

import model.Interfaces.Image;

public class PngImage extends AbstractImage implements Image {

    public PngImage(long size, String tag, String name, String quality, String dateOfChanges) {
        super(size, tag, name, quality, dateOfChanges);
    }

}
