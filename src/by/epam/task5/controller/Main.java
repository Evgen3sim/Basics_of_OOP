package by.epam.task5.controller;

import java.util.Scanner;

import by.epam.task5.entity.FlowerComposition;
import by.epam.task5.logic.Action;

/*Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.*/

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = " ";
        FlowerComposition flowerComposition = new FlowerComposition();
        while (!(str.equals("Y") || str.equals("y"))){
            System.out.println("1. add box");
            System.out.println("2. add flower to box");
            System.out.println("3. get box");
            System.out.println("4. get flowers to box");
            switch (str = scn.nextLine()){
                case "1":
                    System.out.println("Input name box");
                    Action.addBox(flowerComposition, scn.nextLine());
                 
                    break;
                case "2":
                    System.out.println("Enter the type of box in which you want to add the flower, then the name and color of the flower");
                    Action.addFlowersToBox(flowerComposition, scn.nextLine(), scn.nextLine(), scn.nextLine());
                    
                case "3":
                    System.out.println(Action.getBox(flowerComposition));
                    
                    break;
                case "4":
                    System.out.println("Enter the type of box for which you want to get a list of flowers");
                    System.out.println(Action.getFlowers(flowerComposition, scn.nextLine()));
                    
                    break;
            }
        }

    }
}
