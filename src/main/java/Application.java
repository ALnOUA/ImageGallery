import controller.Controller;
import controller.InputImage;
import model.AbstractImage;
import model.Model;
import model.SlideShow;
import model.factories.AbstractImagesFactory;
import model.factories.PngImagesFactory;
import view.View;

public class Application {
    public static void main(String[] args) {

        Controller controller =
                new Controller(new Model(), new View());
        // Run
        controller.processUser();
       




    }
}
