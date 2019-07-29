package model.factories;

import model.Interfaces.Image;
import model.JpgImage;
import model.PngImage;

import java.util.Date;

public class JpgImagesFactory implements Image {
    public JpgImage create(long size, String tag, String name, String quality, String dateOfChanges){
        return new JpgImage( size, tag,name,quality, dateOfChanges);

    }
}
