package by.epam.task5.logic;

import by.epam.task5.entity.Box;
import by.epam.task5.entity.Flower;
import by.epam.task5.entity.FlowerComposition;
import by.epam.task5.textFormatter.Formatter;

public class Action {

    public static void addBox(FlowerComposition flowerComposition, String name){
        if (name.matches("^[a-zA-Z0-9]+$")){
            flowerComposition.addBox(new Box(name));
        } else
        {
            throw  new IllegalArgumentException("only latin characters");
        }
    }

    public static String getBox(FlowerComposition flowerComposition){
        return Formatter.boxFormatter(flowerComposition.getBoxes());
    }

    public static void addFlowersToBox(FlowerComposition flowerComposition, String name, String nameFlower, String colorFlower){
        if (name.matches("^[a-zA-Z0-9]+$") && nameFlower.matches("^[a-zA-Z0-9]+$") && colorFlower.matches("^[a-zA-Z0-9]+$")){
            flowerComposition.getBoxByName(name).addFlower(new Flower(nameFlower, colorFlower));
        } else
        {
            throw new IllegalArgumentException("only latin character");
        }
    }

    public static String getFlowers(FlowerComposition flowerComposition, String name){
        if (!(name.matches("^[a-zA-Z0-9]+$"))){
            throw new IllegalArgumentException("only latin characters");
        }
        return Formatter.flowerFormater(flowerComposition.getBoxByName(name).getFlowers());
    }

}
