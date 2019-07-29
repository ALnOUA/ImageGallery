package controller;

import model.AbstractImage;
import model.Interfaces.Image;
import model.Model;
import model.SlideShow;
import view.View;

import java.util.*;

import static view.Constants.INPUT_FORMAT;

public class Controller {


    private Model model;
    private View view;
    private ArrayList<Image> slideShow;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
     public void menuOptions(Scanner sc){
         view.printMenu();
         String decision = sc.nextLine();
         InputImage inputImage = new InputImage(view,sc);
         SlideShow slideShow = new SlideShow();

        switch (decision){
            case "1":
                view.printMessage(INPUT_FORMAT);
                String format = sc.next();
                slideShow.addImageToSlideShow(inputImage.inputDataForNewImage(format));
            case "2":// TODO: 29.07.2019   break;
            case "3":
                slideShow.show(slideShow.getSlideShow());
                break;
            case "4":// TODO: 29.07.2019
                break;
            default: view.printMessage("Somthing goes wrong");


        }


     }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        view.printMessage("Start\n");
        menuOptions(sc);




    }

}