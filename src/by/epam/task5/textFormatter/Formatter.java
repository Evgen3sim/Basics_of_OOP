package by.epam.task5.textFormatter;

import java.util.ArrayList;

import by.epam.task5.entity.Box;
import by.epam.task5.entity.Flower;

public class Formatter {

    public static String flowerFormater(ArrayList<Flower> flowers){
        String str = " ";
        for (int i = 0; i < flowers.size(); i++){
            str += flowers.get(i) + "\n";
        }
        return str;
    }

    public static String boxFormatter(ArrayList<Box> boxes){
        String str = " ";
        for (int i = 0; i < boxes.size(); i++){
            str += boxes.get(i) + "\n";
        }
        return str;
    }
}
