package model.entity;

import model.Interfaces.Image;

import java.time.LocalDateTime;

public class PngImage extends AbstractImage implements Image {

    public PngImage(long size, String tag, String name, String quality, LocalDateTime dateOfChanges) {
        super(size, tag, name, quality, dateOfChanges);
    }

}
