package model.factories;

import model.Interfaces.Image;


public class AbstractImagesFactory {
    public Image createImage(String format,long size, String tag, String name, String quality, String dateOfChanges) {
        switch (format) {
            case "Png":
                System.out.println("AbstractFac");
              return new PngImagesFactory().create(size, tag, name, quality, dateOfChanges);
            case "Jpg":
                return new JpgImagesFactory().create(size, tag, name, quality, dateOfChanges);
            case "Bin":
                return  new BinImagesFactory().create(size, tag, name, quality, dateOfChanges);

            default: return null;
        }
    }
}
