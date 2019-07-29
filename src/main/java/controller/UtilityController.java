package controller;

import view.Constants;
import view.View;

import java.util.Scanner;

import static view.Constants.WRONG_INPUT_DATA;

public class UtilityController {

    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;

    }

    String inputValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while (!(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printStringInput(message);
        }
        return res;

    }

}