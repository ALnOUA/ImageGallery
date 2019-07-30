package controller;

import model.Interfaces.Image;
import model.Model;
import model.entity.AbstractImage;
import model.entity.Menu;
import model.entity.MenuEntry;
import model.entity.SlideShow;
import model.service.CreateMenuService;
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


    public void processUser() {
        Scanner sc = new Scanner(System.in);
        view.printMessage("Start\n");
        CreateMenuService createMenuService= new CreateMenuService();
        Menu menu = createMenuService.createMenu();
        menu.process();





    }

}