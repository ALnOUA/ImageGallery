import controller.Controller;
import model.entity.AbstractImage;
import view.View;

public class Application {
    public static void main(String[] args) {

        Controller controller =
                new Controller(new AbstractImage() {
                }, new View());
        // Run
        controller.processUser();
       




    }
}
