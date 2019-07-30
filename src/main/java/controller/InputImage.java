package controller;

import lombok.Getter;
import model.entity.AbstractImage;
import model.factories.AbstractImagesFactory;
import view.View;

import java.time.LocalDateTime;
import java.util.Scanner;

import static controller.RegexContainer.*;
import static view.Constants.*;
@Getter
public class InputImage {

    private View view;
    private Scanner sc;

    private long size;
    private String tag;
    private String name;
    private String quality;
    private LocalDateTime dateOfChanges;

    public InputImage(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;

    }

    public AbstractImage inputDataForNewImage(String format) {
        UtilityController utilityController = new UtilityController(sc, view);
        AbstractImagesFactory abstractImagesFactory = new AbstractImagesFactory();

        size = Long.parseLong(utilityController.inputValueWithScanner(INPUT_SIZE, REGEX_SIZE));
        tag = utilityController.inputValueWithScanner(INPUT_TAG, REGEX_NAME);
        name = utilityController.inputValueWithScanner(INPUT_NAME, REGEX_NAME);
        quality = utilityController.inputValueWithScanner(INPUT_QUALITY, REGEX_NAME);
        dateOfChanges = LocalDateTime.now();
        return  abstractImagesFactory.createImage(format,size,tag,name,quality,dateOfChanges);
    }
}