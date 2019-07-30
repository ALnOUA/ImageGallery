package model.factories;

import model.Interfaces.Image;
import model.entity.PngImage;

import java.time.LocalDateTime;

public class PngImagesFactory extends AbstractImagesFactory implements Image {
    public PngImage create(long size, String tag, String name, String quality, LocalDateTime dateOfChanges){
        return new PngImage( size, tag,name,quality, dateOfChanges);

    }
}
