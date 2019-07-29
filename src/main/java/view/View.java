package view;

import java.util.Locale;
import java.util.ResourceBundle;

import static view.Constants.INPUT_STRING_DATA;
import static view.Constants.WRONG_INPUT_DATA;

public class View {
    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "resources";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian

    //Utilities methods

    /**
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * @param message
     * @return
     */
    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
    public void printMenu(){
        printMessage("1.Add new image");
        printMessage("2.Delete image ( Not avaible at this moment )");
        printMessage("3.Display slide show");
        printMessage("4.Show images by size");
        // TODO: 28.07.2019

    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

}