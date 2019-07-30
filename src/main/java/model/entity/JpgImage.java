package model.entity;

import model.Interfaces.Image;

import java.time.LocalDateTime;

public class JpgImage extends AbstractImage implements Image {
    AbstractImage abstractImage;

    public JpgImage(long size, String tag, String name, String quality, LocalDateTime dateOfChanges) {
        super(size, tag, name, quality, dateOfChanges);
    }

}
