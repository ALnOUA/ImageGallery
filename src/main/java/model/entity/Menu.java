package model.entity;

import controller.InputImage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static view.Constants.INPUT_FORMAT;

public class Menu {
    private static final String MENU_PATTERN = "%s - %s\n";
    private List<MenuEntry> entries = new ArrayList<MenuEntry>();
    private boolean isExit = false;

    public Menu() {
        entries.add(new MenuEntry("Exit") {
            @Override
            public void process() {
                isExit = true;
            }
        });
    }

    public void process() {
        while (!isExit) {
            printMenu();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String line = reader.readLine();
                int choice = Integer.parseInt(line);
                MenuEntry entry = entries.get(choice - 1);
                entry.process();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Menu addEntry(MenuEntry entry) {
        int index = entries.size() - 1;
        entries.add(index, entry);
        return this;
    }

    private void printMenu() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nMenu:\n");
        for (int i = 0; i < entries.size(); i++) {
            MenuEntry entry = entries.get(i);
            String entryFormatted = String.format(MENU_PATTERN, (i + 1), entry.getTitle());
            buffer.append(entryFormatted);
        }
        System.out.print(buffer.toString());
    }
}