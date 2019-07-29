package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class AbstractImage {

    private long size;
    private String tag;
    private String name;
    private String quality;
    private String dateOfChanges;

  /*  enum Quality{
        LOW("input.quality.low"), MEDIUM("input.quality.medium"), HIGH("input.quality.high"), ULTRA("input.quality.ultra");
        String quality;
        Quality(String quality){
            this.quality=quality;
        }
    }*/

    public AbstractImage(long size, String tag, String name, String quality, String dateOfChanges) {
        this.size = size;
        this.tag = tag;
        this.name = name;
        this.quality = quality;
        this.dateOfChanges = dateOfChanges;
    }

    @Override
    public String toString() {
        return "AbstractImage{" +
                "size=" + size +
                ", tag='" + tag + '\'' +
                ", name='" + name + '\'' +
                ", quality='" + quality + '\'' +
                ", dateOfChanges='" + dateOfChanges + '\'' +
                '}';
    }
}
