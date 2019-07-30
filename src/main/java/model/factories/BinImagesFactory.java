package model.factories;

import model.entity.BinImage;
import model.Interfaces.Image;

import java.time.LocalDateTime;

public class BinImagesFactory implements Image {
    public BinImage create(long size, String tag, String name, String quality, LocalDateTime dateOfChanges){
        return new BinImage( size, tag,name,quality, dateOfChanges);

    }
}
