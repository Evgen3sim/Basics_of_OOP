package by.epam.task5_2.textFormatter;

import java.util.ArrayList;

import by.epam.task5_2.entity.Packaging;
import by.epam.task5_2.entity.Sweets;

public class Formatter {

    public static String formatSweets(ArrayList<Sweets> sweets){
        String str = " ";
        for (int i = 0; i < sweets.size(); i ++){
            str += sweets.get(i) + " \n ";
        }
        return str;
    }

    public static String formatPackaging(ArrayList<Packaging> packagings){
        String str = " ";
        for (int i = 0; i < packagings.size(); i++){
            str += packagings.get(i) + " \n ";
        }
        return str;
    }
}
