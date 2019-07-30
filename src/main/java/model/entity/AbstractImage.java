package model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@NoArgsConstructor
@Setter
@Getter
public abstract class AbstractImage {

    private long size;
    private String tag;
    private String name;
    private String quality;
    private LocalDateTime dateOfChanges;

    public LocalDateTime getDateOfChanges() {
        return dateOfChanges;
    }

    public AbstractImage(long size, String tag, String name, String quality, LocalDateTime dateOfChanges) {
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
