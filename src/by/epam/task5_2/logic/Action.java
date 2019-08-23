package by.epam.task5_2.logic;

import by.epam.task5_2.entity.Gift;
import by.epam.task5_2.entity.Packaging;
import by.epam.task5_2.entity.Sweets;
import by.epam.task5_2.textFormatter.Formatter;

public class Action {

    public static String getPackaging(Gift gift){
        return Formatter.formatPackaging(gift.getPackagings());
    }

    public static void addPackaging(Gift gift, String type){
        if (type.matches("^[a-zA-Z0-9]+$")){
            gift.addPackagings(new Packaging(type));
        } else
        {
            throw new IllegalArgumentException("only Latin characters are allowed");
        }
    }

    public static void addSweetsToPackaging(Gift gift, String type, String sweetsName){
        if (type.matches("^[a-zA-Z0-9]+$") && sweetsName.matches("^[a-zA-Z0-9]+$")){
            gift.getPackingingByType(type).addSweets(new Sweets(sweetsName));
        }
        else
        {
            throw new IllegalArgumentException("only Latin characters are allowed");
        }
    }

    public static String getSweet(Gift gift, String type){
        if (!(type.matches("^[a-zA-Z0-9]+$"))){
            throw new IllegalArgumentException("only Latin characters are allowed");
        }
        return Formatter.formatSweets(gift.getPackingingByType(type).getSweets());
    }

}
