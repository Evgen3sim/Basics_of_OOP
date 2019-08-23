package by.epam.task4.Controller;

/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
*/


import java.util.Scanner;

import by.epam.task4.Logic.Action;
import by.epam.task4.entity.DragonCave;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String key = "";
        DragonCave cave = new DragonCave();
        Action.treasureGenerator(cave);
        while (!(key.equals("Y") || key.equals("y"))) {
            System.out.println("1. get treasures list");
            System.out.println("2. get the most expensive treasure");
            System.out.println("3. get treasures for a given price");
            switch (key = scanner.nextLine()) {
                case "1":
                    System.out.println(Action.getTreasureList(cave));
                    break;
                case "2":
                    System.out.println(Action.getMostExpensiveTreasure(cave));
                    break;
                case "3":
                    System.out.println("Input price");
                    System.out.println(Action.getTreasureByPrice(cave, scanner.nextLong()));
                    break;
            }
        }
    }
}
