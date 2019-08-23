package by.epam.task4.Logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import by.epam.task4.entity.DragonCave;
import by.epam.task4.entity.Treasure;
import by.epam.task4.view.TextFormatter;

public class Action {
    public static String getMostExpensiveTreasure(DragonCave cave) {
        long max = cave.getTreasureList().get(0).getPrice();
        for (int i = 0; i < cave.getTreasureList().size(); i++) {
            if (cave.getTreasureList().get(i).getPrice() > max) {
                max = cave.getTreasureList().get(i).getPrice();
            }
        }
        for (int i = 0; i < cave.getTreasureList().size(); i++) {
            if (cave.getTreasureList().get(i).getPrice() == max) {
                return cave.getTreasureList().get(i).getName();
            }
        }
        return "There are no treasures in the cave";
    }

    public static String getTreasureByPrice(DragonCave cave, long price) {
        ArrayList<Treasure> newTreasureList = new ArrayList<Treasure>();
        for (int i = 0; i < cave.getTreasureList().size(); i++) {
            if (cave.getTreasureList().get(i).getPrice() == price) {
                newTreasureList.add(cave.getTreasureByName(cave.getTreasureList().get(i).getName()));
            }
        }
        return TextFormatter.format(newTreasureList);
    }

    public static ArrayList<Treasure> treasureGenerator(DragonCave cave) {
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/by/epam/task4/resources/HiddenTresure.txt"));
            while ((line = br.readLine()) != null) {
                cave.addTreasure(new Treasure(line.substring(0, line.lastIndexOf(" ")),
                        Long.parseLong(line.substring(line.lastIndexOf(" ") + 1).trim())));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cave.getTreasureList();
    }

    public static String getTreasureList(DragonCave cave) {
        return TextFormatter.format(cave.getTreasureList());
    }
}
