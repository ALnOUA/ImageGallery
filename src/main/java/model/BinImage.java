package model;

import lombok.Getter;
import lombok.Setter;
import model.Interfaces.Image;

@Setter
@Getter
public class BinImage extends AbstractImage implements Image {
    public BinImage(long size, String tag, String name, String quality, String dateOfChanges) {
        super(size, tag, name, quality, dateOfChanges);
    }
}
