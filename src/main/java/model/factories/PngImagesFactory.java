package model.factories;

import model.Interfaces.Image;
import model.PngImage;

public class PngImagesFactory extends AbstractImagesFactory implements Image {
    public PngImage create(long size, String tag, String name, String quality, String dateOfChanges){
        return new PngImage( size, tag,name,quality, dateOfChanges);

    }
}
