package model;

import model.Interfaces.Image;

public class JpgImage extends AbstractImage implements Image {
    AbstractImage abstractImage;

    public JpgImage(long size, String tag, String name, String quality, String dateOfChanges) {
        super(size, tag, name, quality, dateOfChanges);
    }

}
