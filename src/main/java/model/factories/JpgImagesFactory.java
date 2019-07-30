package model.factories;

import model.Interfaces.Image;
import model.entity.JpgImage;

import java.time.LocalDateTime;

public class JpgImagesFactory implements Image {
    public JpgImage create(long size, String tag, String name, String quality, LocalDateTime dateOfChanges){
        return new JpgImage( size, tag,name,quality, dateOfChanges);

    }
}
