package by.epam.task4.view;

import java.util.ArrayList;

import by.epam.task4.entity.Treasure;

public class TextFormatter {
    public static String format(ArrayList<Treasure> treasureList) {
        String str = "";
        for (int i = 0; i < treasureList.size(); i++) {
            str += treasureList.get(i) + "\n";
        }
        return str;
    }
}
