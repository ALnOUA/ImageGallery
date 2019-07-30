package controller;

import model.entity.AbstractImage;
import model.entity.Menu;
import model.service.CreateMenuService;
import view.View;

public class Controller {


    private AbstractImage image;
    private View view;

    public Controller(AbstractImage image, View view) {
        this.image = image;
        this.view = view;
    }


    public void processUser() {
        CreateMenuService createMenuService= new CreateMenuService();
        Menu menu = createMenuService.createMenu();
        menu.process();





    }

}