package by.epam.task1;

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
* Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.*/

public class Main {
    public static void main(String[] args) {
    	Directory directory = new Directory("C:/Adobe/Photoshope.exe");
		directory.addFile(new File("artas.ру"));
		directory.addFile(new TextFile("oven.txt"));
		directory.getFileByName("artas.py").add("lol");
		directory.getFileByName("oven.txt").add("aaLL");
		System.out.println(directory.getFileByName("artas.py").output());
		System.out.println(directory.getFileByName("oven.txt").output());
		directory.createFile("oven.txt");
}
}