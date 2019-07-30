package model.service;

import controller.InputImage;
import model.entity.AbstractImage;
import model.entity.Menu;
import model.entity.MenuEntry;
import model.entity.SlideShow;
import view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static view.Constants.*;

public class CreateMenuService {
    Scanner sc = new Scanner(System.in);
    SlideShow slideShow = new SlideShow();
    List<AbstractImage> listOfImages = new ArrayList<AbstractImage>();
    private View view= new View();

    public Menu createMenu() {
       Menu menu = new Menu();
       menu.addEntry(new MenuEntry(ADD_NEW_IMAGE) {


           @Override
           public void process() {
               InputImage inputImage = new InputImage(view,sc);
               view.printMessage(INPUT_FORMAT);
                String format = sc.next();
               listOfImages.add(inputImage.inputDataForNewImage(format));
           }
       });
       menu.addEntry(new MenuEntry(VIEW_SLIDE_SHOW) {
           @Override
           public void process() {
               for (int i = 0; i < listOfImages.size(); i++) {
                   System.out.println(listOfImages.get(i));
               }
           }
       });
       menu.addEntry(new MenuEntry(VIEW_SORTED_SLIDE_SHOW_BY_SIZE) {
           @Override
           public void process() {
               slideShow.sortImagesBySize(listOfImages);
               for (int i = 0; i < listOfImages.size(); i++) {
                   System.out.println(listOfImages.get(i));
               }
           }
       });
       menu.addEntry(new MenuEntry(VIEW_SORTED_SLIDE_SHOW_BY_TAG) {
           @Override
           public void process() {
               slideShow.sortImagesByTag(listOfImages);
               for (int i = 0; i < listOfImages.size(); i++) {
                   System.out.println(listOfImages.get(i));
               }
           }
       });
       menu.addEntry(new MenuEntry(VIEW_SORTED_SLIDE_SHOW_BY_DATE_OF_CHANGES) {
           @Override
           public void process() {
               slideShow.sortImagesByDateOfChanges(listOfImages);
               for (int i = 0; i < listOfImages.size(); i++) {
                   System.out.println(listOfImages.get(i));
               }
           }
       });

       return menu;
   }

}
