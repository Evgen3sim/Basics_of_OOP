package by.epam.task5_2.controller;

/*Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок).
 Составляющими целого подарка являются сладости и упаковка.*/

import java.util.Scanner;

import by.epam.task5_2.entity.Gift;
import by.epam.task5_2.logic.Action;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = " ";
        int num;
        Gift gift = new Gift();
        while (!(str.equals("Y") || str.equals("y"))){
            System.out.println("1. get packaging");
            System.out.println("2. get sweets");
            System.out.println("3. add packaging");
            System.out.println("4. add sweet to packaging");
            switch (str = scn.nextLine()){
                case "1":
                    System.out.println(gift.getPackagings());
                 
                        break;
                case "2":
                    System.out.println("Enter the type of box for which you want to get a list of sweets");
                    System.out.println(Action.getSweet(gift, scn.nextLine()));
                   
                    break;
                case "3":
                    System.out.println("Input packaging type");
                    Action.addPackaging(gift, scn.nextLine());
                   
                    break;
                case "4":
                    System.out.println("Enter the type of box in which you want to add the sweet, then the name of the sweet");
                    Action.addSweetsToPackaging(gift, scn.nextLine(), scn.nextLine());
                  
            }
         }
    }
}
