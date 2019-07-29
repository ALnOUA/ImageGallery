package model.factories;

import model.BinImage;
import model.Interfaces.Image;
import model.PngImage;

import java.util.Date;

public class BinImagesFactory implements Image {
    public BinImage create(long size, String tag, String name, String quality, String dateOfChanges){
        return new BinImage( size, tag,name,quality, dateOfChanges);

    }
}
