package model.entity;

import model.Interfaces.Image;

import java.time.LocalDateTime;
public class BinImage extends AbstractImage implements Image {
    public BinImage(long size, String tag, String name, String quality, LocalDateTime dateOfChanges) {
        super(size, tag, name, quality, dateOfChanges);
    }
}
